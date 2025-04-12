/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Editable
 *  android.text.SpanWatcher
 *  android.text.Spannable
 *  android.text.TextWatcher
 */
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class W93$a
implements TextWatcher,
SpanWatcher {
    public final Object a;
    public final AtomicInteger b;

    public W93$a(Object object) {
        AtomicInteger atomicInteger;
        this.b = atomicInteger = new AtomicInteger(0);
        this.a = object;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher)this.a).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        ((TextWatcher)this.a).beforeTextChanged(charSequence, n3, n4, n7);
    }

    public final void onSpanAdded(Spannable spannable, Object object, int n3, int n4) {
        AtomicInteger atomicInteger = this.b;
        int n7 = atomicInteger.get();
        if (n7 > 0 && (n7 = object instanceof Ty0) != 0) {
            return;
        }
        ((SpanWatcher)this.a).onSpanAdded(spannable, object, n3, n4);
    }

    /*
     * Unable to fully structure code
     */
    public final void onSpanChanged(Spannable var1_1, Object var2_2, int var3_3, int var4_4, int var5_5, int var6_6) {
        var7_7 = this.b;
        var8_8 = var7_7.get();
        if (var8_8 > 0 && (var8_8 = var2_2 instanceof Ty0) != 0) {
            return;
        }
        var8_8 = Build.VERSION.SDK_INT;
        var9_9 = 28;
        if (var8_8 >= var9_9) ** GOTO lbl-1000
        var8_8 = 0;
        var7_7 = null;
        if (var3_3 > var4_4) {
            var3_3 = 0;
            var10_10 = null;
        }
        if (var5_5 > var6_6) {
            var11_11 = var3_3;
            var12_12 = 0;
        } else lbl-1000:
        // 2 sources

        {
            var11_11 = var3_3;
            var12_12 = var5_5;
        }
        var10_10 = this.a;
        ((SpanWatcher)var10_10).onSpanChanged(var1_1, var2_2, var11_11, var4_4, var12_12, var6_6);
    }

    public final void onSpanRemoved(Spannable spannable, Object object, int n3, int n4) {
        AtomicInteger atomicInteger = this.b;
        int n7 = atomicInteger.get();
        if (n7 > 0 && (n7 = object instanceof Ty0) != 0) {
            return;
        }
        ((SpanWatcher)this.a).onSpanRemoved(spannable, object, n3, n4);
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        ((TextWatcher)this.a).onTextChanged(charSequence, n3, n4, n7);
    }
}

