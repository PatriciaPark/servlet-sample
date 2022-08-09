@WebServlet({ "/ListServlet", "/list" })
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Ctrl ctrl; // 멤버 변수 선언

	public ListServlet() {
		ctrl = new CtrlImpl(); // 사용. 다형성
	}
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Object> list = ctrl.opt();
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		request.setAttribute("list", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
		rd.forward(request, response);
		
	}


}