



//drawableRight  drawableLeft
tv_collect.setCompoundDrawablesWithIntrinsicBounds(R.drawable.activity_collecton, 0, 0, 0);


//imageLoder
ImageLoader.getInstance().displayImage(url, img_bg,  App.getInstance().getBigImageOptions());




//设置宽高
int w = App.getInstance().getScreenWidth();
int h = (440*w)/700;
iv_bg.setLayoutParams(new LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,h));


//设置字体颜色
tv_regconditions.setTextColor(getResources().getColor(R.color.property_titleone_color));



//控件  监听返回键

mWebView.setOnKeyListener(new View.OnKeyListener() {    
		          @Override    
		          public boolean onKey(View v, int keyCode, KeyEvent event) {    
		              if (event.getAction() == KeyEvent.ACTION_DOWN) {    
		                  if (keyCode == KeyEvent.KEYCODE_BACK && mWebView.canGoBack()) {  //表示按返回键  时的操作  
		                	  mWebView.goBack();   //后退    

		                      //webview.goForward();//前进  
		                      return true;    //已处理    
		                  }    
		              }    
		              return false;    
		          }    
		 }); 





