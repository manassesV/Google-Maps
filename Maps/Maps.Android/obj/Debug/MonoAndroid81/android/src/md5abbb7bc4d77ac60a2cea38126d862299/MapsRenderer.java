package md5abbb7bc4d77ac60a2cea38126d862299;


public class MapsRenderer
	extends md55b943cb46934695d066180d3c9f40d32.MapRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Maps.Droid.RendererAndroid.MapsRenderer, Maps.Android", MapsRenderer.class, __md_methods);
	}


	public MapsRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == MapsRenderer.class)
			mono.android.TypeManager.Activate ("Maps.Droid.RendererAndroid.MapsRenderer, Maps.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public MapsRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == MapsRenderer.class)
			mono.android.TypeManager.Activate ("Maps.Droid.RendererAndroid.MapsRenderer, Maps.Android", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public MapsRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == MapsRenderer.class)
			mono.android.TypeManager.Activate ("Maps.Droid.RendererAndroid.MapsRenderer, Maps.Android", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

	private java.util.ArrayList refList;
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
