@WebServlet({ "/RemoveServlet", "/remove" })
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Ctrl ctrl; // 멤버 변수 선언

	public RemoveServlet() {
		ctrl = new CtrlImpl(); // 사용. 다형성
	}
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		VO user = (VO) session.getAttribute("id");
		System.out.println("user: "+user);
		System.out.println("user.getId(): "+user.getId());
		String dbId = (String) user.getId();
		String dbPwd = (String) user.getPwd();
		
		System.out.println("dbId: " + dbId);
		System.out.println("dbPwd: " + dbPwd);

		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//session.setAttribute("id", id);
		//session.setAttribute("pwd", pwd);
		
		System.out.println("id: " + id);
		System.out.println("pwd: " + pwd);
		
		if(id.equals(dbId) && pwd.equals(dbPwd)){
			int deleteFlag = ctrl.remove(id);
			System.out.println("deleteFlag: " + deleteFlag);
			System.out.println("Success remove");
		}else{
			System.out.println("Fail...Retry");
		}
		
		response.sendRedirect("main.jsp");
	}


}