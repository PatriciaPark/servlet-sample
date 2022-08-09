@WebServlet({ "/UpdateServlet", "/update" })
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Ctrl ctrl; // 멤버 변수 선언

	public UpdateServlet() {
		ctrl = new CtrlImpl(); // 사용. 다형성
	}
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int num = Integer.parseInt(request.getParameter("num"));
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		name = new String(name.getBytes("8859_1"), "utf-8");
		System.out.println(name);
		float data1 = Float.parseFloat(request.getParameter("data1"));
		float data2 = Float.parseFloat(request.getParameter("data2"));
		float data3 = Float.parseFloat(request.getParameter("data3"));
		
		Object obj = new VO(id, pwd, name, data1, data2, data3);
		
		int flag = ctrl.modify(obj);
		if (flag != 0) {
			System.out.println("Success update");
		} else {
			System.out.println("Fail...Retry");
		}
		
		response.sendRedirect("main.jsp");
	}

}