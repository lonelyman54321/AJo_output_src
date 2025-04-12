/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 */
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.ProductImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ui2
 */
public final class ui2_2
extends RecyclerView$B {
    public final View a;
    public final View b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final View f;
    public final View g;

    public ui2_2(View view) {
        View view2;
        Intrinsics.checkNotNullParameter(view, "view");
        super(view);
        this.a = view;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.trust_image_parent;
        this.b = view2 = view.findViewById(n3);
        n3 = R$id.trust_image_1;
        view2 = (ImageView)view.findViewById(n3);
        this.c = view2;
        n3 = R$id.trust_image_2;
        view2 = (ImageView)view.findViewById(n3);
        this.d = view2;
        n3 = R$id.trust_image_3;
        view2 = (ImageView)view.findViewById(n3);
        this.e = view2;
        n3 = R$id.separator_1;
        this.f = view2 = view.findViewById(n3);
        n3 = R$id.separator_2;
        this.g = view = view.findViewById(n3);
    }

    public final void w(ArrayList object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "trustMarkerImages");
        Object object2 = this.c;
        Object object3 = "image1";
        Object object4 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n3 = 0;
            object2 = null;
        }
        int n4 = 8;
        object2.setVisibility(n4);
        object2 = this.d;
        String string2 = "image2";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        object2.setVisibility(n4);
        object2 = this.e;
        String string3 = "image3";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n3 = 0;
            object2 = null;
        }
        object2.setVisibility(n4);
        object2 = this.f;
        String string4 = "separator1";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n3 = 0;
            object2 = null;
        }
        object2.setVisibility(n4);
        object2 = this.g;
        String string5 = "separator2";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            n3 = 0;
            object2 = null;
        }
        object2.setVisibility(n4);
        n3 = ((ArrayList)object).size();
        if (n3 > 0) {
            int n7;
            int n8;
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n3 = 0;
                object2 = null;
            }
            n4 = 0;
            Object object5 = null;
            object2.setVisibility(0);
            object2 = (ProductImage)((ArrayList)object).get(0);
            if (object2 != null) {
                object2 = ((ProductImage)object2).getAltText();
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                Object object6;
                object2 = this.c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object2 = null;
                }
                if ((object6 = (ProductImage)((ArrayList)object).get(0)) != null) {
                    object6 = ((ProductImage)object6).getAltText();
                } else {
                    n8 = 0;
                    object6 = null;
                }
                object2.setContentDescription((CharSequence)object6);
            } else {
                object2 = this.c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n3 = 0;
                    object2 = null;
                }
                n8 = R$string.trust_marker_one;
                String string6 = hv3_0.K(n8);
                object2.setContentDescription((CharSequence)string6);
            }
            object2 = new da$a();
            n8 = 1;
            ((da$a)object2).k = n8;
            Object object7 = this.c;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n7 = 0;
                object7 = null;
            }
            object7 = ((Object)object7.getContentDescription()).toString();
            ((da$a)object2).p = object7;
            ((da$a)object2).r = n8;
            n7 = R$string.acc_banner;
            object7 = hv3_0.K(n7);
            ((da$a)object2).b((String)object7);
            object7 = (ProductImage)((ArrayList)object).get(0);
            if (object7 != null) {
                object7 = ((ProductImage)object7).getUrl();
            } else {
                n7 = 0;
                object7 = null;
            }
            ImageView imageView = this.c;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                imageView = null;
            }
            ((da$a)object2).n = object7;
            ((da$a)object2).u = imageView;
            ((da$a)object2).a();
            n3 = ((ArrayList)object).size();
            if (n3 > n8) {
                int n10;
                object2 = this.d;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = this.f;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n3 = 0;
                    object2 = null;
                }
                object2.setVisibility(0);
                object2 = (ProductImage)((ArrayList)object).get(n8);
                if (object2 != null) {
                    object2 = ((ProductImage)object2).getAltText();
                } else {
                    n3 = 0;
                    object2 = null;
                }
                if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                    object2 = this.d;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object2 = null;
                    }
                    if ((object3 = (ProductImage)((ArrayList)object).get(n8)) != null) {
                        object3 = ((ProductImage)object3).getAltText();
                    } else {
                        n10 = 0;
                        object3 = null;
                    }
                    object2.setContentDescription((CharSequence)object3);
                } else {
                    object2 = this.d;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object2 = null;
                    }
                    n10 = R$string.trust_marker_two;
                    object3 = hv3_0.K(n10);
                    object2.setContentDescription((CharSequence)object3);
                }
                object2 = new da$a();
                ((da$a)object2).k = n8;
                ((da$a)object2).r = n8;
                object3 = this.d;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n10 = 0;
                    object3 = null;
                }
                ((da$a)object2).p = object3 = ((Object)object3.getContentDescription()).toString();
                n10 = R$string.acc_banner;
                object3 = hv3_0.K(n10);
                ((da$a)object2).b((String)object3);
                object3 = (ProductImage)((ArrayList)object).get(n8);
                if (object3 != null) {
                    object3 = ((ProductImage)object3).getUrl();
                } else {
                    n10 = 0;
                    object3 = null;
                }
                string4 = this.d;
                if (string4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    string4 = null;
                }
                ((da$a)object2).n = object3;
                ((da$a)object2).u = string4;
                ((da$a)object2).a();
                n3 = ((ArrayList)object).size();
                n10 = 2;
                if (n3 > n10) {
                    object2 = this.e;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object2 = null;
                    }
                    object2.setVisibility(0);
                    object2 = this.g;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n3 = 0;
                        object2 = null;
                    }
                    object2.setVisibility(0);
                    object2 = (ProductImage)((ArrayList)object).get(n10);
                    if (object2 != null) {
                        object2 = ((ProductImage)object2).getAltText();
                    } else {
                        n3 = 0;
                        object2 = null;
                    }
                    if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                        object2 = this.e;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n3 = 0;
                            object2 = null;
                        }
                        if ((object5 = (ProductImage)((ArrayList)object).get(n10)) != null) {
                            object5 = ((ProductImage)object5).getAltText();
                        } else {
                            n4 = 0;
                            object5 = null;
                        }
                        object2.setContentDescription((CharSequence)object5);
                    } else {
                        object2 = this.e;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n3 = 0;
                            object2 = null;
                        }
                        n4 = R$string.trust_marker_three;
                        object5 = hv3_0.K(n4);
                        object2.setContentDescription((CharSequence)object5);
                    }
                    object2 = new da$a();
                    ((da$a)object2).k = n8;
                    ((da$a)object2).r = n8;
                    object5 = this.e;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n4 = 0;
                        object5 = null;
                    }
                    ((da$a)object2).p = object5 = ((Object)object5.getContentDescription()).toString();
                    n4 = R$string.acc_banner;
                    object5 = hv3_0.K(n4);
                    ((da$a)object2).b((String)object5);
                    object = (ProductImage)((ArrayList)object).get(n10);
                    object = object != null ? ((ProductImage)object).getUrl() : null;
                    object3 = this.e;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object4 = object3;
                    }
                    ((da$a)object2).n = object;
                    ((da$a)object2).u = object4;
                    ((da$a)object2).a();
                }
            }
        }
    }
}

