/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

public final class Cz2 {
    public final List a;

    public Cz2(int n3) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
    }

    public final void a(int n3) {
        int n4;
        Number number;
        int n7;
        List list = this.a;
        Object object = list;
        object = list;
        int n8 = object.isEmpty();
        int n10 = 1;
        if ((n8 ^= n10) != 0 && ((n8 = ((Number)(object = (Number)list.get(0))).intValue()) == n3 || (n8 = ((Number)(object = (Number)on_2.d(n10, list))).intValue()) == n3)) {
            return;
        }
        n8 = list.size();
        Integer n14 = n3;
        list.add(n14);
        while (n8 > 0 && n3 > (n7 = (number = (Number)list.get(n4 = (n8 + 1 >>> n10) - n10)).intValue())) {
            number = n7;
            list.set(n8, number);
            n8 = n4;
        }
        Integer n15 = n3;
        list.set(n8, n15);
    }

    /*
     * Unable to fully structure code
     */
    public final int b() {
        var1_1 = this.a;
        var2_2 = var1_1.size();
        var3_3 = 1;
        if (var2_2 > 0) {
            var2_2 = 1;
        } else {
            var2_2 = 0;
            var4_4 = null;
        }
        if (var2_2 != 0) {
            var4_4 = (Number)var1_1.get(0);
            var2_2 = var4_4.intValue();
            block0: while (true) {
                var5_5 = var1_1;
                var5_5 = var1_1;
                var6_6 = var5_5.isEmpty() ^ var3_3;
                if (var6_6 == 0 || (var6_6 = (var5_5 = (Number)var1_1.get(0)).intValue()) != var2_2) break;
                var5_5 = CollectionsKt.S(var1_1);
                var1_1.set(0, var5_5);
                var6_6 = var1_1.size() - var3_3;
                var1_1.remove(var6_6);
                var6_6 = var1_1.size();
                var7_7 = var1_1.size() >>> var3_3;
                var8_8 = 0;
                var9_9 = null;
                while (true) {
                    if (var8_8 >= var7_7) continue block0;
                    var10_10 = (Number)var1_1.get(var8_8);
                    var11_11 = var10_10.intValue();
                    var12_12 = (var8_8 + 1) * 2;
                    var13_13 = var12_12 + -1;
                    var14_14 = (Number)var1_1.get(var13_13);
                    var15_15 = var14_14.intValue();
                    if (var12_12 < var6_6 && (var17_17 = (var16_16 = (Number)var1_1.get(var12_12)).intValue()) > var15_15) {
                        if (var17_17 <= var11_11) continue block0;
                        var18_18 = var17_17;
                        var1_1.set(var8_8, var18_18);
                        var9_9 = var11_11;
                        var1_1.set(var12_12, var9_9);
                        var8_8 = var12_12;
                        continue;
                    }
                    if (var15_15 > var11_11) ** break;
                    continue block0;
                    var19_19 = var15_15;
                    var1_1.set(var8_8, var19_19);
                    var9_9 = var11_11;
                    var1_1.set(var13_13, var9_9);
                    var8_8 = var13_13;
                }
                break;
            }
            return var2_2;
        }
        p30_0.c("Set is empty");
        throw null;
    }
}

