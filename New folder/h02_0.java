/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.i;
import androidx.viewpager2.adapter.a;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from h02
 */
public final class h02_0
extends a {
    public final yi2_1 j;
    public final ArrayList k;
    public final List l;
    public final int m;
    public final boolean n;
    public final LinkedHashMap o;

    public h02_0(yi2_1 linkedHashMap, Fragment object, ArrayList arrayList, ArrayList arrayList2) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "pdpInfoProvider");
        Intrinsics.checkNotNullParameter(object, "fragment");
        FragmentManager fragmentManager = ((Fragment)object).getChildFragmentManager();
        object = ((Fragment)object).getLifecycle();
        super(fragmentManager, (i)object);
        this.j = linkedHashMap;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = -1;
        this.n = false;
        this.o = linkedHashMap = new LinkedHashMap();
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            int n4 = this.m;
            n3 = n4 >= 0 && (n4 = (int)(this.n ? 1 : 0)) != 0 ? arrayList.size() + 1 : arrayList.size();
        }
        return n3;
    }

    public final long getItemId(int n3) {
        int n4;
        ArrayList arrayList = this.k;
        if (arrayList != null && (n4 = arrayList.size()) > 0) {
            return ((ProductImage)arrayList.get(n3)).hashCode();
        }
        return 0L;
    }

    public final Fragment i(int n3) {
        Object object;
        int n4 = this.n;
        int n7 = this.m;
        if (n4 != 0 && n3 == n7) {
            object = new hj2_1();
        } else {
            boolean bl2;
            Object object2;
            n4 = 0;
            object = null;
            Object object3 = this.k;
            if (object3 != null && (object2 = (ProductImage)CollectionsKt.N(n3, (List)object3)) != null && (object2 = ((ProductImage)object2).getFlagForImageAndVideo()) != null) {
                bl2 = (Boolean)object2;
            } else {
                bl2 = false;
                object2 = null;
            }
            yi2_1 yi2_12 = this.j;
            Object object4 = null;
            String string2 = "IMAGE_POSITION";
            if (bl2) {
                Bundle bundle = new Bundle();
                if (object3 != null) {
                    n4 = ((ArrayList)object3).size();
                }
                if (n3 < n4) {
                    bundle.putInt(string2, n3);
                    if (object3 != null && (object = (ProductImage)((ArrayList)object3).get(n3)) != null) {
                        object = ((ProductImage)object).getVideoUrl();
                    } else {
                        n4 = 0;
                        object = null;
                    }
                    object2 = "VIDEO_URL";
                    bundle.putString((String)object2, (String)object);
                    if (object3 != null && (object = (ProductImage)((ArrayList)object3).get(n3)) != null) {
                        object4 = ((ProductImage)object).getVideoThumbnail();
                    }
                    object = "THUMBNAIL";
                    bundle.putString((String)object, object4);
                }
                D02.Companion.getClass();
                object = new D02();
                ((Fragment)object).setArguments(bundle);
                ((D02)object).p = yi2_12;
            } else {
                object2 = new Bundle();
                if (n7 >= 0) {
                    if (n3 < n7) {
                        this.n(n3, (Bundle)object2);
                    } else if (n3 > 0) {
                        Object object5;
                        if (object3 != null) {
                            n7 = ((ArrayList)object3).size();
                        } else {
                            n7 = 0;
                            object5 = null;
                        }
                        if (n3 <= n7) {
                            n7 = n3 + 1;
                            object2.putInt(string2, n7);
                            if (object3 != null && (object5 = (ProductImage)((ArrayList)object3).get(n7 = n3 + -1)) != null) {
                                object5 = ((ProductImage)object5).getUrl();
                            } else {
                                n7 = 0;
                                object5 = null;
                            }
                            string2 = "IMAGE_URL";
                            object2.putString(string2, (String)object5);
                            if (object3 != null && (object5 = (ProductImage)((ArrayList)object3).get(n3)) != null) {
                                object5 = ((ProductImage)object5).getAltText();
                            } else {
                                n7 = 0;
                                object5 = null;
                            }
                            object3 = "IMAGE_URL_ALT_TXT";
                            object2.putString((String)object3, (String)object5);
                            n7 = this.getItemCount();
                            int n8 = 1;
                            if (n7 > n8) {
                                object5 = this.l;
                                if (object5 != null) {
                                    n4 = object5.size();
                                }
                                if (n3 <= n4) {
                                    if (object5 != null) {
                                        n4 = n3 + -1;
                                        object4 = object = object5.get(n4);
                                        object4 = (String)object;
                                    }
                                    object = "IMAGE_URL_HR";
                                    object2.putString((String)object, (String)object4);
                                }
                            }
                        }
                    }
                } else {
                    this.n(n3, (Bundle)object2);
                }
                j02_0.Companion.getClass();
                object = new j02_0();
                ((Fragment)object).setArguments((Bundle)object2);
                ((j02_0)object).f = yi2_12;
            }
        }
        Integer n10 = n3;
        this.o.put(n10, object);
        return object;
    }

    public final void n(int n3, Bundle bundle) {
        String string2;
        int n4;
        int n7 = 0;
        Object object = this.k;
        if (object != null) {
            n4 = ((ArrayList)object).size();
        } else {
            n4 = 0;
            string2 = null;
        }
        if (n3 < n4) {
            int n8;
            int n10;
            Object object2;
            bundle.putInt("IMAGE_POSITION", n3);
            n4 = 0;
            string2 = null;
            if (object != null && (object2 = (ProductImage)((ArrayList)object).get(n3)) != null) {
                object2 = ((ProductImage)object2).getUrl();
            } else {
                n10 = 0;
                object2 = null;
            }
            String string3 = "IMAGE_URL";
            bundle.putString(string3, (String)object2);
            if (object != null && (object = (ProductImage)((ArrayList)object).get(n3)) != null) {
                object = ((ProductImage)object).getAltText();
            } else {
                n8 = 0;
                object = null;
            }
            object2 = "IMAGE_URL_ALT_TXT";
            bundle.putString((String)object2, (String)object);
            n8 = this.getItemCount();
            n10 = 1;
            if (n8 > n10) {
                object = this.l;
                if (object != null) {
                    n7 = object.size();
                }
                if (n3 < n7) {
                    String string4;
                    if (object != null) {
                        string2 = string4 = object.get(n3);
                        string2 = string4;
                    }
                    string4 = "IMAGE_URL_HR";
                    bundle.putString(string4, string2);
                }
            }
        }
    }
}

