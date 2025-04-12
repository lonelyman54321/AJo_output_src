/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.inapp.f;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

public final class f0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (f)this.b;
                n3 = (int)(object.j ? 1 : 0);
                if (n3 == 0) {
                    Object object2;
                    View view = object.n.a();
                    object.s = object2 = object.l.getLayoutParams();
                    object2 = object.n;
                    boolean bl2 = true;
                    object2.d(bl2);
                    object.q.removeAllViews();
                    object2 = object.k;
                    if (object2 == null) {
                        Context context = object.c;
                        object2 = new di_2((f)object, context);
                        object.k = object2;
                        int n4 = -1;
                        object2 = new FrameLayout.LayoutParams(n4, n4);
                        Object object3 = object.c;
                        context = new FrameLayout(object3);
                        object.r = context;
                        object3 = object.k;
                        object3.addContentView((View)context, object2);
                    }
                    object2 = object.r;
                    object2.addView(view);
                    object.j = bl2;
                    object = object.k;
                    object.show();
                } else {
                    object.db();
                }
                return;
            }
            case 1: {
                Object object4 = "this$0";
                cc_0 cc_02 = (cc_0)this.b;
                Intrinsics.checkNotNullParameter(cc_02, (String)object4);
                int n7 = object.getId();
                n3 = R$id.oselrTvMoreDetails;
                if (n7 == n3) {
                    n7 = cc_02.l ^ 1;
                    cc_02.l = n7;
                    object4 = cc_02.f;
                    TextView textView = cc_02.c;
                    int n8 = 8;
                    if (n7 != 0) {
                        object = hv3_0.K(R$string.less_details_luxe);
                        textView.setText((CharSequence)object);
                        n7 = 0;
                        object = null;
                        object4.setVisibility(0);
                        float f5 = cc_02.j;
                        textView = cc_02.g;
                        int n10 = 0;
                        Object var8_13 = null;
                        float f6 = f5 - 0.0f;
                        float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                        if (f7 > 0) {
                            TextView textView2 = cc_02.d;
                            object4 = qz2_0.u(f5);
                            textView2.setText((CharSequence)object4);
                            f7 = 0.0f;
                            object4 = new Bc(cc_02, 0);
                            textView2 = cc_02.i;
                            textView2.setOnClickListener((View.OnClickListener)object4);
                            textView.setVisibility(0);
                        } else {
                            textView.setVisibility(n8);
                        }
                        f5 = cc_02.k;
                        textView = cc_02.h;
                        float f8 = f5 - 0.0f;
                        n10 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                        if (n10 > 0) {
                            cc_02 = cc_02.e;
                            object4 = qz2_0.u(f5);
                            cc_02.setText((CharSequence)object4);
                            textView.setVisibility(0);
                        } else {
                            textView.setVisibility(n8);
                        }
                    } else {
                        object4.setVisibility(n8);
                        n7 = R$string.more_details_luxe;
                        object = hv3_0.K(n7);
                        textView.setText((CharSequence)object);
                    }
                }
                return;
            }
            case 0: 
        }
        i0 i03 = (i0)this.b;
        Intrinsics.checkNotNullParameter(i03, "this$0");
        i03.a.Q3();
    }
}

