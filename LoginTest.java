class LoginTest 
{
	public int isMember(String id,String pwd){
		int re=-1;
		if(id.eqauls("tiger") && pwd.equals("1234")){
			re = 1;
		}
		return re;
	}
}
