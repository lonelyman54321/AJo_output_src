/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

public final class tq3
implements F62 {
    public final /* synthetic */ uq3 a;

    public /* synthetic */ tq3(uq3 uq32) {
        this.a = uq32;
    }

    public final void onChanged(Object object) {
        object = (Pair)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        HttpTransaction httpTransaction = (HttpTransaction)((Pair)object).a;
        object = (Boolean)((Pair)object).b;
        boolean n3 = (Boolean)object;
        object2 = ((uq3)object2).b;
        String string2 = null;
        if (object2 != null) {
            if (httpTransaction == null) {
                boolean bl2 = false;
                object = null;
            } else {
                object = httpTransaction.getFormattedUrl(n3);
            }
            TextView textView = ((xU)object2).r;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl3 = false;
                object = null;
            } else {
                object = httpTransaction.getMethod();
            }
            textView = ((xU)object2).e;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl4 = false;
                object = null;
            } else {
                object = httpTransaction.getProtocol();
            }
            textView = ((xU)object2).f;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl5 = false;
                object = null;
            } else {
                object = httpTransaction.getStatus();
            }
            object = String.valueOf(object);
            textView = ((xU)object2).n;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl6 = false;
                object = null;
            } else {
                object = httpTransaction.getResponseSummaryText();
            }
            textView = ((xU)object2).i;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl7 = false;
                object = null;
            } else {
                boolean bl8 = httpTransaction.isSsl();
                object = bl8;
            }
            textView = null;
            Object object3 = ((xU)object2).l;
            if (object == null) {
                int n4 = 8;
                object3.setVisibility(n4);
            } else {
                Boolean bl9 = Boolean.TRUE;
                boolean bl10 = Intrinsics.areEqual(object, bl9);
                bl9 = ((xU)object2).m;
                if (bl10) {
                    object3.setVisibility(0);
                    int n7 = R$string.chucker_yes;
                    bl9.setText(n7);
                } else {
                    object3.setVisibility(0);
                    int n8 = R$string.chucker_no;
                    bl9.setText(n8);
                }
            }
            if (httpTransaction == null) {
                boolean bl11 = false;
                object = null;
            } else {
                object = httpTransaction.getResponseTlsVersion();
            }
            if (object != null) {
                object = ((xU)object2).p;
                object3 = httpTransaction.getResponseTlsVersion();
                object.setText((CharSequence)object3);
                object = ((xU)object2).o;
                ((Group)((Object)object)).setVisibility(0);
            }
            if (httpTransaction == null) {
                boolean bl12 = false;
                object = null;
            } else {
                object = httpTransaction.getResponseCipherSuite();
            }
            if (object != null) {
                object = ((xU)object2).c;
                object3 = httpTransaction.getResponseCipherSuite();
                object.setText((CharSequence)object3);
                object = ((xU)object2).b;
                ((Group)((Object)object)).setVisibility(0);
            }
            if (httpTransaction == null) {
                boolean bl13 = false;
                object = null;
            } else {
                object = httpTransaction.getRequestDateString();
            }
            textView = ((xU)object2).h;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl14 = false;
                object = null;
            } else {
                object = httpTransaction.getResponseDateString();
            }
            textView = ((xU)object2).k;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl15 = false;
                object = null;
            } else {
                object = httpTransaction.getDurationString();
            }
            textView = ((xU)object2).d;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl16 = false;
                object = null;
            } else {
                object = httpTransaction.getRequestSizeString();
            }
            textView = ((xU)object2).g;
            textView.setText((CharSequence)object);
            if (httpTransaction == null) {
                boolean bl17 = false;
                object = null;
            } else {
                object = httpTransaction.getResponseSizeString();
            }
            textView = ((xU)object2).j;
            textView.setText((CharSequence)object);
            if (httpTransaction != null) {
                string2 = httpTransaction.getTotalSizeString();
            }
            ((xU)object2).q.setText((CharSequence)string2);
            return;
        }
        Intrinsics.throwUninitializedPropertyAccessException("overviewBinding");
        throw null;
    }
}

