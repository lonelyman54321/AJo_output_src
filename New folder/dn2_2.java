/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.EditText
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.core.content.FileProvider;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView$f;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ReturnFragmentLayoutRevampBinding;
import com.ril.ajio.myaccount.barcode.ScannedBarcodeActivity;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.ImageFileInfo;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/*
 * Renamed from dN2
 */
public final class dn2_2
extends l61_0
implements gD0$e,
View.OnClickListener,
gD0$b,
aN2 {
    public static final dN2$a Companion;
    public static final /* synthetic */ gn1_2[] O;
    public ty2_2 A;
    public gd0_0 B;
    public zm2_2 C;
    public Uri D;
    public boolean E;
    public nd0_0 F;
    public final ArrayList G;
    public final NewCustomEventsRevamp H;
    public final D I;
    public final boolean J;
    public final boolean K;
    public final cc3_2 L;
    public final nn2_1 M;
    public final on2_2 N;
    public Product f;
    public FragmentActivity g;
    public HashMap h;
    public CartEntry i;
    public ActionContent j;
    public View k;
    public EditText l;
    public EditText m;
    public TextView n;
    public TextView o;
    public TextView p;
    public TextView q;
    public TextView r;
    public ImageView s;
    public ImageView t;
    public ImageView u;
    public ImageView v;
    public ImageView w;
    public ImageView x;
    public RelativeLayout y;
    public t30_0 z;

    static {
        Object object = jz.a(dn2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/ReturnFragmentLayoutRevampBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        O = gn1_2Array;
        Companion = object = new Object();
    }

    public dn2_2() {
        boolean bl2;
        Object object = new zm2_2();
        this.C = object;
        object = new ArrayList();
        this.G = object;
        this.H = object = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        object = Reflection.getOrCreateKotlinClass(NM2.class);
        dN2$d dN2$d = new dN2$d(this);
        dN2$e dN2$e = new dN2$e(this);
        dN2$f dN2$f = new dN2$f(this);
        this.I = object = LW0.a(this, (yn1_2)object, dN2$d, dN2$e, dN2$f);
        object = h40_0.a;
        object = z40_0.Companion;
        this.J = bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("enable_remove_tag_info");
        this.K = bl2 = h40_0.u1();
        this.L = object = z80_0.c(dN2$b.a, this);
        this.M = object = new nn2_1(this);
        this.N = object = new Object();
    }

    public final void B(boolean bl2) {
        nd0_0 nd0_02 = this.F;
        if (nd0_02 != null) {
            nd0_02.B(bl2);
        }
    }

    public final String Da() {
        return ((Object)this.Pa().exchangeReason.exchangeReturnCommentsBtn.getText()).toString();
    }

    public final void E(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "productTagPair");
        nd0_0 nd0_02 = this.F;
        if (nd0_02 != null) {
            nd0_02.E(pair);
        }
    }

    public final ReturnFragmentLayoutRevampBinding Pa() {
        Object object = O[0];
        object = this.L.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (ReturnFragmentLayoutRevampBinding)object;
    }

    public final NM2 Qa() {
        return (NM2)this.I.getValue();
    }

    public final void Ra() {
        Object object;
        Object object2;
        boolean bl2;
        Object object3 = this.getContext();
        if (object3 != null && (object3 = this.requireContext().getExternalCacheDir()) != null && ((bl2 = ((File)(object2 = new File((File)object3, (String)(object = "/ComplaintDetails")))).exists()) || (bl2 = ((File)object2).mkdir()))) {
            object3 = ((File)object2).getAbsolutePath();
            object = this.A;
            Intrinsics.checkNotNull(object);
            object.getClass();
            String string2 = "jpeg";
            object = ty2_2.c("IMG", string2);
            object2 = new File((String)object3, (String)object);
            object3 = this.requireContext();
            int n3 = R$string.file_authority;
            object = this.getString(n3);
            object3 = FileProvider.d(object3, (String)object, (File)object2);
            this.D = object3;
            object3 = new Intent("android.media.action.IMAGE_CAPTURE");
            object2 = "output";
            object = this.D;
            object3.putExtra((String)object2, (Parcelable)object);
            int n4 = 102;
            this.startActivityForResult((Intent)object3, n4);
        }
    }

    public final void Sa() {
        int n3;
        Object object = this.G;
        String string2 = "deleteThreeImv";
        String string3 = "deleteOneImv";
        String string4 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        String string5 = "deleteTwoImv";
        String string6 = "imageViewOne";
        String string7 = "imageViewThree";
        String string8 = "imageViewTwo";
        String string9 = "takeImageTv";
        int n4 = 8;
        String string10 = null;
        if (object != null && (n3 = object.size()) == 0) {
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                object = null;
            }
            object.setVisibility(n4);
            object = this.v;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string6);
                object = null;
            }
            object.setImageBitmap(null);
            object = this.s;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object = null;
            }
            object.setVisibility(n4);
            object = this.w;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string8);
                object = null;
            }
            object.setVisibility(n4);
            object = this.w;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string8);
                object = null;
            }
            object.setImageBitmap(null);
            object = this.t;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                object = null;
            }
            object.setVisibility(n4);
            object = this.x;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                object = null;
            }
            object.setVisibility(n4);
            object = this.x;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string7);
                object = null;
            }
            object.setImageBitmap(null);
            object = this.u;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                object = null;
            }
            object.setVisibility(n4);
            object = this.n;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string9);
                object = null;
            }
            object.setVisibility(0);
            object = this.n;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string9);
                object = null;
            }
            object = object.getLayoutParams();
            Intrinsics.checkNotNull(object, string4);
            object = (ConstraintLayout$LayoutParams)((Object)object);
            object.setMargins(0, 0, 0, 0);
            string2 = this.n;
            if (string2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string9);
            } else {
                string10 = string2;
            }
            string10.setLayoutParams((ViewGroup.LayoutParams)object);
        } else {
            int n7;
            n3 = 6;
            int n8 = 1;
            if (object != null && (n7 = object.size()) == n8) {
                int n10;
                if ((object = (uy2_2)object.get(0)) != null) {
                    string2 = this.v;
                    if (string2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                        n10 = 0;
                        string2 = null;
                    }
                    if ((string6 = this.s) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        boolean bl2 = false;
                        string6 = null;
                    }
                    this.Ua((uy2_2)object, (ImageView)string2, (ImageView)string6);
                }
                if ((object = this.w) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string8);
                    object = null;
                }
                object.setVisibility(n4);
                object = this.w;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string8);
                    object = null;
                }
                object.setImageBitmap(null);
                object = this.t;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    object = null;
                }
                object.setVisibility(n4);
                object = this.n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string9);
                    object = null;
                }
                object.setVisibility(0);
                object = this.n;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string9);
                    object = null;
                }
                object = object.getLayoutParams();
                Intrinsics.checkNotNull(object, string4);
                object = (ConstraintLayout$LayoutParams)((Object)object);
                n10 = mz3_0.d(n3);
                object.setMargins(n10, 0, 0, 0);
                string2 = this.n;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string9);
                } else {
                    string10 = string2;
                }
                string10.setLayoutParams((ViewGroup.LayoutParams)object);
            } else {
                int n14;
                int n15 = this.K;
                if (n15 != 0 && object != null && (n15 = object.size()) == (n14 = 2)) {
                    if ((object = (uy2_2)object.get(n8)) != null) {
                        string3 = this.w;
                        if (string3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string8);
                            n15 = 0;
                            string3 = null;
                        }
                        if ((string6 = this.t) == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            n14 = 0;
                            string6 = null;
                        }
                        this.Ua((uy2_2)object, (ImageView)string3, (ImageView)string6);
                    }
                    if ((object = this.x) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                        object = null;
                    }
                    object.setVisibility(n4);
                    object = this.x;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                        object = null;
                    }
                    object.setImageBitmap(null);
                    object = this.u;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object = null;
                    }
                    object.setVisibility(n4);
                    object = this.n;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string9);
                        object = null;
                    }
                    object.setVisibility(0);
                    object = this.n;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string9);
                        object = null;
                    }
                    object = object.getLayoutParams();
                    Intrinsics.checkNotNull(object, string4);
                    object = (ConstraintLayout$LayoutParams)((Object)object);
                    int n16 = mz3_0.d(n3);
                    object.setMargins(n16, 0, 0, 0);
                    string2 = this.n;
                    if (string2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string9);
                    } else {
                        string10 = string2;
                    }
                    string10.setLayoutParams((ViewGroup.LayoutParams)object);
                }
            }
        }
    }

    public final void T1(int n3, String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        ArrayList arrayList = this.G;
        int n4 = arrayList.size();
        if (n3 < n4) {
            uy2_2 uy2_22 = (uy2_2)arrayList.get(n3);
            if (uy2_22 != null) {
                uy2_22.d = string2;
            }
            arrayList.remove(n3);
            arrayList.add(n3, uy2_22);
        }
    }

    public final void Ta(int n3) {
        ArrayList arrayList = this.G;
        if (n3 != 0) {
            Integer n4 = null;
            int n7 = 1;
            if (n3 != n7) {
                n7 = 2;
                if (n3 == n7) {
                    if (arrayList != null) {
                        n3 = arrayList.size();
                        n4 = n3;
                    }
                    Intrinsics.checkNotNull(n4);
                    n3 = n4;
                    if (n3 > n7) {
                        Intrinsics.checkNotNull(arrayList);
                        arrayList.remove(n7);
                    }
                }
            } else {
                if (arrayList != null) {
                    n3 = arrayList.size();
                    n4 = n3;
                }
                Intrinsics.checkNotNull(n4);
                n3 = n4;
                if (n3 > n7) {
                    Intrinsics.checkNotNull(arrayList);
                    arrayList.remove(n7);
                }
            }
        } else {
            n3 = arrayList.size();
            if (n3 > 0 && arrayList != null) {
                n3 = 0;
                uy2_2 cfr_ignored_0 = (uy2_2)arrayList.remove(0);
            }
        }
        this.Sa();
    }

    public final void Ua(uy2_2 object, ImageView imageView, ImageView object2) {
        int n3;
        Intrinsics.checkNotNull(imageView);
        imageView.setVisibility(0);
        Intrinsics.checkNotNull(object2);
        object2.setVisibility(0);
        object2 = ((uy2_2)object).c;
        boolean n4 = TextUtils.isEmpty((CharSequence)object2);
        if (!n4) {
            object = ((uy2_2)object).c;
            int n7 = 1;
            object = ty2_2.d(n7, (String)object);
            imageView.setImageBitmap((Bitmap)object);
        } else {
            object = ((uy2_2)object).e;
            imageView.setImageURI((Uri)object);
        }
        object = this.G;
        int n8 = ((ArrayList)object).size();
        int n10 = 2;
        Object object3 = null;
        String string2 = "takeImageTv";
        if (n8 >= n10 && ((n8 = (int)(this.K ? 1 : 0)) == 0 || (n3 = ((ArrayList)object).size()) >= (n8 = 3))) {
            object = this.n;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object;
            }
            n3 = 8;
            object3.setVisibility(n3);
        } else {
            object = this.n;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object.setVisibility(0);
            object = this.n;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object = null;
            }
            object = object.getLayoutParams();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            object = (ConstraintLayout$LayoutParams)((Object)object);
            n8 = mz3_0.d(6);
            object.setMargins(n8, 0, 0, 0);
            imageView = this.n;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = imageView;
            }
            object3.setLayoutParams((ViewGroup.LayoutParams)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Va(uy2_2 object) {
        ImageView imageView;
        int n3;
        Object object2;
        String string2;
        int n4;
        boolean bl2;
        int n7;
        Object object3;
        Object object4;
        block19: {
            block23: {
                block24: {
                    block21: {
                        block20: {
                            block22: {
                                block18: {
                                    if (object == null) {
                                        return;
                                    }
                                    object4 = ((uy2_2)object).a;
                                    boolean bl3 = TextUtils.isEmpty((CharSequence)object4);
                                    if (bl3) {
                                        object4 = this.A;
                                        Intrinsics.checkNotNull(object4);
                                        object4.getClass();
                                        object3 = "jpg";
                                        ((uy2_2)object).a = object4 = ty2_2.c("IMG", (String)object3);
                                    }
                                    object4 = this.G;
                                    object3 = null;
                                    n7 = 1;
                                    bl2 = this.K;
                                    if (object4 == null || (n4 = ((ArrayList)object4).size()) != 0) break block18;
                                    string2 = this.v;
                                    if (string2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("imageViewOne");
                                        n4 = 0;
                                        string2 = null;
                                    }
                                    if ((object2 = this.s) != null) break block19;
                                    object2 = "deleteOneImv";
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    break block20;
                                }
                                string2 = "deleteTwoImv";
                                object2 = "imageViewTwo";
                                if (!bl2) break block21;
                                n3 = ((ArrayList)object4).size();
                                if (n3 != n7) break block22;
                                imageView = this.w;
                                if (imageView == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                                    n3 = 0;
                                    imageView = null;
                                }
                                if ((object2 = this.t) != null) break block23;
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                break block24;
                            }
                            string2 = this.x;
                            if (string2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("imageViewThree");
                                n4 = 0;
                                string2 = null;
                            }
                            if ((object2 = this.u) != null) break block19;
                            object2 = "deleteThreeImv";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        }
                        object2 = null;
                        break block19;
                    }
                    imageView = this.w;
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        n3 = 0;
                        imageView = null;
                    }
                    if ((object2 = this.t) != null) break block23;
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                }
                object2 = null;
            }
            string2 = imageView;
        }
        if ((imageView = this.p) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lblImageError");
            n3 = 0;
            imageView = null;
        }
        int n8 = 8;
        imageView.setVisibility(n8);
        if (object4 != null) {
            ((ArrayList)object4).add(object);
        }
        this.Ua((uy2_2)object, (ImageView)string2, (ImageView)object2);
        if (bl2) {
            object4 = this.C;
            object4.getClass();
            Intrinsics.checkNotNullParameter(object, "selfCareFileInfo");
            ArrayList arrayList = ((zm2_2)object4).p;
            n4 = arrayList.size();
            if (n4 > 0) {
                fn2_1 fn2_12;
                n4 = arrayList.size() - n7;
                imageView = ((uy2_2)object).e;
                String string3 = ((uy2_2)object).c;
                Intrinsics.checkNotNullExpressionValue(string3, "getFilePath(...)");
                int n10 = 508;
                object2 = fn2_12;
                fn2_12 = new fn2_1((Uri)imageView, string3, false, false, false, n10);
                arrayList.add(n4, fn2_12);
                object = ((zm2_2)object4).j;
                if (object == null) {
                    object = "imagesAdapter";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object3 = object;
                }
                object3.getClass();
                Intrinsics.checkNotNullParameter(arrayList, "images");
                object = ((in2_1)object3).b;
                ((ArrayList)object).clear();
                ((ArrayList)object).addAll(arrayList);
                ((RecyclerView$f)object3).notifyDataSetChanged();
            }
        }
    }

    public final void Wa(Uri object) {
        block10: {
            Object object2 = this.getContext();
            Object object3 = this.A;
            Object object4 = new me1_2((Context)object2, (ty2_2)object3);
            object2 = this.M;
            object3 = this.N;
            object = ((me1_2)object4).a((Uri)object, (o60_0)object2, (o60_0)object3);
            if (object == null) break block10;
            object4 = this.z;
            Intrinsics.checkNotNull(object4);
            try {
                ((t30_0)object4).b((yr0_2)object);
            }
            catch (Exception exception) {
                object4 = yn3_0.a;
                ((yn3$a)object4).e(exception);
            }
        }
    }

    public final void X3(cr1$c_0 cr1$c_0) {
        Object object = "requestBody";
        Intrinsics.checkNotNullParameter(cr1$c_0, (String)object);
        NM2 nM2 = this.Qa();
        nM2.getClass();
        Intrinsics.checkNotNullParameter(cr1$c_0, (String)object);
        object = UrlHelper.Companion.getInstance();
        Object object2 = ((UserInformation)nM2.l.getValue()).getUserId();
        Object object3 = new Object[]{object2};
        object = ((UrlHelper)object).getApiUrl("order", "return_upload_image", object3);
        object2 = md3_0.c(nM2);
        object3 = new mm2_0(nM2, (String)object, cr1$c_0, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object3, 3);
    }

    public final boolean Y3() {
        boolean bl2;
        View view = this.k;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barcodeLayout");
            bl2 = false;
            view = null;
        }
        if (!(bl2 = view.getVisibility())) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void d8(boolean bl2) {
        nd0_0 nd0_02 = this.F;
        if (nd0_02 != null) {
            nd0_02.f1(bl2);
        }
    }

    public final boolean f3() {
        return this.E;
    }

    /*
     * WARNING - void declaration
     */
    public final void h4(boolean bl2) {
        AjioTextView ajioTextView = this.Pa().returnLayoutBarcode.lblErrorEan;
        Object object = "lblErrorEan";
        Intrinsics.checkNotNullExpressionValue(ajioTextView, (String)object);
        ai0_2.i((View)ajioTextView);
        ajioTextView = this.p;
        String string2 = "lblImageError";
        EditText editText = null;
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            ajioTextView = null;
        }
        int n3 = 8;
        ajioTextView.setVisibility(n3);
        ajioTextView = null;
        String string3 = "lblChar";
        Object object2 = "";
        String string4 = "commentEt";
        String string5 = "barcodeLayout";
        if (bl2) {
            void var11_32;
            String string6;
            void var11_16;
            void var11_13;
            View view = this.k;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                bl2 = false;
                Object var11_12 = null;
            }
            var11_13.setVisibility(0);
            EditText editText2 = this.l;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                Object var11_15 = null;
            }
            String string7 = var11_16.getText().toString();
            int n4 = string7.length();
            int n7 = 1;
            n4 -= n7;
            n3 = 0;
            boolean bl3 = false;
            string5 = null;
            while (n3 <= n4) {
                int n8 = !bl3 ? n3 : n4;
                n8 = string7.charAt(n8);
                int n10 = 32;
                if ((n8 = Intrinsics.compare(n8, n10)) <= 0) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    Object var17_94 = null;
                }
                if (!bl3) {
                    if (n8 == 0) {
                        bl3 = true;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                if (n8 == 0) break;
                n4 += -1;
            }
            if ((n4 = (int)(TextUtils.isEmpty((CharSequence)(string6 = com.jio.jioads.adinterfaces.a.a(n4, n7, n3, string7))) ? 1 : 0)) != 0) {
                CartEntry cartEntry = this.i;
                Intrinsics.checkNotNull(cartEntry);
                String string8 = cartEntry.getWrongItemComments();
                if (string8 != null) {
                    String string9;
                    NM2 nM2 = this.Qa();
                    object = this.i;
                    Intrinsics.checkNotNull(object);
                    object = ((CartEntry)object).getWrongItemComments();
                    nM2.getClass();
                    if (object != null && (n3 = (int)(StringsKt.F((CharSequence)object, string9 = ":", false) ? 1 : 0)) == n7) {
                        void var11_28;
                        String[] stringArray;
                        List list;
                        if (object != null && (list = StringsKt.a0((CharSequence)object, stringArray = new String[]{string9}, false, 0, n3 = 6)) != null) {
                            String string10 = (String)list.get(n7);
                        } else {
                            bl2 = false;
                            Object var11_27 = null;
                        }
                        object2 = var11_28;
                    } else {
                        object2 = object;
                    }
                }
                String string11 = object2;
            }
            if ((n4 = (int)(TextUtils.isEmpty((CharSequence)var11_32) ? 1 : 0)) == 0) {
                void var11_35;
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = this.o;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                }
                object.setText((CharSequence)var11_32);
                EditText editText3 = this.l;
                if (editText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    bl2 = false;
                    Object var11_34 = null;
                }
                var11_35.clearFocus();
                EditText editText4 = this.l;
                if (editText4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                } else {
                    editText = editText4;
                }
                editText.setCursorVisible(false);
            }
        } else {
            void var11_87;
            void var11_83;
            void var11_78;
            void var11_75;
            void var11_72;
            void var11_69;
            void var11_66;
            void var11_63;
            void var11_60;
            void var11_57;
            void var11_54;
            void var11_51;
            void var11_48;
            void var11_42;
            void var11_39;
            EditText editText5 = this.m;
            if (editText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("barcodeEt");
                bl2 = false;
                Object var11_38 = null;
            }
            var11_39.setText((CharSequence)object2);
            EditText editText6 = this.l;
            if (editText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                Object var11_41 = null;
            }
            var11_42.setText((CharSequence)object2);
            NM2 nM2 = this.Qa();
            bl2 = nM2.b;
            if (!bl2) {
                ArrayList arrayList = this.G;
                arrayList.clear();
            }
            ImageView imageView = this.v;
            object2 = "imageViewOne";
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                Object var11_47 = null;
            }
            var11_48.setImageBitmap(null);
            ImageView imageView2 = this.w;
            string4 = "imageViewTwo";
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                Object var11_50 = null;
            }
            var11_51.setImageBitmap(null);
            ImageView imageView3 = this.x;
            String string12 = "imageViewThree";
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string12);
                bl2 = false;
                Object var11_53 = null;
            }
            var11_54.setImageBitmap(null);
            ImageView imageView4 = this.w;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                bl2 = false;
                Object var11_56 = null;
            }
            var11_57.setVisibility(n3);
            ImageView imageView5 = this.x;
            if (imageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string12);
                bl2 = false;
                Object var11_59 = null;
            }
            var11_60.setVisibility(n3);
            ImageView imageView6 = this.v;
            if (imageView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                Object var11_62 = null;
            }
            var11_63.setVisibility(n3);
            ImageView imageView7 = this.s;
            if (imageView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deleteOneImv");
                bl2 = false;
                Object var11_65 = null;
            }
            var11_66.setVisibility(n3);
            ImageView imageView8 = this.t;
            if (imageView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deleteTwoImv");
                bl2 = false;
                Object var11_68 = null;
            }
            var11_69.setVisibility(n3);
            ImageView imageView9 = this.u;
            if (imageView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deleteThreeImv");
                bl2 = false;
                Object var11_71 = null;
            }
            var11_72.setVisibility(n3);
            TextView textView = this.n;
            object2 = "takeImageTv";
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                Object var11_74 = null;
            }
            var11_75.setVisibility(0);
            TextView textView2 = this.n;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                bl2 = false;
                Object var11_77 = null;
            }
            ViewGroup.LayoutParams layoutParams = var11_78.getLayoutParams();
            string4 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
            Intrinsics.checkNotNull(layoutParams, string4);
            ConstraintLayout$LayoutParams constraintLayout$LayoutParams = (ConstraintLayout$LayoutParams)layoutParams;
            constraintLayout$LayoutParams.setMargins(0, 0, 0, 0);
            ajioTextView = this.n;
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                ajioTextView = null;
            }
            ajioTextView.setLayoutParams((ViewGroup.LayoutParams)constraintLayout$LayoutParams);
            TextView textView3 = this.p;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                Object var11_82 = null;
            }
            var11_83.setVisibility(n3);
            AjioTextView ajioTextView2 = this.Pa().returnLayoutBarcode.lblErrorEan;
            Intrinsics.checkNotNullExpressionValue(ajioTextView2, (String)object);
            ai0_2.i((View)ajioTextView2);
            TextView textView4 = this.o;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                Object var11_86 = null;
            }
            var11_87.setVisibility(n3);
            View view = this.k;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
            } else {
                editText = view;
            }
            editText.setVisibility(n3);
        }
    }

    public final void h6() {
        sD3 sD32 = this.getActivity();
        if (sD32 != null) {
            sD32 = new vq_2();
            int n3 = 1001;
            ((Fragment)sD32).setTargetFragment(this, n3);
            FragmentManager fragmentManager = this.requireActivity().getSupportFragmentManager();
            String string2 = "ATTACHMENT_DIALOG";
            ((DialogFragment)sD32).show(fragmentManager, string2);
        }
    }

    public final void i0(ArrayList arrayList) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(arrayList, "imageList");
        ArrayList arrayList2 = this.G;
        arrayList2.clear();
        Iterator iterator = arrayList.iterator();
        while (bl2 = iterator.hasNext()) {
            uy2_2 uy2_22 = (uy2_2)iterator.next();
            arrayList2.add(uy2_22);
            this.Sa();
        }
        boolean bl3 = arrayList.isEmpty();
        if (bl3) {
            this.Sa();
        }
    }

    public final void m9() {
        nd0_0 nd0_02 = this.F;
        if (nd0_02 != null) {
            String string2 = "Save";
            Intrinsics.checkNotNull(string2);
            nd0_02.L();
        }
    }

    public final void onActivityResult(int n3, int n4, Intent object) {
        block28: {
            int n7;
            int n8;
            GTMEvents gTMEvents;
            int n10;
            block33: {
                Object object2;
                block34: {
                    boolean bl2;
                    ActivityNotFoundException activityNotFoundException2;
                    Object object3;
                    block30: {
                        boolean bl3;
                        block32: {
                            Uri uri;
                            block31: {
                                n10 = 1;
                                gTMEvents = null;
                                n8 = 102;
                                n7 = -1;
                                if (n3 != n8) break block31;
                                if (n4 == n7) {
                                    Uri uri2 = this.D;
                                    this.Wa(uri2);
                                }
                                break block28;
                            }
                            n8 = 101;
                            if (n3 != n8 || n4 != n7) break block32;
                            if (object != null && (uri = object.getData()) != null) {
                                uri.toString();
                                Object object4 = this.getContext();
                                if (object4 != null && (object4 = this.requireContext().getContentResolver().getType(uri)) != null && (n4 = (int)(StringsKt.F((CharSequence)object4, (CharSequence)(object = "image"), false) ? 1 : 0)) != 0) {
                                    this.Wa(uri);
                                }
                            }
                            break block28;
                        }
                        int n14 = 1001;
                        if (n3 != n14 || n4 != n7) break block33;
                        if (object == null) break block28;
                        object2 = "CLICK_TYPE";
                        n4 = object.getIntExtra((String)object2, 0);
                        if (n4 != (n10 = 201)) break block34;
                        object2 = "requireActivity(...)";
                        object = "android.intent.action.OPEN_DOCUMENT";
                        Intent intent = new Intent((String)object);
                        object = "android.intent.category.OPENABLE";
                        intent.addCategory((String)object);
                        object = "*/*";
                        intent.setType((String)object);
                        object = "image/jpeg";
                        object3 = "image/png";
                        object = new String[]{object, object3};
                        object3 = "android.intent.extra.MIME_TYPES";
                        intent.putExtra((String)object3, (String[])object);
                        try {
                            this.startActivityForResult(intent, n8);
                            break block28;
                        }
                        catch (IllegalStateException illegalStateException) {
                        }
                        catch (ActivityNotFoundException activityNotFoundException2) {
                            break block30;
                        }
                        object = this.getActivity();
                        if (object != null && !(bl3 = (object = this.requireActivity()).isFinishing())) {
                            object = ab0_0.Companion;
                            object3 = this.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                            object.getClass();
                            aB0$a.a((Activity)object3);
                        }
                        object2 = yn3_0.a;
                        object2.e(illegalStateException);
                        break block28;
                    }
                    object = this.getActivity();
                    if (object != null && !(bl2 = (object = this.requireActivity()).isFinishing())) {
                        object = ab0_0.Companion;
                        object3 = this.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                        object.getClass();
                        aB0$a.a((Activity)object3);
                    }
                    object2 = yn3_0.a;
                    object2.e(activityNotFoundException2);
                    break block28;
                }
                n3 = object.getIntExtra((String)object2, 0);
                if (n3 == (n4 = 202) && (object2 = this.getContext()) != null) {
                    String string2;
                    object2 = this.requireContext();
                    n3 = t70.checkSelfPermission((Context)object2, string2 = "android.permission.CAMERA");
                    if (n3 == 0) {
                        this.Ra();
                    } else {
                        object2 = new String[]{string2};
                        this.requestPermissions((String[])object2, n10);
                    }
                }
                break block28;
            }
            n8 = 41;
            if (n3 == n8 && n4 == n7) {
                Object object5;
                Intrinsics.checkNotNull(object);
                Object object6 = object.getExtras();
                if (object6 != null && (object6 = object6.getString((String)(object5 = "BARCODE_DATA"))) != null) {
                    object5 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_alert_message;
                    object5 = hv3_0.K(n4);
                    object = new Object[n10];
                    object[0] = object6;
                    object = Arrays.copyOf(object, n10);
                    Intrinsics.checkNotNullExpressionValue(String.format((String)object5, (Object[])object), "format(...)");
                    Intrinsics.checkNotNullParameter(object6, "res");
                    object5 = this.m;
                    boolean bl4 = false;
                    object = null;
                    String string3 = "barcodeEt";
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n4 = 0;
                        object5 = null;
                    }
                    object5.setText((CharSequence)object6);
                    n3 = ((String)object6).length();
                    object5 = this.m;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object = object5;
                    }
                    object.setSelection(n3);
                }
            } else {
                n10 = 1002;
                if (n3 == n10 && n4 == n7) {
                    Intrinsics.checkNotNull(object);
                    Object object7 = object.getExtras();
                    if (object7 != null) {
                        Object object8 = "IS_SELECTED";
                        n3 = (int)(object7.getBoolean((String)object8) ? 1 : 0);
                        this.E = n3;
                        if (n3 != 0) {
                            object7 = this.Pa().returnLayoutBarcode.lblErrorEan;
                            object8 = "lblErrorEan";
                            Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                            ai0_2.i((View)object7);
                        }
                        if ((object7 = this.i) != null) {
                            Intrinsics.checkNotNull(object7);
                            object7 = ((CartEntry)object7).getProduct();
                            if (object7 != null) {
                                object7 = this.i;
                                Intrinsics.checkNotNull(object7);
                                object7 = ((CartEntry)object7).getOrderId();
                                object8 = this.i;
                                Intrinsics.checkNotNull(object8);
                                object8 = ((CartEntry)object8).getProduct().getCode();
                                boolean bl5 = this.E;
                                object = bl5 ? "Yes" : "No";
                                object = "Wrong Product Return flow \u2013 Checked no tag ".concat((String)object);
                                AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                                gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
                                String string4 = "Wrong_product_return_flow_barcode_scan_";
                                String string5 = "_";
                                object7 = UX.c(string4, (String)object8, string5, (String)object7);
                                ak0_0.a(analyticsManager$Companion, gTMEvents, (String)object, (String)object7);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        Object object2 = this.getActivity();
        this.g = object2;
        boolean bl2 = object instanceof nd0_0;
        if (bl2) {
            object = (nd0_0)object;
            this.F = object;
            return;
        }
        object = pn_2.b(object, " must implement ExchangeReturnTabActivityListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onClick(View view) {
        dn2_2 dn2_22 = this;
        Object object = "v";
        Object object2 = view;
        Intrinsics.checkNotNullParameter(view, (String)object);
        int n3 = view.getId();
        int n4 = R$id.tvTakeImage;
        boolean bl2 = false;
        Object object3 = null;
        if (n3 == n4) {
            n3 = (int)(this.K ? 1 : 0);
            if (n3 != 0) {
                boolean bl3;
                object = zm2_2.Companion;
                object2 = this.G;
                Object object4 = this.Qa().j;
                object.getClass();
                Intrinsics.checkNotNullParameter(object2, "imageInfoList");
                Intrinsics.checkNotNullParameter(object4, "imageUploadObserver");
                object = new zm2_2();
                ((zm2_2)object).a = this;
                ((zm2_2)object).b = object4;
                object4 = ((zm2_2)object).p;
                ((ArrayList)object4).clear();
                Object object5 = ((zm2_2)object).q;
                ((ArrayList)object5).clear();
                ((ArrayList)object5).addAll(object2);
                object2 = ((ArrayList)object2).iterator();
                while (bl3 = object2.hasNext()) {
                    object5 = (uy2_2)object2.next();
                    if (object5 == null) continue;
                    Uri uri = ((uy2_2)object5).e;
                    String string2 = ((uy2_2)object5).c;
                    Intrinsics.checkNotNullExpressionValue(string2, "getFilePath(...)");
                    boolean bl4 = true;
                    int n7 = 388;
                    Object var16_20 = null;
                    boolean bl5 = true;
                    Object object6 = object5;
                    object5 = new fn2_1(uri, string2, false, bl5, bl4, n7);
                    ((ArrayList)object4).add(object5);
                }
                int n8 = 507;
                boolean bl6 = true;
                object2 = new fn2_1(null, null, bl6, false, false, n8);
                ((ArrayList)object4).add(object2);
                ((DialogFragment)object).setCancelable(false);
                dn2_22.C = object;
                object2 = this.getChildFragmentManager();
                object3 = "ReturnFrom";
                ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            } else {
                object = this.getActivity();
                if (object != null) {
                    object = new vq_2();
                    n4 = 1001;
                    ((Fragment)object).setTargetFragment(this, n4);
                    object2 = this.requireActivity().getSupportFragmentManager();
                    object3 = "ATTACHMENT_DIALOG";
                    ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
                }
            }
        } else {
            n4 = R$id.tv_write_a_comment;
            Object object7 = null;
            if (n3 == n4) {
                object = this.l;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("commentEt");
                    n3 = 0;
                    object = null;
                }
                object.setVisibility(0);
                object = dn2_22.o;
                if (object == null) {
                    object = "lblChar";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object7 = object;
                }
                object7.setVisibility(0);
            } else {
                n4 = R$id.ivDeleteOne;
                if (n3 == n4) {
                    this.Ta(0);
                } else {
                    n4 = R$id.ivDeleteTwo;
                    boolean bl7 = true;
                    if (n3 == n4) {
                        this.Ta((int)(bl7 ? 1 : 0));
                    } else {
                        n4 = R$id.ivDeleteThree;
                        if (n3 == n4) {
                            n3 = 2;
                            this.Ta(n3);
                        } else {
                            n4 = R$id.imv_barcode;
                            String string3 = "_";
                            String string4 = "Wrong_product_return_flow_barcode_scan_";
                            if (n3 == n4) {
                                object = this.i;
                                if (object != null) {
                                    Intrinsics.checkNotNull(object);
                                    object = ((CartEntry)object).getProduct();
                                    if (object != null) {
                                        object = this.i;
                                        Intrinsics.checkNotNull(object);
                                        object = ((CartEntry)object).getOrderId();
                                        object2 = this.i;
                                        Intrinsics.checkNotNull(object2);
                                        object2 = ((CartEntry)object2).getProduct().getCode();
                                        object3 = AnalyticsManager.Companion;
                                        object7 = ((AnalyticsManager$Companion)object3).getInstance().getGtmEvents();
                                        object = UX.c(string4, (String)object2, string3, (String)object);
                                        object2 = "Wrong product return flow \u2013 barcode input scan";
                                        ak0_0.a(object3, (GTMEvents)object7, (String)object2, (String)object);
                                    }
                                }
                                if ((object = this.getContext()) != null) {
                                    object = ScannedBarcodeActivity.Companion;
                                    object2 = this.requireContext();
                                    Intrinsics.checkNotNullExpressionValue(object2, "requireContext(...)");
                                    object.getClass();
                                    Intrinsics.checkNotNullParameter(object2, "context");
                                    Intrinsics.checkNotNullParameter(dn2_22, "fragment");
                                    object3 = ScannedBarcodeActivity.class;
                                    object = new Intent((Context)object2, object3);
                                    n4 = 41;
                                    dn2_22.startActivityForResult((Intent)object, n4);
                                }
                            } else {
                                n4 = R$id.lbl_no_product_code;
                                String string5 = "ProductCodeFragment";
                                if (n3 == n4) {
                                    object = this.i;
                                    if (object != null) {
                                        Intrinsics.checkNotNull(object);
                                        object = ((CartEntry)object).getProduct();
                                        if (object != null) {
                                            object = this.i;
                                            Intrinsics.checkNotNull(object);
                                            object = ((CartEntry)object).getOrderId();
                                            object2 = this.i;
                                            Intrinsics.checkNotNull(object2);
                                            object2 = ((CartEntry)object2).getProduct().getCode();
                                            AnalyticsManager$Companion analyticsManager$Companion = AnalyticsManager.Companion;
                                            GTMEvents gTMEvents = analyticsManager$Companion.getInstance().getGtmEvents();
                                            object = UX.c(string4, (String)object2, string3, (String)object);
                                            object2 = "Wrong Product Return flow \u2013 I dont have product code";
                                            ak0_0.a(analyticsManager$Companion, gTMEvents, (String)object2, (String)object);
                                        }
                                    }
                                    if ((object = this.getActivity()) != null && (n3 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                                        object = Yz2.Companion;
                                        n4 = (int)(dn2_22.E ? 1 : 0);
                                        object.getClass();
                                        object = Yz2$a.a((int)(bl7 ? 1 : 0), n4 != 0, false, null);
                                        n4 = 1002;
                                        ((Fragment)object).setTargetFragment(dn2_22, n4);
                                        object2 = this.requireActivity().getSupportFragmentManager();
                                        ((DialogFragment)object).show((FragmentManager)object2, string5);
                                    }
                                } else {
                                    n4 = R$id.imv_product_code_info;
                                    if ((n3 == n4 || n3 == (n4 = R$id.tvProductCode)) && (object = this.getActivity()) != null && (n3 = (int)((object = this.requireActivity()).isFinishing() ? 1 : 0)) == 0) {
                                        object = this.Pa().returnLayoutBarcode.tvProductCode.getText();
                                        n4 = R$string.return_subreason_product_tag_submitted_msg;
                                        object2 = dn2_22.getString(n4);
                                        n3 = (int)(object.equals(object2) ? 1 : 0);
                                        object2 = Yz2.Companion;
                                        bl2 = dn2_22.E;
                                        object = n3 != 0;
                                        object2.getClass();
                                        object = Yz2$a.a((int)(bl7 ? 1 : 0), bl2, bl7, (Boolean)object);
                                        object2 = this.requireActivity().getSupportFragmentManager();
                                        ((DialogFragment)object).show((FragmentManager)object2, string5);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        this.setHasOptionsMenu(true);
        object = new t30_0();
        this.z = object;
        object = new ty2_2(false);
        this.A = object;
        object = this.getParentFragmentManager();
        F5 f5 = new F5(this);
        ((FragmentManager)object).h0("key_missing_product_tag_wrong_item", this, f5);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.return_fragment_layout_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroy() {
        super.onDestroy();
        t30_0 t30_02 = this.z;
        Intrinsics.checkNotNull(t30_02);
        boolean bl2 = t30_02.b;
        if (!bl2) {
            t30_02 = this.z;
            Intrinsics.checkNotNull(t30_02);
            t30_02.d();
        }
    }

    public final void onRequestPermissionsResult(int n3, String[] object, int[] nArray) {
        Intrinsics.checkNotNullParameter(object, "permissions");
        String string2 = "grantResults";
        Intrinsics.checkNotNullParameter(nArray, string2);
        int n4 = 201;
        if (n3 == n4) {
            n3 = 0;
            string2 = "android.permission.CAMERA";
            boolean bl2 = Intrinsics.areEqual(object = object[0], string2);
            if (bl2 && (n3 = nArray[0]) == 0) {
                this.Ra();
            }
        }
    }

    public final void onResume() {
        int n3;
        super.onResume();
        Bundle bundle = new Bundle();
        Object object = this.H.getSTEP();
        int n4 = 3;
        bundle.putInt((String)object, n4);
        Object object2 = AnalyticsManager.Companion;
        String string2 = bv_0.a((AnalyticsManager$Companion)object2);
        String string3 = cv_0.a((AnalyticsManager$Companion)object2);
        object = this.H;
        String string4 = "return reason selection screen";
        String string5 = "order management screen";
        Object object3 = bundle;
        ((NewCustomEventsRevamp)object).newPushCustomScreenView(string4, string5, string2, bundle, string3);
        object = this.getArguments();
        if (object != null && (object = object.getString(string4 = "IS_FROM_JOUNRNEY")) != null && (n3 = ((String)object).equals(string4 = "return")) == (n4 = 1) && (n3 = (int)(h40_0.l1() ? 1 : 0)) != 0) {
            float f5;
            object = this.getArguments();
            string4 = "product_id";
            string5 = null;
            if (object != null) {
                object = object.getString(string4);
            } else {
                n3 = 0;
                object = null;
                f5 = 0.0f;
            }
            bundle.putString(string4, (String)object);
            object = this.getArguments();
            string4 = "order_status";
            if (object != null) {
                object = object.getString(string4);
            } else {
                n3 = 0;
                object = null;
                f5 = 0.0f;
            }
            bundle.putString(string4, (String)object);
            object = this.getArguments();
            string4 = "order_id";
            if (object != null) {
                string5 = object.getString(string4);
            }
            bundle.putString(string4, string5);
            object = this.j;
            if (object != null && (object = ((ActionContent)object).getReturn_fee()) != null) {
                f5 = ((Float)object).floatValue();
                n3 = (int)f5;
            } else {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            }
            bundle.putInt("return_fee", n3);
            String string6 = ((AnalyticsManager$Companion)object2).getInstance().getNewEEcommerceEventsRevamp().getPrevScreen();
            String string7 = cv_0.a((AnalyticsManager$Companion)object2);
            int n7 = 1540;
            object = this.H;
            string4 = "";
            string5 = "";
            string2 = null;
            object3 = "screen_view";
            string3 = "return size & reason selection screen";
            object2 = "order management screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, string5, null, (String)object3, string3, (String)object2, string6, bundle, string7, false, null, n7, null);
        } else {
            String string8 = bv_0.a((AnalyticsManager$Companion)object2);
            String string9 = cv_0.a((AnalyticsManager$Companion)object2);
            int n8 = 1540;
            object = this.H;
            string4 = "";
            string5 = "";
            string2 = null;
            object3 = "openScreen";
            string3 = "return reason selection screen";
            object2 = "order management screen";
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, string4, string5, null, (String)object3, string3, (String)object2, string8, bundle, string9, false, null, n8, null);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        block65: {
            block62: {
                block63: {
                    block64: {
                        var3_3 = this;
                        var4_4 /* !! */  = var1_1;
                        var5_5 = 1;
                        Intrinsics.checkNotNullParameter(var1_1, "view");
                        super.onViewCreated(var1_1, var2_2);
                        var6_6 = this.Pa().collapseToolBar;
                        var7_7 = R$style.collapsed_toolbar_title;
                        var6_6.setCollapsedTitleTextAppearance(var7_7);
                        var7_7 = R$style.expanded_toolbar_title;
                        var6_6.setExpandedTitleTextAppearance(var7_7);
                        var7_7 = mz3_0.d(16);
                        var8_8 = var6_6.getExpandedTitleMarginTop();
                        var9_9 = var6_6.getExpandedTitleMarginEnd();
                        var10_10 = var6_6.getExpandedTitleMarginBottom();
                        var6_6.setExpandedTitleMargin(var7_7, var8_8, var9_9, var10_10);
                        var6_6 = Unit.a;
                        var6_6 = this.Pa().alfToolbar;
                        var11_11 = hv3_0.K(R$string.return_request);
                        var6_6.setTitle((CharSequence)var11_11);
                        var6_6 = this.Pa().alfToolbar;
                        var7_7 = R$drawable.ic_cc_close;
                        var6_6.setNavigationIcon(var7_7);
                        var6_6 = this.Pa().alfToolbar;
                        var7_7 = R$string.close;
                        var11_11 = this.getString(var7_7);
                        var6_6.setNavigationContentDescription((CharSequence)var11_11);
                        var6_6 = this.Pa().alfToolbar;
                        var8_8 = 0;
                        var11_11 = new cN2(this, 0);
                        var6_6.setNavigationOnClickListener((View.OnClickListener)var11_11);
                        var12_12 = R$id.exchange_scroll;
                        var6_6 = var1_1.findViewById(var12_12);
                        var11_11 = "findViewById(...)";
                        Intrinsics.checkNotNullExpressionValue(var6_6, (String)var11_11);
                        var6_6 = (NestedScrollView)var6_6;
                        var13_13 = this.g;
                        var14_14 = 6;
                        var15_15 = ":";
                        var16_16 /* !! */  = null;
                        var10_10 = 33;
                        if (var13_13 == null) break block62;
                        Intrinsics.checkNotNull(var13_13);
                        var13_13 = var13_13.getIntent();
                        Intrinsics.checkNotNull(var13_13);
                        var17_17 = Build.VERSION.SDK_INT;
                        if (var17_17 >= var10_10) {
                            var18_18 = id0_1.a((Intent)var13_13);
                        } else {
                            var18_18 = var13_13.getSerializableExtra("RETURN_ITEMS_CONSIGNMENT_ENTRY");
                            var19_19 = var18_18 instanceof CartEntry;
                            if (!var19_19) {
                                var20_20 = 0;
                                var18_18 = null;
                            }
                            var18_18 = (CartEntry)var18_18;
                        }
                        var18_18 = (CartEntry)var18_18;
                        var3_3.i = var18_18;
                        if (var17_17 >= var10_10) {
                            var13_13 = bn2_1.a((Intent)var13_13);
                        } else {
                            var21_21 = "actionContent";
                            var17_17 = (var13_13 = var13_13.getSerializableExtra((String)var21_21)) instanceof ActionContent;
                            if (var17_17 == 0) {
                                var9_9 = 0;
                                var13_13 = null;
                            }
                            var13_13 = (ActionContent)var13_13;
                        }
                        var3_3.j = var13_13 = (ActionContent)var13_13;
                        var13_13 = var3_3.i;
                        if (var13_13 == null) break block63;
                        var21_21 = this.Qa();
                        var18_18 = var3_3.i;
                        if (var18_18 != null) {
                            var18_18 = var18_18.getCancelComments();
                        } else {
                            var20_20 = 0;
                            var18_18 = null;
                        }
                        var17_17 = (int)var21_21.b;
                        if (var17_17 == 0) break block64;
                        if (var18_18 == null) ** GOTO lbl-1000
                        var21_21 = new String[]{var15_15};
                        if ((var21_21 = StringsKt.a0((CharSequence)var18_18, (String[])var21_21, false, 0, var14_14)) != null) {
                            var18_18 = var21_21 = (String)var21_21.get(var5_5);
                        } else lbl-1000:
                        // 2 sources

                        {
                            var20_20 = 0;
                            var18_18 = null;
                        }
                    }
                    var13_13.setCancelComments((String)var18_18);
                }
                if ((var13_13 = var3_3.i) != null) {
                    Intrinsics.checkNotNull(var13_13);
                    var3_3.f = var13_13 = var13_13.getProduct();
                }
            }
            if ((var13_13 = var3_3.i) == null) {
                var22_22 = R$string.server_alert_title;
                var4_4 /* !! */  = var3_3.getString(var22_22);
                Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , "getString(...)");
                hv3_0.o0(0, (String)var4_4 /* !! */ , null);
                return;
            }
            var3_3.B = var13_13 = new gd0_0((boolean)var5_5, var3_3, null);
            var9_9 = R$id.product_return;
            var23_23 = var4_4 /* !! */ .findViewById(var9_9);
            var13_13 = var3_3.B;
            Intrinsics.checkNotNull(var13_13);
            var21_21 = var3_3.i;
            var18_18 = var3_3.f;
            Intrinsics.checkNotNull(var23_23);
            var24_24 = this.requireActivity().getSupportFragmentManager();
            this.getActivity();
            var25_25 = var3_3.j;
            var26_26 /* !! */  = var21_21;
            var13_13.l((CartEntry)var21_21, (Product)var18_18, var23_23, var24_24, (ActionContent)var25_25);
            var13_13 = this.requireArguments();
            var21_21 = "requireArguments(...)";
            Intrinsics.checkNotNullExpressionValue(var13_13, (String)var21_21);
            var17_17 = Build.VERSION.SDK_INT;
            if (var17_17 >= var10_10) {
                var13_13 = E7.a((Bundle)var13_13);
            } else {
                var18_18 = "GIFTS_ITEMS_DATA";
                var20_20 = (var13_13 = var13_13.getSerializable((String)var18_18)) instanceof HashMap;
                if (var20_20 == 0) {
                    var9_9 = 0;
                    var13_13 = null;
                }
                var13_13 = (HashMap)var13_13;
            }
            var3_3.h = var13_13 = (HashMap)var13_13;
            var13_13 = var3_3.i;
            if (var13_13 != null && (var9_9 = (int)var13_13.isExchangeItem()) == 0) {
                var13_13 = var3_3.i;
                if (var13_13 != null && (var13_13 = var13_13.getProduct()) != null) {
                    var13_13 = var13_13.getCode();
                } else {
                    var9_9 = 0;
                    var13_13 = null;
                }
                if (var13_13 != null && (var9_9 = var13_13.length()) != 0 && (var13_13 = var3_3.h) != null) {
                    var18_18 = var3_3.i;
                    if (var18_18 != null && (var18_18 = var18_18.getProduct()) != null) {
                        var18_18 = var18_18.getCode();
                    } else {
                        var20_20 = 0;
                        var18_18 = null;
                    }
                    var9_9 = (int)var13_13.containsKey(var18_18);
                    if (var9_9 == var5_5) {
                        var13_13 = a21.a;
                        var18_18 = a21$a.RETURN_REFUND;
                        var25_25 = this.Pa().productReturn.getRoot();
                        Intrinsics.checkNotNullExpressionValue(var25_25, "getRoot(...)");
                        var27_27 = var3_3.h;
                        if (var27_27 != null) {
                            var28_28 /* !! */  = var3_3.i;
                            var28_28 /* !! */  = var28_28 /* !! */  != null && (var28_28 /* !! */  = var28_28 /* !! */ .getProduct()) != null ? var28_28 /* !! */ .getCode() : null;
                            var27_27 = (ArrayList)var27_27.get(var28_28 /* !! */ );
                        } else {
                            var27_27 = null;
                        }
                        a21.i((a21)var13_13, (a21$a)var18_18, (View)var25_25, (ArrayList)var27_27);
                    }
                }
            }
            var13_13 = var3_3.i;
            Intrinsics.checkNotNull(var13_13);
            var13_13 = var13_13.getQuantity();
            var9_9 = var13_13.intValue();
            var18_18 = "getQuantity(...)";
            var25_25 = "tvSelectQuantity";
            var27_27 = "exchangeReturnQuantityLayoutLL";
            if (var9_9 <= var5_5) {
                var13_13 = this.Pa().tvSelectQuantity;
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var25_25);
                ai0_2.i((View)var13_13);
                var13_13 = this.Pa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var27_27);
                ai0_2.i((View)var13_13);
                var13_13 = var3_3.B;
                Intrinsics.checkNotNull(var13_13);
                var25_25 = var3_3.i;
                Intrinsics.checkNotNull(var25_25);
                var25_25 = var25_25.getQuantity();
                Intrinsics.checkNotNullExpressionValue(var25_25, (String)var18_18);
                var20_20 = var25_25.intValue();
                var25_25 = var3_3.i;
                Intrinsics.checkNotNull(var25_25);
                var19_19 = var25_25.getIsReturnItem();
                var13_13.n(var20_20, var3_3, var19_19);
            } else {
                var13_13 = this.Pa().tvSelectQuantity;
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var25_25);
                ai0_2.B((View)var13_13);
                var13_13 = this.Pa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                Intrinsics.checkNotNullExpressionValue(var13_13, (String)var27_27);
                ai0_2.B((View)var13_13);
                var13_13 = var3_3.B;
                Intrinsics.checkNotNull(var13_13);
                var25_25 = this.Pa().exchangeReturnQuantityLayout.exchangeReturnQuantityLayoutLL;
                Intrinsics.checkNotNullExpressionValue(var25_25, (String)var27_27);
                var27_27 = var3_3.i;
                Intrinsics.checkNotNull(var27_27);
                var27_27 = var27_27.getQuantity();
                Intrinsics.checkNotNullExpressionValue(var27_27, (String)var18_18);
                var20_20 = var27_27.intValue();
                var13_13.m((View)var25_25, var20_20, var3_3, false);
            }
            var13_13 = var3_3.g;
            Intrinsics.checkNotNull(var13_13);
            var13_13 = var13_13.getIntent();
            var18_18 = new ArrayList();
            var18_18.add("Select Reason");
            var25_25 = var13_13.getStringArrayListExtra("RETURN_ITEMS_REASONS");
            if (var25_25 != null) {
                var18_18.addAll(var25_25);
            }
            Intrinsics.checkNotNull(var13_13);
            if (var17_17 >= var10_10) {
                var13_13 = jn2_0.b((Intent)var13_13);
            } else {
                var29_29 = "RETURN_ITEMS_SUBREASONS";
                var10_10 = (var13_13 = var13_13.getSerializableExtra((String)var29_29)) instanceof Object;
                if (var10_10 == 0) {
                    var9_9 = 0;
                    var13_13 = null;
                }
                var29_29 = var13_13;
                var29_29 = var13_13;
                var13_13 = (Serializable)var13_13;
            }
            var21_21 = var13_13;
            var21_21 = (List)var13_13;
            var13_13 = var3_3.B;
            if (var13_13 != null) {
                var25_25 = var3_3.i;
                Intrinsics.checkNotNull(var25_25);
                var27_27 = var3_3.g;
                Intrinsics.checkNotNull(var27_27);
                var28_28 /* !! */  = this.Pa().exchangeReason.exchangeReasonCL;
                Intrinsics.checkNotNullExpressionValue(var28_28 /* !! */ , "exchangeReasonCL");
                var29_29 = var3_3.i;
                Intrinsics.checkNotNull(var29_29);
                var30_30 = var29_29.getIsReturnItem();
                var26_26 /* !! */  = null;
                var29_29 = var18_18;
                var18_18 = var25_25;
                var25_25 = var27_27;
                var27_27 = var28_28 /* !! */ ;
                var16_16 /* !! */  = var6_6;
                var31_31 = var15_15;
                var15_15 = null;
                var14_14 = 0;
                var13_13.e((ArrayList)var29_29, (List)var21_21, (CartEntry)var18_18, (FragmentActivity)var25_25, (View)var28_28 /* !! */ , var30_30, (NestedScrollView)var6_6, null, null);
            } else {
                var31_31 = var15_15;
            }
            var9_9 = R$id.tvErrorImage;
            var13_13 = (TextView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.p = var13_13;
            var9_9 = R$id.lbl_return_verification;
            var13_13 = (TextView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.q = var13_13;
            var9_9 = R$id.lbl_capture_image;
            var13_13 = (TextView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.r = var13_13;
            var9_9 = R$id.return_layout_barcode;
            var13_13 = var4_4 /* !! */ .findViewById(var9_9);
            var3_3.k = var13_13;
            var9_9 = R$id.clProductCode;
            var13_13 = (RelativeLayout)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.y = var13_13;
            var9_9 = R$id.et_barcode;
            var13_13 = (EditText)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.m = var13_13;
            this.Pa().returnLayoutBarcode.lblNoProductCode.setOnClickListener(var3_3);
            var9_9 = R$id.ivImageOne;
            var13_13 = var4_4 /* !! */ .findViewById(var9_9);
            var16_16 /* !! */  = var13_13;
            var16_16 /* !! */  = (ImageView)var13_13;
            var3_3.v = var16_16 /* !! */ ;
            if (var16_16 /* !! */  == null) {
                var13_13 = "imageViewOne";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setClipToOutline((boolean)var5_5);
            var9_9 = R$id.ivImageTwo;
            var13_13 = var4_4 /* !! */ .findViewById(var9_9);
            var16_16 /* !! */  = var13_13;
            var16_16 /* !! */  = (ImageView)var13_13;
            var3_3.w = var16_16 /* !! */ ;
            if (var16_16 /* !! */  == null) {
                var13_13 = "imageViewTwo";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setClipToOutline((boolean)var5_5);
            var9_9 = R$id.ivImageThree;
            var13_13 = var4_4 /* !! */ .findViewById(var9_9);
            var16_16 /* !! */  = var13_13;
            var16_16 /* !! */  = (ImageView)var13_13;
            var3_3.x = var16_16 /* !! */ ;
            if (var16_16 /* !! */  == null) {
                var13_13 = "imageViewThree";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setClipToOutline((boolean)var5_5);
            var9_9 = R$id.tvTakeImage;
            var13_13 = (TextView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.n = var13_13;
            var9_9 = R$id.return_item_comments_box;
            var13_13 = (EditText)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.l = var13_13;
            var9_9 = R$id.tvTotalChars;
            var13_13 = (TextView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.o = var13_13;
            var9_9 = R$id.ivDeleteOne;
            var13_13 = (ImageView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.s = var13_13;
            var9_9 = R$id.ivDeleteTwo;
            var13_13 = (ImageView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.t = var13_13;
            var9_9 = R$id.ivDeleteThree;
            var13_13 = (ImageView)var4_4 /* !! */ .findViewById(var9_9);
            var3_3.u = var13_13;
            var16_16 /* !! */  = var3_3.n;
            if (var16_16 /* !! */  == null) {
                var13_13 = "takeImageTv";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
            var16_16 /* !! */  = var3_3.s;
            if (var16_16 /* !! */  == null) {
                var13_13 = "deleteOneImv";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
            var16_16 /* !! */  = var3_3.t;
            if (var16_16 /* !! */  == null) {
                var13_13 = "deleteTwoImv";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
            var16_16 /* !! */  = var3_3.u;
            if (var16_16 /* !! */  == null) {
                var13_13 = "deleteThreeImv";
                Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                var16_16 /* !! */  = null;
            }
            var16_16 /* !! */ .setOnClickListener((View.OnClickListener)var3_3);
            var13_13 = this.Pa().returnLayoutBarcode;
            var13_13.tvProductCode.setOnClickListener(var3_3);
            var13_13.imvBarcode.setOnClickListener(var3_3);
            var13_13 = var3_3.i;
            Intrinsics.checkNotNull(var13_13);
            var13_13 = var13_13.getBarCode();
            var9_9 = (int)TextUtils.isEmpty((CharSequence)var13_13);
            var29_29 = "barcodeEt";
            if (var9_9 == 0) {
                var16_16 /* !! */  = var3_3.m;
                if (var16_16 /* !! */  == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)var29_29);
                    var16_16 /* !! */  = null;
                }
                var13_13 = var3_3.i;
                Intrinsics.checkNotNull(var13_13);
                var13_13 = var13_13.getBarCode();
                var16_16 /* !! */ .setText((CharSequence)var13_13);
            }
            var13_13 = var3_3.i;
            Intrinsics.checkNotNull(var13_13);
            var13_13 = var13_13.getCancelComments();
            var9_9 = (int)TextUtils.isEmpty((CharSequence)var13_13);
            if (var9_9 == 0) {
                var16_16 /* !! */  = var3_3.o;
                if (var16_16 /* !! */  == null) {
                    var13_13 = "lblChar";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                    var16_16 /* !! */  = null;
                }
                var16_16 /* !! */ .setVisibility(0);
                var16_16 /* !! */  = var3_3.l;
                if (var16_16 /* !! */  == null) {
                    var13_13 = "commentEt";
                    Intrinsics.throwUninitializedPropertyAccessException((String)var13_13);
                    var16_16 /* !! */  = null;
                }
                var16_16 /* !! */ .setVisibility(0);
            }
            var13_13 = var3_3.i;
            Intrinsics.checkNotNull(var13_13);
            var13_13 = var13_13.getImageInfoList();
            if (var13_13 == null) ** GOTO lbl-1000
            var13_13 = var3_3.i;
            Intrinsics.checkNotNull(var13_13);
            var13_13 = var13_13.getImageInfoList();
            var9_9 = var13_13.size();
            if (var9_9 > 0) {
                var3_3.h4((boolean)var5_5);
                var13_13 = var3_3.i;
                Intrinsics.checkNotNull(var13_13);
                var13_13 = var13_13.getImageInfoList();
                var9_9 = var13_13.size();
                var21_21 = null;
                for (var17_17 = 0; var17_17 < var9_9; var17_17 += var5_5) {
                    var18_18 = new uy2_2();
                    var25_25 = var3_3.i;
                    Intrinsics.checkNotNull(var25_25);
                    var18_18.c = var25_25 = ((ImageFileInfo)var25_25.getImageInfoList().get(var17_17)).getFilePath();
                    var25_25 = var3_3.i;
                    Intrinsics.checkNotNull(var25_25);
                    var25_25 = ((ImageFileInfo)var25_25.getImageInfoList().get(var17_17)).getFileUri();
                    if (var25_25 != null) {
                        var25_25 = var3_3.i;
                        Intrinsics.checkNotNull(var25_25);
                        var25_25 = Uri.parse((String)((ImageFileInfo)var25_25.getImageInfoList().get(var17_17)).getFileUri());
                        var18_18.e = var25_25;
                    }
                    var25_25 = var3_3.i;
                    Intrinsics.checkNotNull(var25_25);
                    var18_18.a = var25_25 = ((ImageFileInfo)var25_25.getImageInfoList().get(var17_17)).getImageName();
                    var3_3.Va((uy2_2)var18_18);
                }
                var6_6.scrollTo(0, 0);
            } else lbl-1000:
            // 2 sources

            {
                var3_3.h4(false);
            }
            var16_16 /* !! */  = var3_3.m;
            if (var16_16 /* !! */  == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)var29_29);
                var16_16 /* !! */  = null;
            }
            var6_6 = new dN2$c(var3_3);
            var16_16 /* !! */ .addTextChangedListener((TextWatcher)var6_6);
            var6_6 = var3_3.F;
            Intrinsics.checkNotNull(var6_6);
            var6_6.L();
            var6_6 = this.Qa();
            var13_13 = var3_3.i;
            var16_16 /* !! */  = var13_13 != null ? var13_13.getWrongItemComments() : null;
            var6_6.getClass();
            if (var16_16 /* !! */  == null) break block65;
            var13_13 = var31_31;
            var10_10 = (int)StringsKt.F((CharSequence)var16_16 /* !! */ , var31_31, false);
            if (var10_10 != var5_5) break block65;
            var29_29 = var3_3.i;
            var16_16 /* !! */  = var29_29 != null ? var29_29.getWrongItemComments() : null;
            if (var16_16 /* !! */  == null) ** GOTO lbl-1000
            var13_13 = new String[]{var13_13};
            var10_10 = 6;
            if ((var13_13 = StringsKt.a0((CharSequence)var16_16 /* !! */ , (String[])var13_13, false, 0, var10_10)) != null) {
                var13_13 = var13_13.get(0);
                var16_16 /* !! */  = var13_13;
                var16_16 /* !! */  = (String)var13_13;
            } else lbl-1000:
            // 2 sources

            {
                var16_16 /* !! */  = null;
            }
            var6_6.d = var16_16 /* !! */ ;
            var13_13 = this.Pa().returnLayoutBarcode.tvProductCode;
            var10_10 = R$string.return_subreason_product_tag_submitted_msg;
            var29_29 = var3_3.getString(var10_10);
            var13_13.setText((CharSequence)var29_29);
            var10_10 = R$drawable.ic_circle_tick;
            var13_13.setCompoundDrawablesWithIntrinsicBounds(var10_10, 0, 0, 0);
            var3_3.E = var5_5;
        }
        if ((var5_5 = (int)var6_6.c) != 0) {
            var32_32 = md3_0.c((jD3)var6_6);
            var10_10 = 0;
            var29_29 = null;
            var13_13 = new lm2_1((NM2)var6_6, null);
            var12_12 = 3;
            Ae3.d((i90_0)var32_32, null, null, (Function2)var13_13, var12_12);
        } else {
            var10_10 = 0;
            var29_29 = null;
        }
        var5_5 = (int)var3_3.J;
        if (var5_5 != 0) {
            var16_16 /* !! */  = var3_3.y;
            if (var16_16 /* !! */  == null) {
                var32_32 = "clProductCode";
                Intrinsics.throwUninitializedPropertyAccessException((String)var32_32);
                var16_16 /* !! */  = null;
            }
            ai0_2.i((View)var16_16 /* !! */ );
            var32_32 = this.Pa().returnLayoutBarcode.tvProductCode;
            var6_6 = "tvProductCode";
            Intrinsics.checkNotNullExpressionValue(var32_32, (String)var6_6);
            ai0_2.i((View)var32_32);
        }
        if ((var5_5 = (int)var3_3.K) != 0) {
            var16_16 /* !! */  = var3_3.p;
            if (var16_16 /* !! */  == null) {
                var32_32 = "lblImageError";
                Intrinsics.throwUninitializedPropertyAccessException((String)var32_32);
                var16_16 /* !! */  = null;
            }
            var5_5 = R$string.error_image_upload_new;
            var32_32 = var3_3.getString(var5_5);
            var16_16 /* !! */ .setText((CharSequence)var32_32);
            var16_16 /* !! */  = var3_3.q;
            if (var16_16 /* !! */  == null) {
                var32_32 = "lblReturnVerification";
                Intrinsics.throwUninitializedPropertyAccessException((String)var32_32);
                var16_16 /* !! */  = null;
            }
            var5_5 = R$string.verify_return_request;
            var32_32 = var3_3.getString(var5_5);
            var16_16 /* !! */ .setText((CharSequence)var32_32);
            var16_16 /* !! */  = var3_3.r;
            if (var16_16 /* !! */  == null) {
                var32_32 = "lblCaptureImage";
                Intrinsics.throwUninitializedPropertyAccessException((String)var32_32);
                var16_16 /* !! */  = null;
            }
            var5_5 = R$string.upload_return_image_desc;
            var32_32 = var3_3.getString(var5_5);
            var16_16 /* !! */ .setText((CharSequence)var32_32);
        }
        var5_5 = R$id.tvReturnReasonDesc;
        var4_4 /* !! */  = var4_4 /* !! */ .findViewById(var5_5);
        Intrinsics.checkNotNullExpressionValue(var4_4 /* !! */ , (String)var11_11);
        var4_4 /* !! */  = (TextView)var4_4 /* !! */ ;
        var32_32 = h40_0.a;
        var16_16 /* !! */  = h40_0.s0(false);
        if (var16_16 /* !! */  == null) ** GOTO lbl-1000
        var32_32 = var16_16 /* !! */ .getMaster();
        var5_5 = (int)Intrinsics.areEqual(var32_32, var6_6 = Boolean.TRUE);
        if (var5_5 == 0 || (var5_5 = (int)Intrinsics.areEqual(var32_32 = var16_16 /* !! */ .getReturn_request_reason_enabled(), var6_6)) == 0 || (var32_32 = var16_16 /* !! */ .getReturn_request_reason_desc()) == null || (var5_5 = var32_32.length()) == 0) {
            var16_16 /* !! */  = null;
        }
        if (var16_16 /* !! */  != null) {
            var32_32 = var16_16 /* !! */ .getReturn_request_reason_desc();
            var4_4 /* !! */ .setText((CharSequence)var32_32);
            ai0_2.B(var4_4 /* !! */ );
            var4_4 /* !! */  = new Bundle();
            var32_32 = this.getArguments();
            var6_6 = "order_status";
            var16_16 /* !! */  = var32_32 != null ? var32_32.getString((String)var6_6) : null;
            var4_4 /* !! */ .putString((String)var6_6, (String)var16_16 /* !! */ );
            var32_32 = this.getArguments();
            var6_6 = "order_id";
            var16_16 /* !! */  = var32_32 != null ? var32_32.getString((String)var6_6) : null;
            var4_4 /* !! */ .putString((String)var6_6, (String)var16_16 /* !! */ );
            var21_21 = var3_3.H;
            var18_18 = var21_21.getORDER_ITEM_DETAILS_INTERACTION_CATEGORY();
            var28_28 /* !! */  = var21_21.getORDER_ITEM_DETAILS_INTERACTION_EVENT();
            var32_32 = AnalyticsManager.Companion;
            var26_26 /* !! */  = cv_0.a((AnalyticsManager$Companion)var32_32);
            var23_23 = null;
            var25_25 = "appropriate reason selection message";
            var27_27 = "seen";
            var16_16 /* !! */  = "order item details screen";
            var15_15 = null;
            var14_14 = 0;
            var33_33 = 1632;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)var21_21, (String)var18_18, (String)var25_25, (String)var27_27, (String)var28_28 /* !! */ , (String)var16_16 /* !! */ , null, null, (Bundle)var4_4 /* !! */ , (String)var26_26 /* !! */ , false, null, var33_33, null);
            var4_4 /* !! */  = Unit.a;
        } else lbl-1000:
        // 2 sources

        {
            ai0_2.i(var4_4 /* !! */ );
            var4_4 /* !! */  = Unit.a;
        }
    }

    public final void r7(int n3) {
        int n4;
        Object object = this.i;
        Intrinsics.checkNotNull(object);
        ((CartEntry)object).setReturnEditedQuantity(n3);
        object = this.i;
        int n7 = 1;
        if (object != null && (object = ((CartEntry)object).getQuantity()) != null && (n4 = ((Integer)object).intValue()) == n7) {
            AppCompatTextView appCompatTextView = this.Pa().freeBiesView;
            object = "freeBiesView";
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, (String)object);
            ai0_2.i((View)appCompatTextView);
        } else {
            object = this.i;
            Object object2 = null;
            Object object3 = "getRoot(...)";
            if (object != null && (object = ((CartEntry)object).getQuantity()) != null && n3 == (n4 = ((Integer)object).intValue())) {
                Object object4 = a21.a;
                object = this.Pa().freeBiesView;
                Cloneable cloneable = this.h;
                if (cloneable != null) {
                    Object object5 = this.i;
                    object5 = object5 != null && (object5 = ((CartEntry)object5).getProduct()) != null ? ((Product)object5).getCode() : null;
                    cloneable = (ArrayList)cloneable.get(object5);
                } else {
                    cloneable = null;
                }
                object4.getClass();
                a21.j((AppCompatTextView)object, (ArrayList)cloneable, n7 != 0, n7 != 0);
                object4 = this.i;
                if (object4 != null && (n3 = (int)(((CartEntry)object4).isExchangeItem() ? 1 : 0)) == 0) {
                    object4 = this.i;
                    if (object4 != null && (object4 = ((CartEntry)object4).getProduct()) != null) {
                        object4 = ((Product)object4).getCode();
                    } else {
                        n3 = 0;
                        object4 = null;
                    }
                    if (object4 != null && (n3 = ((String)object4).length()) != 0 && (object4 = this.h) != null) {
                        object = this.i;
                        if (object != null && (object = ((CartEntry)object).getProduct()) != null) {
                            object = ((Product)object).getCode();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        n3 = (int)(object4.containsKey(object) ? 1 : 0);
                        if (n3 == n7) {
                            object4 = a21$a.RETURN_REFUND;
                            object = this.Pa().productReturn.getRoot();
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            Cloneable cloneable2 = this.h;
                            if (cloneable2 != null) {
                                object3 = this.i;
                                object3 = object3 != null && (object3 = ((CartEntry)object3).getProduct()) != null ? ((Product)object3).getCode() : null;
                                cloneable2 = (ArrayList)cloneable2.get(object3);
                            } else {
                                n7 = 0;
                                cloneable2 = null;
                            }
                            a21.h((a21$a)((Object)object4), (View)object, (ArrayList)cloneable2, null);
                        }
                    }
                }
            } else {
                Object object6;
                Object object7 = this.i;
                if (object7 != null && (n3 = (int)(((CartEntry)object7).isExchangeItem() ? 1 : 0)) == 0) {
                    object7 = this.i;
                    if (object7 != null && (object7 = ((CartEntry)object7).getProduct()) != null) {
                        object7 = ((Product)object7).getCode();
                    } else {
                        n3 = 0;
                        object7 = null;
                    }
                    if (object7 != null && (n3 = ((String)object7).length()) != 0 && (object7 = this.h) != null) {
                        object = this.i;
                        if (object != null && (object = ((CartEntry)object).getProduct()) != null) {
                            object = ((Product)object).getCode();
                        } else {
                            n4 = 0;
                            object = null;
                        }
                        n3 = (int)(object7.containsKey(object) ? 1 : 0);
                        if (n3 == n7) {
                            object7 = a21.a;
                            object = a21$a.MSG_QUANTITY_CHANGE;
                            object6 = this.Pa().productReturn.getRoot();
                            Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
                            object3 = this.h;
                            if (object3 != null) {
                                Object object8 = this.i;
                                object8 = object8 != null && (object8 = ((CartEntry)object8).getProduct()) != null ? ((Product)object8).getCode() : null;
                                object3 = (ArrayList)object3.get(object8);
                            } else {
                                object3 = null;
                            }
                            a21.i((a21)object7, (a21$a)((Object)object), (View)object6, (ArrayList)object3);
                        }
                    }
                }
                object7 = a21.a;
                object = this.Pa().freeBiesView;
                object3 = this.h;
                if (object3 != null) {
                    object6 = this.i;
                    if (object6 != null && (object6 = object6.getProduct()) != null) {
                        object2 = ((Product)object6).getCode();
                    }
                    object2 = (ArrayList)object3.get(object2);
                }
                object7.getClass();
                n3 = 0;
                object7 = null;
                a21.j((AppCompatTextView)object, (ArrayList)object2, false, n7 != 0);
            }
        }
    }

    public final String u6() {
        EditText editText = this.m;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("barcodeEt");
            editText = null;
        }
        return editText.getText().toString();
    }

    public final void v0(int n3) {
        this.Ta(n3);
    }
}

