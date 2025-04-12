/*
 * Decompiled with CFR 0.152.
 */
package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2$g;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public final class a
extends ViewPager2$g {
    public final ArrayList a;

    public a() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList(3);
    }

    public final void onPageScrollStateChanged(int n3) {
        ConcurrentModificationException concurrentModificationException2;
        Object object;
        block9: {
            block8: {
                object = this.a;
                try {
                    object = ((ArrayList)object).iterator();
                }
                catch (ConcurrentModificationException concurrentModificationException2) {
                    break block9;
                }
                while (true) {
                    boolean bl2 = object.hasNext();
                    if (!bl2) break block8;
                    break;
                }
                {
                    Object object2 = object.next();
                    object2 = (ViewPager2$g)object2;
                    ((ViewPager2$g)object2).onPageScrollStateChanged(n3);
                    continue;
                }
            }
            return;
        }
        object = new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException2);
        throw object;
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
        ConcurrentModificationException concurrentModificationException2;
        block9: {
            block8: {
                Object object = this.a;
                try {
                    object = ((ArrayList)object).iterator();
                }
                catch (ConcurrentModificationException concurrentModificationException2) {
                    break block9;
                }
                while (true) {
                    boolean bl2 = object.hasNext();
                    if (!bl2) break block8;
                    break;
                }
                {
                    Object object2 = object.next();
                    object2 = (ViewPager2$g)object2;
                    ((ViewPager2$g)object2).onPageScrolled(n3, f5, n4);
                    continue;
                }
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException2);
        throw illegalStateException;
    }

    public final void onPageSelected(int n3) {
        ConcurrentModificationException concurrentModificationException2;
        Object object;
        block9: {
            block8: {
                object = this.a;
                try {
                    object = ((ArrayList)object).iterator();
                }
                catch (ConcurrentModificationException concurrentModificationException2) {
                    break block9;
                }
                while (true) {
                    boolean bl2 = object.hasNext();
                    if (!bl2) break block8;
                    break;
                }
                {
                    Object object2 = object.next();
                    object2 = (ViewPager2$g)object2;
                    ((ViewPager2$g)object2).onPageSelected(n3);
                    continue;
                }
            }
            return;
        }
        object = new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException2);
        throw object;
    }
}

