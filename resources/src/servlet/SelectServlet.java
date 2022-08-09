@WebServlet({ "/SelectServlet", "/select" })
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Ctrl ctrl; // 멤버 변수 선언

	public SelectServlet() {
		ctrl = new CtrlImpl(); // 사용. 다형성
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		VO result = (VO) ctrl.find(id);
		System.out.println("id: "+result.getId());
		
		request.setCharacterEncoding("UTF-8"); 
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("selectResult.jsp");
		rd.forward(request, response);
		
	}

}