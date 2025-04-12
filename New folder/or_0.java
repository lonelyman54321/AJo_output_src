/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioAttributes
 *  android.media.AudioDeviceInfo
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioManager
 *  android.media.AudioProfile
 *  android.provider.Settings$Global
 *  android.util.Pair
 *  android.util.SparseArray
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.d;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet$Builder;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * Renamed from or
 */
public final class or_0 {
    public static final or_0 c;
    public static final ImmutableList d;
    public static final ImmutableMap e;
    public final SparseArray a;
    public final int b;

    static {
        Serializable serializable = ImmutableList.of(or$a.d);
        Object object = new or_0((ImmutableList)serializable);
        c = object;
        object = 2;
        serializable = Integer.valueOf(5);
        Integer n3 = 6;
        d = ImmutableList.of(object, serializable, n3);
        object = new ImmutableMap$Builder();
        object = ((ImmutableMap$Builder)object).put(serializable, n3);
        serializable = Integer.valueOf(17);
        object = ((ImmutableMap$Builder)object).put(serializable, n3);
        serializable = Integer.valueOf(7);
        object = ((ImmutableMap$Builder)object).put(serializable, n3);
        serializable = Integer.valueOf(30);
        Integer n4 = 10;
        object = ((ImmutableMap$Builder)object).put(serializable, n4);
        serializable = Integer.valueOf(18);
        object = ((ImmutableMap$Builder)object).put(serializable, n3);
        serializable = Integer.valueOf(8);
        object = ((ImmutableMap$Builder)object).put(n3, serializable).put(serializable, serializable);
        n3 = 14;
        e = ((ImmutableMap$Builder)object).put(n3, serializable).buildOrThrow();
    }

    public or_0(ImmutableList immutableList) {
        int n3;
        int n4;
        SparseArray sparseArray;
        this.a = sparseArray = new SparseArray();
        int n7 = 0;
        sparseArray = null;
        Object object = null;
        for (n4 = 0; n4 < (n3 = immutableList.size()); ++n4) {
            or$a or$a = (or$a)immutableList.get(n4);
            SparseArray sparseArray2 = this.a;
            int n8 = or$a.a;
            sparseArray2.put(n8, (Object)or$a);
        }
        int n10 = 0;
        immutableList = null;
        while (n7 < (n4 = (object = this.a).size())) {
            object = (or$a)this.a.valueAt(n7);
            n4 = object.b;
            n10 = Math.max(n10, n4);
            ++n7;
        }
        this.b = n10;
    }

    public static ImmutableList a(int[] nArray, int n3) {
        int n4;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        int n7 = 0;
        if (nArray == null) {
            nArray = new int[]{};
        }
        while (n7 < (n4 = nArray.length)) {
            n4 = nArray[n7];
            or$a or$a = new or$a(n4, n3);
            immutableList$Builder.add(or$a);
            ++n7;
        }
        return immutableList$Builder.build();
    }

    public static or_0 b(Context context, dr_1 dr_12, rr_0 rr_02) {
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        intentFilter = context.registerReceiver(null, intentFilter);
        return or_0.c(context, (Intent)intentFilter, dr_12, rr_02);
    }

    public static or_0 c(Context context, Intent intent, dr_1 dr_12, rr_0 rr_02) {
        Object object;
        Object object2;
        int n3;
        Serializable serializable;
        int n4;
        int n7;
        Object object3;
        Object object4 = intent;
        int n8 = 2;
        int n10 = 0;
        Object object5 = null;
        int n14 = 1;
        Object object6 = context;
        Object object7 = context.getSystemService("audio");
        object7.getClass();
        object7 = (AudioManager)object7;
        int n15 = 33;
        if (rr_02 != null) {
            object3 = rr_02;
        } else {
            n7 = gz3.a;
            n4 = 0;
            object3 = null;
            if (n7 >= n15) {
                try {
                    serializable = dr_12.a();
                }
                catch (RuntimeException runtimeException) {}
                serializable = ((dr$a_0)((Object)serializable)).a;
                serializable = lr_1.a((AudioManager)object7, (AudioAttributes)serializable);
                boolean bl2 = serializable.isEmpty();
                if (!bl2) {
                    serializable = mr_0.a(serializable.get(0));
                    object3 = new rr_0((AudioDeviceInfo)serializable);
                }
            }
        }
        n7 = gz3.a;
        String string2 = "android.hardware.type.automotive";
        int n16 = 23;
        ImmutableMap immutableMap = e;
        int n17 = 12;
        if (n7 >= n15 && ((n3 = gz3.G(context)) != 0 || n7 >= n16 && (n3 = (object2 = context.getPackageManager()).hasSystemFeature(string2)) != 0)) {
            object4 = dr_12.a().a;
            object4 = nr_0.a((AudioManager)object7, (AudioAttributes)object4);
            object6 = new HashMap();
            Object object8 = n8;
            serializable = Ints.asList(n17);
            Object object9 = new HashSet(serializable);
            ((HashMap)object6).put(object8, object9);
            while (n10 < (n8 = object4.size())) {
                object8 = er_0.a(object4.get(n10));
                n15 = fr_0.a((AudioProfile)object8);
                if (n15 != n14 && ((n7 = (int)(gz3.E(n15 = gr_0.a((AudioProfile)object8)) ? 1 : 0)) != 0 || (n7 = (int)(immutableMap.containsKey(serializable = Integer.valueOf(n15)) ? 1 : 0)) != 0)) {
                    serializable = n15;
                    n7 = (int)(((HashMap)object6).containsKey(serializable) ? 1 : 0);
                    if (n7 != 0) {
                        object9 = n15;
                        object9 = (Set)((HashMap)object6).get(object9);
                        object9.getClass();
                        object9 = (Set)object9;
                        object8 = Ints.asList(hr_0.a((AudioProfile)object8));
                        object9.addAll(object8);
                    } else {
                        object9 = n15;
                        object8 = Ints.asList(hr_0.a((AudioProfile)object8));
                        serializable = new Serializable(object8);
                        ((HashMap)object6).put(object9, serializable);
                    }
                }
                n10 += n14;
            }
            object4 = ImmutableList.builder();
            object8 = ((HashMap)object6).entrySet().iterator();
            while ((n10 = (int)(object8.hasNext() ? 1 : 0)) != 0) {
                object5 = (Map.Entry)object8.next();
                object6 = (Integer)object5.getKey();
                int n18 = (Integer)object6;
                object5 = (Set)object5.getValue();
                or$a or$a = new or$a(n18, (Set)object5);
                ((ImmutableList$Builder)object4).add(or$a);
            }
            object4 = ((ImmutableList$Builder)object4).build();
            object7 = new or_0((ImmutableList)object4);
            return object7;
        }
        if (n7 >= n16) {
            if (object3 == null) {
                object7 = ir_1.a((AudioManager)object7);
            } else {
                object7 = new AudioDeviceInfo[n14];
                object3 = ((rr_0)object3).a;
                object7[0] = object3;
            }
            object3 = new ImmutableSet$Builder();
            object2 = 8;
            int n19 = 7;
            Integer n20 = n19;
            Object[] objectArray = new Integer[n8];
            objectArray[0] = object2;
            objectArray[n14] = n20;
            object3 = ((ImmutableSet$Builder)object3).add(objectArray);
            n3 = 31;
            if (n7 >= n3) {
                n3 = 26;
                object2 = n3;
                n19 = 27;
                n20 = n19;
                objectArray = new Integer[n8];
                objectArray[0] = object2;
                objectArray[n14] = n20;
                ((ImmutableSet$Builder)object3).add(objectArray);
            }
            if (n7 >= n15) {
                n15 = 30;
                object = n15;
                ((ImmutableSet$Builder)object3).add(object);
            }
            object = ((ImmutableSet$Builder)object3).build();
            n7 = ((AudioDeviceInfo[])object7).length;
            object3 = null;
            for (n4 = 0; n4 < n7; n4 += n14) {
                object2 = jr_0.a((AudioDeviceInfo)object7[n4]);
                n3 = (int)(((ImmutableCollection)object).contains(object2) ? 1 : 0);
                if (n3 == 0) continue;
                return c;
            }
        }
        object7 = new ImmutableSet$Builder();
        object = n8;
        ((ImmutableSet$Builder)object7).add(object);
        n15 = gz3.a;
        n7 = 29;
        n4 = 10;
        if (n15 >= n7 && ((n7 = (int)(gz3.G(context) ? 1 : 0)) != 0 || n15 >= n16 && (n15 = (int)((object = context.getPackageManager()).hasSystemFeature(string2) ? 1 : 0)) != 0)) {
            object4 = ImmutableList.builder();
            object5 = immutableMap.keySet().iterator();
            while ((n14 = (int)(object5.hasNext() ? 1 : 0)) != 0) {
                n15 = gz3.a;
                Integer n21 = (Integer)object5.next();
                int n22 = n21;
                n7 = gz3.m(n22);
                if (n15 < n7) continue;
                object = new AudioFormat.Builder();
                object6 = object.setChannelMask(n17).setEncoding(n22);
                n15 = 48000;
                n22 = (int)(kr_0.a((AudioFormat)(object6 = object6.setSampleRate(n15).build()), (AudioAttributes)(object = dr_12.a().a)) ? 1 : 0);
                if (n22 == 0) continue;
                ((ImmutableList$Builder)object4).add(n21);
            }
            Serializable serializable2 = n8;
            ((ImmutableList$Builder)object4).add(serializable2);
            object4 = ((ImmutableList$Builder)object4).build();
            ((ImmutableSet$Builder)object7).addAll((Iterable)object4);
            serializable2 = or_0.a(Ints.toArray(((ImmutableSet$Builder)object7).build()), n4);
            object4 = new or_0((ImmutableList)serializable2);
            return object4;
        }
        Object object10 = context.getContentResolver();
        int n24 = Settings.Global.getInt((ContentResolver)object10, (String)(object6 = "use_external_surround_sound_flag"), (int)0);
        if (n24 == n14) {
            n24 = 1;
        } else {
            n24 = 0;
            object6 = null;
        }
        if ((n24 != 0 || (n7 = (int)(((String)((Object)(serializable = "Amazon"))).equals(object = gz3.c) ? 1 : 0)) != 0 || (n15 = (int)(((String)((Object)(serializable = "Xiaomi"))).equals(object) ? 1 : 0)) != 0) && (n8 = Settings.Global.getInt((ContentResolver)object10, (String)(object = "external_surround_sound_enabled"), (int)0)) == n14) {
            object10 = d;
            ((ImmutableSet$Builder)object7).addAll((Iterable)object10);
        }
        if (object4 != null && n24 == 0 && (n8 = object4.getIntExtra((String)(object10 = "android.media.extra.AUDIO_PLUG_STATE"), 0)) == n14) {
            object10 = object4.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (object10 != null) {
                object10 = Ints.asList((int[])object10);
                ((ImmutableSet$Builder)object7).addAll((Iterable)object10);
            }
            object5 = Ints.toArray(((ImmutableSet$Builder)object7).build());
            int n25 = object4.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", n4);
            object4 = or_0.a((int[])object5, n25);
            object10 = new or_0((ImmutableList)object4);
            return object10;
        }
        object10 = or_0.a(Ints.toArray(((ImmutableSet$Builder)object7).build()), n4);
        object4 = new or_0((ImmutableList)object10);
        return object4;
    }

    public final Pair d(dr_1 dr_12, d d2) {
        int n3;
        int n4;
        int n7;
        int n8;
        or_0 or_02 = this;
        Object object = d2;
        Object object2 = d2.o;
        object2.getClass();
        Object object3 = d2.k;
        int n84 = ip1_0.b((String)object2, (String)object3);
        object3 = n84;
        Object object4 = e;
        boolean n10 = ((ImmutableMap)object4).containsKey(object3);
        if (!n10) {
            return null;
        }
        int n14 = 7;
        int n15 = 8;
        int n16 = 18;
        if (n84 == n16 && (n8 = this.e(n16)) == 0) {
            n84 = 6;
        } else if (n84 == n15 && (n8 = (int)(or_02.e(n15) ? 1 : 0)) == 0 || n84 == (n8 = 30) && (n8 = (int)(or_02.e(n8) ? 1 : 0)) == 0) {
            n84 = 7;
        }
        n8 = (int)(or_02.e(n84) ? 1 : 0);
        if (n8 == 0) {
            return null;
        }
        or$a or$a = (or$a)or_02.a.get(n84);
        or$a.getClass();
        int n17 = 1;
        int n18 = 0;
        int n19 = 10;
        int n20 = -1;
        int n21 = or$a.b;
        ImmutableSet immutableSet = or$a.c;
        int n22 = ((d)object).D;
        if (n22 != n20 && n84 != n16) {
            object = ((d)object).o;
            object4 = "audio/vnd.dts.uhd;profile=p2";
            n7 = (int)(((String)object).equals(object4) ? 1 : 0);
            if (n7 != 0 && (n7 = gz3.a) < (n4 = 33)) {
                if (n22 > n19) {
                    return null;
                }
            } else {
                if (immutableSet == null) {
                    if (n22 <= n21) {
                        n18 = 1;
                    }
                } else {
                    n7 = gz3.o(n22);
                    if (n7 != 0) {
                        object = n7;
                        n18 = (int)(immutableSet.contains(object) ? 1 : 0);
                    }
                }
                if (n18 == 0) {
                    return null;
                }
            }
        } else {
            n7 = ((d)object).E;
            if (n7 == n20) {
                n7 = 48000;
            }
            if (immutableSet == null) {
                n22 = gz3.a;
                n16 = 29;
                n8 = or$a.a;
                if (n22 >= n16) {
                    while (n19 > 0) {
                        n4 = gz3.o(n19);
                        if (n4 != 0) {
                            AudioFormat.Builder builder = new AudioFormat.Builder();
                            object4 = builder.setEncoding(n8).setSampleRate(n7).setChannelMask(n4).build();
                            n4 = (int)(kr_0.a((AudioFormat)object4, (AudioAttributes)(builder = dr_12.a().a)) ? 1 : 0);
                            if (n4 != 0) {
                                n18 = n19;
                                break;
                            }
                        }
                        n19 += -1;
                    }
                    n21 = n18;
                } else {
                    object = n8;
                    Integer n24 = 0;
                    object = (Integer)((ImmutableMap)object4).getOrDefault(object, n24);
                    object.getClass();
                    n21 = (Integer)object;
                }
            }
            n22 = n21;
        }
        if ((n7 = gz3.a) <= (n4 = 28)) {
            if (n22 == n14) {
                n22 = 8;
            } else {
                int n25;
                int n26;
                int n27 = 3;
                if (n22 == n27 || n22 == (n26 = 4) || n22 == (n25 = 5)) {
                    n22 = 6;
                }
            }
        }
        if (n7 <= (n3 = 26) && (n7 = (int)(((String)(object = "fugu")).equals(object3 = gz3.b) ? 1 : 0)) != 0 && n22 == n17) {
            n22 = 2;
        }
        if ((n7 = gz3.o(n22)) == 0) {
            return null;
        }
        object2 = n84;
        object = n7;
        return Pair.create((Object)object2, (Object)object);
    }

    public final boolean e(int n3) {
        SparseArray sparseArray = this.a;
        n3 = (n3 = sparseArray.indexOfKey(n3)) >= 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     */
    public final boolean equals(Object var1_1) {
        block6: {
            block9: {
                block11: {
                    block10: {
                        block8: {
                            block7: {
                                var2_2 = 1;
                                if (this == var1_1) {
                                    return (boolean)var2_2;
                                }
                                var3_3 = var1_1 instanceof or_0;
                                if (var3_3 == 0) {
                                    return false;
                                }
                                var1_1 = (or_0)var1_1;
                                var4_4 = this.a;
                                var5_5 = var1_1.a;
                                var6_6 = gz3.a;
                                if (var4_4 != null) break block7;
                                if (var5_5 != null) break block8;
                                break block9;
                            }
                            if (var5_5 != null) break block10;
                        }
lbl17:
                        // 3 sources

                        while (true) {
                            var3_3 = 0;
                            var4_4 = null;
                            break block6;
                            break;
                        }
                    }
                    var6_6 = gz3.a;
                    var7_7 = 31;
                    if (var6_6 < var7_7) break block11;
                    var3_3 = (int)Yy3.a(var4_4, var5_5);
                    break block6;
                }
                var6_6 = var4_4.size();
                if (var6_6 != (var7_7 = var5_5.size())) ** GOTO lbl17
                for (var7_7 = 0; var7_7 < var6_6; var7_7 += var2_2) {
                    var8_8 = var4_4.keyAt(var7_7);
                    var9_9 = var4_4.valueAt(var7_7);
                    var8_8 = (int)Objects.equals(var9_9, var10_10 = var5_5.get(var8_8));
                    if (var8_8 != 0) continue;
                    ** continue;
                }
            }
            var3_3 = 1;
        }
        if (var3_3 == 0 || (var3_3 = this.b) != (var11_11 = var1_1.b)) {
            var2_2 = 0;
        }
        return (boolean)var2_2;
    }

    public final int hashCode() {
        int n3;
        SparseArray sparseArray = this.a;
        int n4 = gz3.a;
        int n7 = 31;
        if (n4 >= n7) {
            n3 = Xy3.a(sparseArray);
        } else {
            int n8;
            n4 = 17;
            for (int i3 = 0; i3 < (n8 = sparseArray.size()); ++i3) {
                n8 = (sparseArray.keyAt(i3) + (n4 *= 31)) * 31;
                Object object = sparseArray.valueAt(i3);
                n4 = Objects.hashCode(object) + n8;
            }
            n3 = n4;
        }
        n4 = this.b;
        return (n3 *= 31) + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AudioCapabilities[maxChannelCount=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", audioProfiles=");
        SparseArray sparseArray = this.a;
        stringBuilder.append(sparseArray);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

