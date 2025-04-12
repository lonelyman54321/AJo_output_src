/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class StaggeredGridLayoutManager$LazySpanLookup {
    public int[] a;
    public List b;

    public final void a(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem) {
        ArrayList arrayList = this.b;
        if (arrayList == null) {
            this.b = arrayList = new ArrayList();
        }
        arrayList = this.b;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(i3);
            int n7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a;
            int n8 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (n7 == n8) {
                List list = this.b;
                list.remove(i3);
            }
            if ((n4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem2.a) < (n7 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a)) continue;
            this.b.add(i3, staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
            return;
        }
        this.b.add(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem);
    }

    public final void b() {
        int[] nArray = this.a;
        if (nArray != null) {
            int n3 = -1;
            Arrays.fill(nArray, n3);
        }
        this.b = null;
    }

    public final void c(int n3) {
        int[] nArray = this.a;
        int n4 = -1;
        if (nArray == null) {
            int n7 = 10;
            n3 = Math.max(n3, n7) + 1;
            int[] nArray2 = new int[n3];
            this.a = nArray2;
            Arrays.fill(nArray2, n4);
        } else {
            int n8 = nArray.length;
            if (n3 >= n8) {
                for (n8 = nArray.length; n8 <= n3; n8 *= 2) {
                }
                int[] nArray3 = new int[n8];
                this.a = nArray3;
                n8 = nArray.length;
                System.arraycopy(nArray, 0, nArray3, 0, n8);
                nArray3 = this.a;
                int n10 = nArray.length;
                n8 = nArray3.length;
                Arrays.fill(nArray3, n10, n8, n4);
            }
        }
    }

    public final void d(int n3) {
        List list = this.b;
        if (list != null) {
            for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
                Object object = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(i3);
                int n4 = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object).a;
                if (n4 < n3) continue;
                object = this.b;
                object.remove(i3);
            }
        }
        this.g(n3);
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem e(int n3, int n4, int n7) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        int n8 = list.size();
        for (int i3 = 0; i3 < n8; ++i3) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(i3);
            int n10 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (n10 >= n4) {
                return null;
            }
            if (n10 < n3 || n7 != 0 && (n10 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.b) != n7 && (n10 = (int)(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.d ? 1 : 0)) == 0) continue;
            return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        }
        return null;
    }

    public final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem f(int n3) {
        List list = this.b;
        if (list == null) {
            return null;
        }
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(i3);
            int n4 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.a;
            if (n4 != n3) continue;
            return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public final int g(int var1_1) {
        block8: {
            block9: {
                var2_2 = this.a;
                var3_3 = -1;
                if (var2_2 == null) {
                    return var3_3;
                }
                var4_4 = ((int[])var2_2).length;
                if (var1_1 >= var4_4) {
                    return var3_3;
                }
                var2_2 = this.b;
                if (var2_2 == null) lbl-1000:
                // 2 sources

                {
                    while (true) {
                        var4_4 = -1;
                        break block8;
                        break;
                    }
                }
                var2_2 = this.f(var1_1);
                if (var2_2 != null) {
                    var5_6 = this.b;
                    var5_6.remove(var2_2);
                }
                var2_2 = this.b;
                var4_4 = var2_2.size();
                var5_6 = null;
                for (var6_5 = 0; var6_5 < var4_4; ++var6_5) {
                    var7_7 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(var6_5);
                    var8_8 = var7_7.a;
                    if (var8_8 < var1_1) {
                        continue;
                    }
                    break block9;
                }
                var6_5 = -1;
            }
            ** while (var6_5 == var3_3)
lbl30:
            // 1 sources

            var2_2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(var6_5);
            var7_7 = this.b;
            var7_7.remove(var6_5);
            var4_4 = var2_2.a;
        }
        if (var4_4 == var3_3) {
            var2_2 = this.a;
            var6_5 = ((int[])var2_2).length;
            Arrays.fill((int[])var2_2, var1_1, var6_5, var3_3);
            return this.a.length;
        }
        ++var4_4;
        var6_5 = this.a.length;
        var4_4 = Math.min(var4_4, var6_5);
        Arrays.fill(this.a, var1_1, var4_4, var3_3);
        return var4_4;
    }

    public final void h(int n3, int n4) {
        int n7;
        Object object = this.a;
        if (object != null && n3 < (n7 = ((int[])object).length)) {
            n7 = n3 + n4;
            this.c(n7);
            Object object2 = this.a;
            int n8 = ((int[])object2).length - n3 - n4;
            System.arraycopy(object2, n3, object2, n7, n8);
            object2 = this.a;
            n8 = -1;
            Arrays.fill(object2, n3, n7, n8);
            object = this.b;
            if (object != null) {
                for (n7 = object.size() + -1; n7 >= 0; n7 += -1) {
                    object2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(n7);
                    n8 = object2.a;
                    if (n8 < n3) continue;
                    object2.a = n8 += n4;
                }
            }
        }
    }

    public final void i(int n3, int n4) {
        int n7;
        int[] nArray = this.a;
        if (nArray != null && n3 < (n7 = nArray.length)) {
            n7 = n3 + n4;
            this.c(n7);
            Object object = this.a;
            int n8 = ((int[])object).length - n3 - n4;
            System.arraycopy(object, n7, object, n3, n8);
            object = this.a;
            n8 = ((int[])object).length - n4;
            int n10 = ((int[])object).length;
            int n14 = -1;
            Arrays.fill((int[])object, n8, n10, n14);
            object = this.b;
            if (object != null) {
                for (int i3 = object.size() + -1; i3 >= 0; i3 += -1) {
                    Object object2 = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)this.b.get(i3);
                    n10 = ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object2).a;
                    if (n10 < n3) continue;
                    if (n10 < n7) {
                        object2 = this.b;
                        object2.remove(i3);
                        continue;
                    }
                    ((StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem)object2).a = n10 -= n4;
                }
            }
        }
    }
}

