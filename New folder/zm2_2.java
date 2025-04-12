/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.plp.ProgressRequestBody;
import com.ril.ajio.plp.ProgressRequestBody$a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZM2
 */
public final class zm2_2
extends BottomSheetDialogFragment
implements jn2_1,
ProgressRequestBody$a {
    public static final zm2$a_0 Companion;
    public aN2 a;
    public LiveData b;
    public AppCompatImageView c;
    public RecyclerView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public AjioTextView i;
    public in2_1 j;
    public AjioCircularImageView k;
    public int l = -1;
    public fn2_1 m;
    public boolean n;
    public boolean o;
    public final ArrayList p;
    public final ArrayList q;

    static {
        zm2$a_0 zm2$a_0;
        Companion = zm2$a_0 = new Object();
    }

    public zm2_2() {
        ArrayList arrayList;
        this.p = arrayList = new ArrayList();
        this.q = arrayList = new ArrayList();
    }

    public final void N3(int n3) {
        ArrayList arrayList = this.p;
        int n4 = arrayList.size();
        if (n3 < n4) {
            fn2_1 fn2_12;
            this.l = n3;
            this.m = fn2_12 = (fn2_1)arrayList.get(n3);
            if (fn2_12 != null) {
                fn2_12.g = true;
                int n7 = this.l;
                arrayList.remove(n7);
                n7 = this.l;
                arrayList.add(n7, fn2_12);
                this.m = fn2_12;
                int n8 = this.l;
                this.Qa(n8);
            }
            this.Ra(n3);
        }
    }

    public final int Oa() {
        boolean bl2;
        Iterator iterator = this.p.iterator();
        int n3 = 0;
        while (bl2 = iterator.hasNext()) {
            fn2_1 fn2_12 = (fn2_1)iterator.next();
            bl2 = fn2_12.e;
            if (!bl2) continue;
            ++n3;
        }
        return n3;
    }

    public final void Pa() {
        int n3;
        boolean bl2;
        this.o = bl2 = true;
        AjioCircularImageView ajioCircularImageView = this.k;
        String string2 = "selectedIconCheck";
        TextView textView = null;
        if (ajioCircularImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ajioCircularImageView = null;
        }
        int n4 = R$drawable.rounded_rect_black_bg;
        ajioCircularImageView.setBackgroundResource(n4);
        ajioCircularImageView = this.k;
        if (ajioCircularImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ajioCircularImageView = null;
        }
        int n7 = R$drawable.ic_done;
        ajioCircularImageView.setImageResource(n7);
        ajioCircularImageView = this.e;
        string2 = "tvUploadImage";
        if (ajioCircularImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ajioCircularImageView = null;
        }
        ajioCircularImageView.setEnabled(bl2);
        ajioCircularImageView = this.e;
        if (ajioCircularImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            ajioCircularImageView = null;
        }
        ajioCircularImageView.setClickable(bl2);
        TextView textView2 = this.e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            textView2 = null;
        }
        n3 = hv3_0.m(R$color.white);
        textView2.setTextColor(n3);
        textView2 = this.e;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            textView = textView2;
        }
        textView2 = hv3_0.r(R$drawable.rounded_rect_8_black_bg);
        textView.setBackground((Drawable)textView2);
    }

    public final void Qa(int n3) {
        Handler handler = new Handler();
        ym2_1 ym2_12 = new ym2_1(this, n3);
        handler.postDelayed((Runnable)ym2_12, 200L);
    }

    public final void Ra(int n3) {
        Object object = this.p;
        Object object2 = ((fn2_1)((ArrayList)object).get((int)n3)).b;
        int n4 = ((String)object2).length();
        if (n4 != 0 && (n3 = (int)(((File)(object = new File((String)object2))).exists() ? 1 : 0)) != 0) {
            object2 = pj2_2.Companion;
            Object object3 = jn1_0.d;
            object3 = JN1$a.b("application/octet-stream");
            object2.getClass();
            PJ2$a.a((jn1_0)object3, (File)object);
            object2 = new ProgressRequestBody((File)object, this);
            long l2 = System.currentTimeMillis();
            int n7 = 1000;
            long l3 = n7;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(l2 /= l3);
            object = stringBuilder.toString();
            object3 = "file";
            object2 = cR1$c$a.a((String)object3, (String)object, (pj2_2)object2);
            object = this.a;
            if (object != null) {
                object.X3((cr1$c_0)object2);
            }
            n3 = 1;
            this.n = n3;
        }
    }

    public final void U() {
        fn2_1 fn2_12 = this.m;
        int n3 = this.l;
        if (n3 >= 0 && fn2_12 != null) {
            fn2_12.h = 100;
            fn2_12.e = true;
            fn2_12.g = false;
            ArrayList arrayList = this.p;
            arrayList.remove(n3);
            n3 = this.l;
            arrayList.add(n3, fn2_12);
            int n4 = this.l;
            this.Qa(n4);
        }
    }

    public final void o8(int n3) {
        ArrayList arrayList = this.p;
        int n4 = arrayList.size();
        if (n3 < n4) {
            fn2_1 fn2_12;
            this.l = n3;
            this.m = fn2_12 = (fn2_1)arrayList.get(n3);
            n4 = arrayList.size();
            if (n3 < n4) {
                boolean bl2;
                this.l = n3;
                fn2_12 = (fn2_1)arrayList.get(n3);
                fn2_12.f = bl2 = true;
                arrayList.remove(n3);
                arrayList.add(n3, fn2_12);
                n3 = this.l;
                this.Qa(n3);
            }
            n3 = this.l;
            this.Ra(n3);
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        xm2_1 xm2_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)xm2_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.return_form_bottom_sheet;
        Object object2 = null;
        layoutInflater = layoutInflater.inflate(n3, object, false);
        Intrinsics.checkNotNull(layoutInflater);
        int n4 = R$id.id_image_search_close_dialog;
        object = (AppCompatImageView)layoutInflater.findViewById(n4);
        this.c = object;
        n4 = R$id.rvTakeImage;
        object = (RecyclerView)layoutInflater.findViewById(n4);
        this.d = object;
        n4 = R$id.cb_guideline;
        object = (AjioCircularImageView)layoutInflater.findViewById(n4);
        this.k = object;
        n4 = R$id.tv_upload_image;
        object = (TextView)layoutInflater.findViewById(n4);
        this.e = object;
        n4 = R$id.tvErrorImage;
        object = (AjioTextView)layoutInflater.findViewById(n4);
        this.i = object;
        n4 = R$id.tv_guideline_1_message;
        object = (TextView)layoutInflater.findViewById(n4);
        this.f = object;
        n4 = R$id.tv_guideline_2_message;
        object = (TextView)layoutInflater.findViewById(n4);
        this.g = object;
        n4 = R$id.tv_guideline_3_message;
        object = (TextView)layoutInflater.findViewById(n4);
        this.h = object;
        object = this.f;
        n3 = 0;
        bundle = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvGuidelineMessage1");
            n4 = 0;
            object = null;
        }
        Object object3 = tm2_0.a();
        object.setText((CharSequence)object3);
        object = this.g;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvGuidelineMessage2");
            n4 = 0;
            object = null;
        }
        object3 = um2_0.a();
        object.setText((CharSequence)object3);
        object = this.h;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvGuidelineMessage3");
            n4 = 0;
            object = null;
        }
        object3 = vm2_1.a();
        object.setText((CharSequence)object3);
        n4 = this.Oa();
        int n7 = 2;
        if (n4 >= n7) {
            this.Pa();
        }
        object = this.d;
        object3 = "rvImages";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n4 = 0;
            object = null;
        }
        Context context = this.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        object.setLayoutManager(linearLayoutManager);
        object = new in2_1(this);
        this.j = object;
        object = this.d;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n4 = 0;
            object = null;
        }
        object2 = this.j;
        object3 = "imagesAdapter";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object2 = null;
        }
        object.setAdapter((RecyclerView$f)object2);
        object = this.j;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            n4 = 0;
            object = null;
        }
        object2 = this.p;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "images");
        object3 = object.b;
        ((ArrayList)object3).clear();
        ((ArrayList)object3).addAll(object2);
        object.notifyDataSetChanged();
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ivClose");
            n4 = 0;
            object = null;
        }
        n7 = 2;
        object2 = new cy1_0(this, n7);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.k;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("selectedIconCheck");
            n4 = 0;
            object = null;
        }
        n7 = 1;
        object2 = new dy1_0(this, n7);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.e;
        if (object == null) {
            object = "tvUploadImage";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            bundle = object;
        }
        object = new wm2_1(this);
        bundle.setOnClickListener((View.OnClickListener)object);
        return layoutInflater;
    }

    public final void onDismiss(DialogInterface object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "dialog");
        super.onDismiss((DialogInterface)object);
        object = this.p.iterator();
        int n3 = 0;
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            int n4 = n3 + 1;
            if (n3 >= 0) {
                object2 = (fn2_1)object2;
                bl2 = ((fn2_1)object2).d;
                if (bl2 && (object2 = this.a) != null) {
                    object2.v0(n3);
                }
                n3 = n4;
                continue;
            }
            xx_2.n();
            throw null;
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.layout_parent_image_search;
        object = (ConstraintLayout)object.findViewById(n3);
        Object object3 = Looper.getMainLooper();
        object2 = new Handler(object3);
        int n4 = 1;
        object3 = new in2_0(object, n4);
        long l2 = 300L;
        object2.postDelayed((Runnable)object3, l2);
        object = this.b;
        if (object != null) {
            object2 = this.getViewLifecycleOwner();
            n4 = 3;
            object3 = new C5(this, n4);
            zm2$b_0 zm2$b_0 = new zm2$b_0((C5)object3);
            ((LiveData)object).e((mu1_1)object2, zm2$b_0);
        }
    }

    public final void t7(int n3) {
        int n4;
        fn2_1 fn2_12 = this.m;
        int n7 = this.l;
        if (n7 >= 0 && fn2_12 != null && n3 > (n4 = fn2_12.h + 10)) {
            fn2_12.h = n3;
            ArrayList arrayList = this.p;
            arrayList.remove(n7);
            n7 = this.l;
            arrayList.add(n7, fn2_12);
            this.m = fn2_12;
            n3 = this.l;
            this.Qa(n3);
        }
    }

    public final void w4() {
        aN2 aN22 = this.a;
        if (aN22 != null) {
            aN22.h6();
        }
    }

    public final void za(int n3) {
        Object object = this.p;
        ((ArrayList)object).remove(n3);
        in2_1 in2_12 = this.j;
        if (in2_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagesAdapter");
            in2_12 = null;
        }
        in2_12.getClass();
        Intrinsics.checkNotNullParameter(object, "images");
        ArrayList arrayList = in2_12.b;
        arrayList.clear();
        arrayList.addAll(object);
        in2_12.notifyDataSetChanged();
        object = this.a;
        if (object != null) {
            object.v0(n3);
        }
    }
}

