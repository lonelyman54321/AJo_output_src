/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.SpannableStringBuilder
 */
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class W93
extends SpannableStringBuilder {
    public final Class a;
    public final ArrayList b;

    public W93(Class clazz, CharSequence arrayList) {
        super((CharSequence)((Object)arrayList));
        this.b = arrayList = new ArrayList();
        B41.c(clazz, "watcherClass cannot be null");
        this.a = clazz;
    }

    public W93(Class clazz, CharSequence arrayList, int n3, int n4) {
        super((CharSequence)((Object)arrayList), n3, n4);
        this.b = arrayList = new ArrayList();
        B41.c(clazz, "watcherClass cannot be null");
        this.a = clazz;
    }

    public final void a() {
        Serializable serializable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(serializable = this.b)).size()); ++i3) {
            serializable = ((W93$a)((ArrayList)serializable).get((int)i3)).b;
            ((AtomicInteger)serializable).incrementAndGet();
        }
    }

    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable append(CharSequence charSequence, int n3, int n4) {
        super.append(charSequence, n3, n4);
        return this;
    }

    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, int n3, int n4) {
        super.append(charSequence, n3, n4);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object object, int n3) {
        super.append(charSequence, object, n3);
        return this;
    }

    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Appendable append(CharSequence charSequence, int n3, int n4) {
        super.append(charSequence, n3, n4);
        return this;
    }

    public final void b() {
        Object object;
        int n3;
        this.e();
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object = this.b)).size()); ++i3) {
            object = (W93$a)((ArrayList)object).get(i3);
            n3 = this.length();
            int n4 = this.length();
            ((W93$a)object).onTextChanged((CharSequence)((Object)this), 0, n3, n4);
        }
    }

    public final W93$a c(Object object) {
        Object object2;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object2 = this.b)).size()); ++i3) {
            object2 = (W93$a)((ArrayList)object2).get(i3);
            Object object3 = ((W93$a)object2).a;
            if (object3 != object) continue;
            return object2;
        }
        return null;
    }

    public final boolean d(Object clazz) {
        boolean bl2;
        Class clazz2;
        if (clazz != null && (clazz2 = this.a) == (clazz = clazz.getClass())) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        return bl2;
    }

    public final Editable delete(int n3, int n4) {
        super.delete(n3, n4);
        return this;
    }

    public final SpannableStringBuilder delete(int n3, int n4) {
        super.delete(n3, n4);
        return this;
    }

    public final void e() {
        Serializable serializable;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(serializable = this.b)).size()); ++i3) {
            serializable = ((W93$a)((ArrayList)serializable).get((int)i3)).b;
            ((AtomicInteger)serializable).decrementAndGet();
        }
    }

    public final int getSpanEnd(Object object) {
        W93$a w93$a;
        boolean bl2 = this.d(object);
        if (bl2 && (w93$a = this.c(object)) != null) {
            object = w93$a;
        }
        return super.getSpanEnd(object);
    }

    public final int getSpanFlags(Object object) {
        W93$a w93$a;
        boolean bl2 = this.d(object);
        if (bl2 && (w93$a = this.c(object)) != null) {
            object = w93$a;
        }
        return super.getSpanFlags(object);
    }

    public final int getSpanStart(Object object) {
        W93$a w93$a;
        boolean bl2 = this.d(object);
        if (bl2 && (w93$a = this.c(object)) != null) {
            object = w93$a;
        }
        return super.getSpanStart(object);
    }

    public final Object[] getSpans(int n3, int n4, Class clazz) {
        Class<W93$a> clazz2 = this.a;
        if (clazz2 == clazz) {
            int n7;
            clazz2 = W93$a.class;
            W93$a[] w93$aArray = (W93$a[])super.getSpans(n3, n4, clazz2);
            n4 = w93$aArray.length;
            Object[] objectArray = (Object[])Array.newInstance(clazz, n4);
            clazz = null;
            for (int i3 = 0; i3 < (n7 = w93$aArray.length); ++i3) {
                objectArray[i3] = clazz2 = w93$aArray[i3].a;
            }
            return objectArray;
        }
        return super.getSpans(n3, n4, clazz);
    }

    public final Editable insert(int n3, CharSequence charSequence) {
        super.insert(n3, charSequence);
        return this;
    }

    public final Editable insert(int n3, CharSequence charSequence, int n4, int n7) {
        super.insert(n3, charSequence, n4, n7);
        return this;
    }

    public final SpannableStringBuilder insert(int n3, CharSequence charSequence) {
        super.insert(n3, charSequence);
        return this;
    }

    public final SpannableStringBuilder insert(int n3, CharSequence charSequence, int n4, int n7) {
        super.insert(n3, charSequence, n4, n7);
        return this;
    }

    public final int nextSpanTransition(int n3, int n4, Class clazz) {
        Class clazz2;
        if (clazz == null || (clazz2 = this.a) == clazz) {
            clazz = W93$a.class;
        }
        return super.nextSpanTransition(n3, n4, clazz);
    }

    public final void removeSpan(Object object) {
        W93$a w93$a;
        boolean bl2 = this.d(object);
        if (bl2) {
            w93$a = this.c(object);
            if (w93$a != null) {
                object = w93$a;
            }
        } else {
            bl2 = false;
            w93$a = null;
        }
        super.removeSpan(object);
        if (w93$a != null) {
            object = this.b;
            ((ArrayList)object).remove(w93$a);
        }
    }

    public final SpannableStringBuilder replace(int n3, int n4, CharSequence charSequence) {
        this.a();
        super.replace(n3, n4, charSequence);
        this.e();
        return this;
    }

    public final SpannableStringBuilder replace(int n3, int n4, CharSequence charSequence, int n7, int n8) {
        this.a();
        super.replace(n3, n4, charSequence, n7, n8);
        this.e();
        return this;
    }

    public final void setSpan(Object object, int n3, int n4, int n7) {
        boolean bl2 = this.d(object);
        if (bl2) {
            W93$a w93$a = new W93$a(object);
            this.b.add(w93$a);
            object = w93$a;
        }
        super.setSpan(object, n3, n4, n7);
    }

    public final CharSequence subSequence(int n3, int n4) {
        Class clazz = this.a;
        W93 w93 = new W93(clazz, (CharSequence)((Object)this), n3, n4);
        return w93;
    }
}

