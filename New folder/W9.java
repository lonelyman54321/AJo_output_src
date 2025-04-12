/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import androidx.lifecycle.LiveData;
import com.facebook.applinks.a;
import com.facebook.applinks.a$a;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;

public final class W9
implements a$a,
ol0$a_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ W9(Object object) {
        this.a = object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(File var1_1) {
        block23: {
            block22: {
                var2_2 = var1_1;
                var3_5 = 4;
                var4_6 = 1;
                var5_7 /* !! */  = this;
                var6_8 = (List)this.a;
                Intrinsics.checkNotNullParameter(var6_8, "$slaves");
                var7_9 = "file";
                Intrinsics.checkNotNullParameter(var1_1, (String)var7_9);
                var8_10 /* !! */  = xp1_2.m;
                Intrinsics.checkNotNullParameter(var1_1, (String)var7_9);
                var8_10 /* !! */  = zz3_0.a;
                var8_10 /* !! */  = zz3_0.class;
                var9_11 = td0.b(var8_10 /* !! */ );
                var10_12 = 0;
                var11_13 = null;
                if (var9_11 != 0) return;
                try {
                    Intrinsics.checkNotNullParameter(var1_1, (String)var7_9);
                    var7_9 = new FileInputStream(var1_1);
                    var13_15 = var7_9.available();
                    var14_16 = new DataInputStream((InputStream)var7_9);
                    var7_9 = new byte[var13_15];
                    var14_16.readFully((byte[])var7_9);
                    var14_16.close();
                    if (var13_15 < var3_5) break block22;
                    var14_16 = ByteBuffer.wrap((byte[])var7_9, 0, var3_5);
                    var15_17 = ByteOrder.LITTLE_ENDIAN;
                    var14_16.order((ByteOrder)var15_17);
                    var9_11 = var14_16.getInt();
                    var16_18 = var9_11 + 4;
                    if (var13_15 < var16_18) break block22;
                    var17_19 = Charsets.UTF_8;
                    var12_14 = new HashMap<Object, Object>((byte[])var7_9, var3_5, var9_11, var17_19);
                    var14_16 = new JSONObject((String)var12_14);
                    var12_14 = var14_16.names();
                    var18_20 = var12_14.length();
                    var19_21 = new String[var18_20];
                    for (var20_22 = 0; var20_22 < var18_20; var20_22 += var4_6) {
                        var21_23 = var12_14.getString(var20_22);
                        var19_21[var20_22] = var21_23;
                    }
                    var12_14 = "<this>";
                }
                catch (Throwable var2_3) {}
                {
                    Intrinsics.checkNotNullParameter(var19_21, (String)var12_14);
                    if (var18_20 > var4_6) {
                        Arrays.sort(var19_21);
                    }
                    var12_14 = new HashMap<Object, Object>();
                }
            }
            return;
            td0.a(var8_10 /* !! */ , var2_3);
            return;
            catch (Exception v0) {
                return;
            }
            for (var20_22 = 0; var20_22 < var18_20; var20_22 += var3_5) {
                var21_23 = var19_21[var20_22];
                if (var21_23 != null) {
                    var22_24 = var14_16.getJSONArray((String)var21_23);
                    var10_12 = var22_24.length();
                    var23_25 = new int[var10_12];
                    var24_26 = null;
                    var25_27 = 1;
                    for (var4_6 = 0; var4_6 < var10_12; var25_27 *= var26_28, ++var4_6) {
                        var26_28 = var22_24.getInt(var4_6);
                        var23_25[var4_6] = var26_28;
                    }
                    var4_6 = 4;
                    var10_12 = var25_27 * 4;
                    var27_29 = var16_18 + var10_12;
                    if (var27_29 <= var13_15) ** break;
                    return;
                    {
                        var11_13 = ByteBuffer.wrap((byte[])var7_9, var16_18, var10_12);
                        var15_17 = ByteOrder.LITTLE_ENDIAN;
                        var11_13.order((ByteOrder)var15_17);
                        var15_17 = new wg1_1((int[])var23_25);
                        var23_25 = var11_13.asFloatBuffer();
                        var11_13 = var15_17.c;
                        var4_6 = 0;
                        var24_26 = null;
                        var23_25.get((float[])var11_13, 0, var25_27);
                        var12_14.put(var21_23, var15_17);
                        var16_18 = var27_29;
                    }
                }
                var3_5 = 1;
                var5_7 /* !! */  = this;
                var3_5 = 4;
                var4_6 = 1;
                var10_12 = 0;
                var11_13 = null;
            }
            if (var12_14 == null) return;
            var23_25 = new HashMap();
            var24_26 = xp1_2.class;
            var13_15 = (int)td0.b(var24_26);
            if (var13_15 == 0) {
                try {
                    var2_2 = xp1_2.m;
                    break block23;
                }
                catch (Throwable var2_4) {
                    var5_7 /* !! */  = var2_4;
                    td0.a(var24_26, var2_4);
                }
            }
            var13_15 = 0;
            var2_2 = null;
        }
        var24_26 = var12_14.entrySet().iterator();
        while ((var25_27 = var24_26.hasNext()) != 0) {
            var5_7 /* !! */  = (Map.Entry)var24_26.next();
            var7_9 = (String)var5_7 /* !! */ .getKey();
            var8_10 /* !! */  = var5_7 /* !! */ .getKey();
            var28_30 = var2_2.containsKey(var8_10 /* !! */ );
            if (var28_30) {
                var7_9 = var5_7 /* !! */ .getKey();
                if ((var7_9 = (String)var2_2.get(var7_9)) == null) {
                    return;
                }
            }
            var5_7 /* !! */  = var5_7 /* !! */ .getValue();
            var23_25.put(var7_9, var5_7 /* !! */ );
        }
        if (var23_25 == null) return;
        try {
            var22_24 = var2_2 = new xp1_2((HashMap)var23_25);
        }
        catch (Exception v1) {}
        return;
        if (var22_24 == null) return;
        var2_2 = var6_8.iterator();
        while ((var3_5 = (int)var2_2.hasNext()) != 0) {
            var23_25 = (HP1$b)var2_2.next();
            var24_26 = new StringBuilder();
            var5_7 /* !! */  = var23_25.a;
            var24_26.append((String)var5_7 /* !! */ );
            var24_26.append('_');
            var25_27 = var23_25.d;
            var24_26 = g30.a(var25_27, "_rule", (StringBuilder)var24_26);
            var5_7 /* !! */  = new ip1_1((HP1$b)var23_25, (xp1_2)var22_24);
            var7_9 = zz3_0.a();
            var6_8 = new File((File)var7_9, (String)var24_26);
            var23_25 = var23_25.c;
            if (var23_25 == null || (var4_6 = var6_8.exists()) != 0) {
                var3_5 = 0;
                var23_25 = null;
                var5_7 /* !! */ .a((File)var6_8);
                continue;
            }
            var24_26 = new ol0_2((String)var23_25, (File)var6_8, (ol0$a_0)var5_7 /* !! */ );
            var3_5 = 0;
            var23_25 = null;
            var5_7 /* !! */  = new String[]{};
            var24_26.execute(var5_7 /* !! */ );
        }
    }

    public void b(a object) {
        Object object2 = (x9_0)this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null && (object3 = object.a) != null) {
            int n3;
            int n4;
            object3 = String.valueOf(object3);
            int n7 = ((String)object3).length();
            int n8 = 1;
            n7 -= n8;
            int n10 = 0;
            int n14 = 0;
            while (true) {
                n4 = 32;
                if (n10 > n7) break;
                int n15 = n14 == 0 ? n10 : n7;
                n15 = Intrinsics.compare(((String)object3).charAt(n15), n4);
                n15 = n15 <= 0 ? 1 : 0;
                if (n14 == 0) {
                    if (n15 == 0) {
                        n14 = 1;
                        continue;
                    }
                    ++n10;
                    continue;
                }
                if (n15 == 0) break;
                n7 += -1;
            }
            if ((n3 = ((String)(object3 = ((Object)((String)object3).subSequence(n10, n7 += n8)).toString())).length()) > 0) {
                object = String.valueOf(object.a);
                n3 = object.length() - n8;
                n7 = 0;
                String string2 = null;
                n10 = 0;
                while (n7 <= n3) {
                    n14 = n10 == 0 ? n7 : n3;
                    n14 = Intrinsics.compare(object.charAt(n14), n4);
                    n14 = n14 <= 0 ? 1 : 0;
                    if (n10 == 0) {
                        if (n14 == 0) {
                            n10 = 1;
                            continue;
                        }
                        ++n7;
                        continue;
                    }
                    if (n14 == 0) break;
                    n3 += -1;
                }
                object = com.jio.jioads.adinterfaces.a.a(n3, n8, n7, (String)object);
                object3 = "://";
                n3 = (int)((object = fT1.a((String)object3, (String)object)).isEmpty() ? 1 : 0);
                if (n3 == 0) {
                    n3 = object.size();
                    object3 = object.listIterator(n3);
                    while ((n7 = (int)(object3.hasPrevious() ? 1 : 0)) != 0) {
                        string2 = (String)object3.previous();
                        n7 = string2.length();
                        if (n7 == 0) continue;
                        object = (Iterable)object;
                        n3 = object3.nextIndex() + n8;
                        object = CollectionsKt.f0((Iterable)object, n3);
                        break;
                    }
                } else {
                    object = mz0_2.a;
                }
                object = (Collection)object;
                object3 = new String[]{};
                object = object.toArray((T[])object3);
                n3 = ((String[])object).length;
                if (n3 > n8) {
                    object2 = ((x9_0)object2).f;
                    object3 = DataCallback.Companion;
                    object = object[n8];
                    object = ((DataCallback$Companion)object3).onSuccess(object);
                    ((LiveData)object2).i(object);
                }
            }
        }
    }
}

