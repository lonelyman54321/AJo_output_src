/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout
 *  android.text.TextPaint
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class Cn {
    public static final RectF l;
    public static final ConcurrentHashMap m;
    public int a = 0;
    public boolean b = false;
    public float c;
    public float d;
    public float e;
    public int[] f;
    public boolean g;
    public TextPaint h;
    public final TextView i;
    public final Context j;
    public final Cn$d k;

    static {
        Object object;
        l = object = new RectF();
        object = new ConcurrentHashMap();
        m = object;
    }

    public Cn(TextView object) {
        float f5;
        this.c = f5 = -1.0f;
        this.d = f5;
        this.e = f5;
        int[] nArray = new int[]{};
        this.f = nArray;
        this.g = false;
        this.i = object;
        object = object.getContext();
        this.j = object;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 29;
        if (n3 >= n4) {
            this.k = object;
        } else {
            n4 = 23;
            if (n3 >= n4) {
                super();
                this.k = object;
            } else {
                super();
                this.k = object;
            }
        }
    }

    public static int[] b(int[] nArray) {
        int n3;
        int n4 = nArray.length;
        if (n4 == 0) {
            return nArray;
        }
        Arrays.sort(nArray);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n7 = 0;
        Integer n8 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            Integer n10;
            int n14;
            int n15 = nArray[n3];
            if (n15 <= 0 || (n14 = Collections.binarySearch(arrayList, n10 = Integer.valueOf(n15))) >= 0) continue;
            Integer n16 = n15;
            arrayList.add(n16);
        }
        n3 = arrayList.size();
        if (n4 == n3) {
            return nArray;
        }
        int n17 = arrayList.size();
        int[] nArray2 = new int[n17];
        while (n7 < n17) {
            n8 = (Integer)arrayList.get(n7);
            nArray2[n7] = n3 = n8.intValue();
            ++n7;
        }
        return nArray2;
    }

    public static Method d(String string2) {
        Object object;
        block7: {
            ConcurrentHashMap concurrentHashMap;
            try {
                concurrentHashMap = m;
            }
            catch (Exception exception) {
                return null;
            }
            object = concurrentHashMap.get(string2);
            object = (Method)object;
            if (object != null) break block7;
            object = TextView.class;
            object = ((Class)object).getDeclaredMethod(string2, null);
            if (object == null) break block7;
            boolean bl2 = true;
            ((AccessibleObject)object).setAccessible(bl2);
            concurrentHashMap.put(string2, object);
        }
        return object;
    }

    public static Object e(Object object, String object2, Object object3) {
        object2 = Cn.d((String)object2);
        try {
            object3 = ((Method)object2).invoke(object, null);
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (Exception exception) {}
        return object3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        block15: {
            int n3 = this.f();
            if (n3 == 0) {
                return;
            }
            n3 = this.b;
            if (n3 != 0) {
                int n4;
                float f5;
                Object object = this.i;
                n3 = object.getMeasuredHeight();
                if (n3 <= 0) return;
                object = this.i;
                n3 = object.getMeasuredWidth();
                if (n3 <= 0) {
                    return;
                }
                object = this.k;
                TextView textView = this.i;
                n3 = ((Cn$d)object).b(textView) ? 1 : 0;
                if (n3 != 0) {
                    n3 = 0x100000;
                    f5 = 1.469368E-39f;
                } else {
                    object = this.i;
                    n3 = object.getMeasuredWidth();
                    n4 = this.i.getTotalPaddingLeft();
                    n3 -= n4;
                    textView = this.i;
                    n4 = textView.getTotalPaddingRight();
                    n3 -= n4;
                }
                textView = this.i;
                n4 = textView.getHeight();
                int n7 = this.i.getCompoundPaddingBottom();
                n4 -= n7;
                TextView textView2 = this.i;
                n7 = textView2.getCompoundPaddingTop();
                if (n3 <= 0) return;
                if ((n4 -= n7) <= 0) {
                    return;
                }
                textView2 = l;
                synchronized (textView2) {
                    Throwable throwable2;
                    block14: {
                        float f6;
                        try {
                            textView2.setEmpty();
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                        f5 = n3;
                        {
                            textView2.right = f5;
                        }
                        f5 = n4;
                        {
                            textView2.bottom = f5;
                            n3 = this.c((RectF)textView2);
                        }
                        f5 = n3;
                        {
                            textView = this.i;
                            f6 = textView.getTextSize();
                        }
                        n4 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
                        if (n4 != 0) {
                            n4 = 0;
                            f6 = 0.0f;
                            textView = null;
                            this.g(f5, 0);
                        }
                        break block15;
                    }
                    throw throwable2;
                }
            }
        }
        this.b = true;
    }

    public final int c(RectF rectF) {
        Object object;
        block9: {
            Cn cn2 = this;
            object = rectF;
            int[] nArray = this.f;
            int n3 = nArray.length;
            if (n3 == 0) break block9;
            int n4 = 1;
            n3 -= n4;
            int n7 = 1;
            int n8 = 0;
            while (n7 <= n3) {
                block12: {
                    block11: {
                        float f5;
                        float f6;
                        float f7;
                        int n10;
                        Object object2;
                        block10: {
                            int n14;
                            n8 = (n7 + n3) / 2;
                            object2 = cn2.f;
                            n10 = object2[n8];
                            TextView textView = cn2.i;
                            CharSequence charSequence = textView.getText();
                            Object object3 = textView.getTransformationMethod();
                            if (object3 != null && (object3 = object3.getTransformation(charSequence, (View)textView)) != null) {
                                charSequence = object3;
                            }
                            int n15 = textView.getMaxLines();
                            Object object4 = cn2.h;
                            if (object4 == null) {
                                cn2.h = object4 = new TextPaint();
                            } else {
                                object4.reset();
                            }
                            object4 = cn2.h;
                            Object object5 = textView.getPaint();
                            object4.set(object5);
                            object4 = cn2.h;
                            f7 = n10;
                            object4.setTextSize(f7);
                            object4 = Layout.Alignment.ALIGN_NORMAL;
                            Object object6 = object2 = (Object)Cn.e(textView, "getLayoutAlignment", object4);
                            object6 = (Layout.Alignment)object2;
                            f7 = object.right;
                            int n16 = Math.round(f7);
                            n10 = Build.VERSION.SDK_INT;
                            int n17 = 23;
                            if (n10 >= n17) {
                                TextPaint textPaint = cn2.h;
                                object2 = cn2.k;
                                textView = cn2.i;
                                object4 = charSequence;
                                object5 = object6;
                                int n18 = n16;
                                n16 = n15;
                                object6 = textView;
                                object2 = Cn$a.a(charSequence, (Layout.Alignment)object5, n18, n15, textView, textPaint, (Cn$d)object2);
                            } else {
                                float f8 = textView.getLineSpacingMultiplier();
                                float f11 = textView.getLineSpacingExtra();
                                boolean bl2 = textView.getIncludeFontPadding();
                                object2 = new StaticLayout;
                                TextPaint textPaint = cn2.h;
                                object4 = object2;
                                object5 = charSequence;
                                object2(charSequence, textPaint, n16, (Layout.Alignment)object6, f8, f11, bl2);
                            }
                            int n19 = -1;
                            f6 = 0.0f / 0.0f;
                            if (n15 == n19) break block10;
                            n19 = object2.getLineCount();
                            if (n19 > n15) break block11;
                            n19 = object2.getLineCount() - n4;
                            if ((n19 = object2.getLineEnd(n19)) != (n14 = charSequence.length())) break block11;
                        }
                        if ((n10 = (int)((f5 = (f7 = (float)object2.getHeight()) - (f6 = object.bottom)) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) <= 0) break block12;
                    }
                    n3 = n8 += -1;
                    continue;
                }
                int n20 = n8 + 1;
                n8 = n7;
                n7 = n20;
            }
            return cn2.f[n8];
        }
        object = new IllegalStateException("No available text sizes to choose from.");
        throw object;
    }

    public final boolean f() {
        boolean bl2 = this.j();
        bl2 = bl2 && (bl2 = this.a);
        return bl2;
    }

    public final void g(float f5, int n3) {
        TextView textView;
        float f6;
        Object object = this.j;
        object = object == null ? Resources.getSystem() : object.getResources();
        object = object.getDisplayMetrics();
        float f7 = (f5 = TypedValue.applyDimension((int)n3, (float)f5, (DisplayMetrics)object)) - (f6 = (object = (textView = this.i).getPaint()).getTextSize());
        float f8 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (f8 != false) {
            textView.getPaint().setTextSize(f5);
            boolean bl2 = textView.isInLayout();
            object = textView.getLayout();
            if (object != null) {
                block7: {
                    f8 = 0.0f;
                    f6 = 0.0f;
                    this.b = false;
                    object = "nullLayouts";
                    try {
                        object = Cn.d((String)object);
                        if (object == null) break block7;
                    }
                    catch (Exception exception) {}
                    ((Method)object).invoke((Object)textView, null);
                }
                if (!bl2) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        int n3;
        int n4 = this.j();
        if (n4 != 0 && (n4 = this.a) == (n3 = 1)) {
            int[] nArray;
            n4 = this.g ? 1 : 0;
            if (n4 == 0 || (n4 = (nArray = this.f).length) == 0) {
                float f5 = this.e;
                float f6 = this.d;
                f5 -= f6;
                f6 = this.c;
                double d2 = Math.floor(f5 /= f6);
                n4 = (int)d2 + n3;
                int[] nArray2 = new int[n4];
                for (int i3 = 0; i3 < n4; ++i3) {
                    int n7;
                    float f7 = this.d;
                    float f8 = i3;
                    float f11 = this.c;
                    f8 = f8 * f11 + f7;
                    nArray2[i3] = n7 = Math.round(f8);
                }
                this.f = nArray = Cn.b(nArray2);
            }
            this.b = n3;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final boolean i() {
        int[] nArray = this.f;
        int n3 = nArray.length;
        int n4 = 0;
        float f5 = 0.0f;
        int n7 = 1;
        boolean bl2 = n3 > 0;
        this.g = bl2;
        if (bl2) {
            float f6;
            this.a = n7;
            n4 = nArray[0];
            this.d = f5 = (float)n4;
            this.e = f6 = (float)nArray[n3 -= n7];
            this.c = f6 = -1.0f;
        }
        return bl2;
    }

    public final boolean j() {
        return this.i instanceof AppCompatEditText ^ true;
    }

    public final void k(float f5, float f6, float f7) {
        CharSequence charSequence = "px) is less or equal to (0px)";
        int n3 = 0;
        float f8 = f5 - 0.0f;
        float f11 = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (f11 > 0) {
            f11 = f6 == f5 ? 0 : (f6 < f5 ? -1 : 1);
            if (f11 > 0) {
                float f12 = f7 - 0.0f;
                n3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (n3 > 0) {
                    this.a = 1;
                    this.d = f5;
                    this.e = f6;
                    this.c = f7;
                    this.g = false;
                    return;
                }
                String string2 = g9_0.a(f7, "The auto-size step granularity (", (String)charSequence);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            charSequence = new StringBuilder("Maximum auto-size text size (");
            ((StringBuilder)charSequence).append(f6);
            ((StringBuilder)charSequence).append("px) is less or equal to minimum auto-size text size (");
            ((StringBuilder)charSequence).append(f5);
            ((StringBuilder)charSequence).append("px)");
            String string3 = ((StringBuilder)charSequence).toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
            throw illegalArgumentException;
        }
        String string4 = g9_0.a(f5, "Minimum auto-size text size (", (String)charSequence);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string4);
        throw illegalArgumentException;
    }
}

