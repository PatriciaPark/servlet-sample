public interface Dao {
	public int insertRow(Object obj);
	public int updateRow(Object obj);
	public int deleteRow(Object obj);
	public Object searchRow(Object obj);
	public ArrayList<Object> selectRow();
}