package mono.android.support.v4.widget;


public class SwipeRefreshLayout_OnRefreshListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onRefresh:()V:GetOnRefreshHandler:Android.Support.V4.Widget.SwipeRefreshLayout/IOnRefreshListenerInvoker, SwipeMenuListView\n" +
			"";
		mono.android.Runtime.register ("Android.Support.V4.Widget.SwipeRefreshLayout/IOnRefreshListenerImplementor, SwipeMenuListView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SwipeRefreshLayout_OnRefreshListenerImplementor.class, __md_methods);
	}


	public SwipeRefreshLayout_OnRefreshListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == SwipeRefreshLayout_OnRefreshListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.V4.Widget.SwipeRefreshLayout/IOnRefreshListenerImplementor, SwipeMenuListView, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onRefresh ()
	{
		n_onRefresh ();
	}

	private native void n_onRefresh ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}