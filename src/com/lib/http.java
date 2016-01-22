


HashMap<String, String> map =new HashMap<String, String>();
map.put("bulletinId", bulletinId);
map.put("userId", App.getInstance().getUser().userId);
IndexService.getInstance().getBulletinDetials(map,new ServiceCallback<CommonResult<GGEntity>>() {
	
	@Override
	public void error(String msg) {
		hideProgressDialog();
		isHaveData(false);
		toast(msg);
		
	}
	
	@Override
	public void done(int what, CommonResult<GGEntity> obj) {
		hideProgressDialog();
		if(null!=obj.data){
			isHaveData(true);
			setData(obj.data);
		}
		
	}
});