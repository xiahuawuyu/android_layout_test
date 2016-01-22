
/** 下拉刷新视图 */
	private RefreshViewPD refresh_view;
	/** 分页器 */
	public Pager pager = new Pager(10);




// 开启上拉加载更多、下拉刷新
refresh_view =(RefreshViewPD) findViewById(R.id.refresh_view);
refresh_view.openPullUp();
refresh_view.openPullDown();
refresh_view.setListViewScrollListener(listdull);

// 设置下拉刷新监听器
refresh_view.addOnSnapListener(new RefreshViewPD.OnSnapListener() {
	@Override
	public void onSnapToTop(int distance) {
		// 下拉刷新, 重新加载第一页
		pager.setFirstPage();
		getBulletinList();
	}

	@Override
	public void onSnapToBottom(int distance) {
		// 上拉加载更多
		getBulletinList();
	}
});