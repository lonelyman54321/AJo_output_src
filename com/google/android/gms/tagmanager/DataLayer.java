/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tagmanager.zzan;
import com.google.android.gms.tagmanager.zzao;
import com.google.android.gms.tagmanager.zzap;
import com.google.android.gms.tagmanager.zzaq;
import com.google.android.gms.tagmanager.zzar;
import com.google.android.gms.tagmanager.zzas;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT;
    static final String[] zza;
    private static final Pattern zzb;
    private final ConcurrentHashMap zzc;
    private final Map zzd;
    private final ReentrantLock zze;
    private final LinkedList zzf;
    private final zzas zzg;
    private final CountDownLatch zzh;

    static {
        Object object;
        OBJECT_NOT_PRESENT = object = new Object();
        zza = "gtm.lifetime".split("\\.");
        zzb = Pattern.compile("(\\d+)\\s*([smhd]?)");
    }

    public DataLayer() {
        zzan zzan2 = new zzan();
        this(zzan2);
    }

    public DataLayer(zzas zzas2) {
        this.zzg = zzas2;
        Object object = new ConcurrentHashMap();
        this.zzc = object;
        this.zzd = object;
        super();
        this.zze = object;
        super();
        this.zzf = object;
        this.zzh = object = new CountDownLatch(1);
        object = new zzao(this);
        zzas2.zzb((zzar)object);
    }

    public static List listOf(Object ... objectArray) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (int i3 = 0; i3 < (n3 = objectArray.length); ++i3) {
            Object object = objectArray[i3];
            arrayList.add(object);
        }
        return arrayList;
    }

    public static Map mapOf(Object ... object) {
        int n3 = ((Object[])object).length & 1;
        if (n3 == 0) {
            int n4;
            Object object2 = new HashMap();
            for (int i3 = 0; i3 < (n4 = ((Object[])object).length); i3 += 2) {
                Object object3 = object[i3];
                int n7 = object3 instanceof String;
                if (n7 != 0) {
                    object3 = (String)object3;
                    n7 = i3 + 1;
                    Object object4 = object[n7];
                    ((HashMap)object2).put(object3, object4);
                    continue;
                }
                object2 = String.valueOf(object3);
                object2 = "key is not a string: ".concat((String)object2);
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            return object2;
        }
        object = new IllegalArgumentException("expected even number of key-value pairs");
        throw object;
    }

    public static /* bridge */ /* synthetic */ CountDownLatch zzb(DataLayer dataLayer) {
        return dataLayer.zzh;
    }

    public static /* bridge */ /* synthetic */ void zzc(DataLayer dataLayer, Map map2) {
        dataLayer.zzi(map2);
    }

    private final void zzh(Map object, String string2, Collection collection) {
        boolean bl2;
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            int n3 = string2.length();
            Object object3 = (String)object2.getKey();
            StringBuilder stringBuilder = Ex0.a(string2);
            String string3 = n3 == 0 ? "" : ".";
            string3 = h30_0.a(stringBuilder, string3, (String)object3);
            object3 = object2.getValue();
            boolean bl3 = object3 instanceof Map;
            if (bl3) {
                object2 = (Map)object2.getValue();
                this.zzh((Map)object2, string3, collection);
                continue;
            }
            object3 = "gtm.lifetime";
            bl3 = string3.equals(object3);
            if (bl3) continue;
            object2 = object2.getValue();
            object3 = new zzap(string3, object2);
            collection.add(object3);
        }
    }

    /*
     * Exception decompiling
     */
    private final void zzi(Map var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 17[TRYBLOCK] [18 : 173->176)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object get(String var1_1) {
        var2_3 = this.zzd;
        synchronized (var2_3) {
            block9: {
                block8: {
                    block7: {
                        try {
                            var3_4 /* !! */  = this.zzd;
                            var4_5 = "\\.";
                            var1_1 = var1_1.split(var4_5);
                            var5_6 = var1_1.length;
                            var6_7 = 0;
lbl9:
                            // 2 sources

                            while (var6_7 < var5_6) {
                                var7_8 = var1_1[var6_7];
                                break block7;
                            }
                            break block8;
                        }
                        catch (Throwable var1_2) {
                            break block9;
                        }
                    }
                    var8_9 = var3_4 /* !! */  instanceof Map;
                    if (!var8_9) {
                        return null;
                    }
                    if ((var3_4 /* !! */  = var3_4 /* !! */ .get(var7_8)) == null) {
                        return null;
                    }
                    ++var6_7;
                    ** GOTO lbl9
                }
                return var3_4 /* !! */ ;
            }
            throw var1_2;
        }
    }

    public void push(String object, Object object2) {
        object = this.zza((String)object, object2);
        this.push((Map)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void push(Map map2) {
        try {
            CountDownLatch countDownLatch = this.zzh;
            countDownLatch.await();
        }
        catch (InterruptedException interruptedException) {}
        this.zzi(map2);
    }

    public void pushEvent(String string2, Map map2) {
        HashMap<String, String> hashMap = new HashMap<String, String>(map2);
        hashMap.put(EVENT_KEY, string2);
        this.push(hashMap);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        Map map2 = this.zzd;
        synchronized (map2) {
            try {
                CharSequence charSequence = new StringBuilder();
                Iterator iterator = this.zzd;
                iterator = iterator.entrySet();
                iterator = iterator.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = iterator.hasNext())) {
                        return ((StringBuilder)charSequence).toString();
                    }
                    Object object = iterator.next();
                    object = (Map.Entry)object;
                    String string2 = "{\n\tKey: %s\n\tValue: %s\n}\n";
                    Object k2 = object.getKey();
                    object = object.getValue();
                    int n3 = 2;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = k2;
                    int n4 = 1;
                    objectArray[n4] = object;
                    object = String.format(string2, objectArray);
                    ((StringBuilder)charSequence).append((String)object);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final Map zza(String object, Object object2) {
        int n3;
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        object = object.toString().split("\\.");
        HashMap<Object, Object> hashMap2 = hashMap;
        for (int i3 = 0; i3 < (n3 = ((String[])object).length + -1); ++i3) {
            HashMap hashMap3 = new HashMap();
            String string2 = object[i3];
            hashMap2.put(string2, hashMap3);
            hashMap2 = hashMap3;
        }
        object = object[n3];
        hashMap2.put(object, object2);
        return hashMap;
    }

    public final void zzd(String string2) {
        this.push(string2, null);
        this.zzg.zza(string2);
    }

    public final void zze(List list, List list2) {
        int n3;
        int n4;
        while ((n4 = list2.size()) < (n3 = list.size())) {
            n4 = 0;
            list2.add(null);
        }
        for (n4 = 0; n4 < (n3 = list.size()); ++n4) {
            Object object;
            Object object2 = list.get(n4);
            boolean bl2 = object2 instanceof List;
            if (bl2) {
                object = list2.get(n4);
                bl2 = object instanceof List;
                if (!bl2) {
                    object = new Object();
                    list2.set(n4, object);
                }
                object = list2.get(n4);
                Preconditions.checkNotNull(object);
                object2 = (List)object2;
                object = (List)object;
                this.zze((List)object2, (List)object);
                continue;
            }
            bl2 = object2 instanceof Map;
            if (bl2) {
                object = list2.get(n4);
                bl2 = object instanceof Map;
                if (!bl2) {
                    object = new Object();
                    list2.set(n4, object);
                }
                object = list2.get(n4);
                Preconditions.checkNotNull(object);
                object2 = (Map)object2;
                object = (Map)object;
                this.zzf((Map)object2, (Map)object);
                continue;
            }
            object = OBJECT_NOT_PRESENT;
            if (object2 == object) continue;
            list2.set(n4, object2);
        }
    }

    public final void zzf(Map map2, Map map3) {
        boolean bl2;
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object;
            Object object2 = (String)iterator.next();
            Object object3 = map2.get(object2);
            boolean bl3 = object3 instanceof List;
            if (bl3) {
                object = map3.get(object2);
                bl3 = object instanceof List;
                if (!bl3) {
                    object = new Object();
                    map3.put(object2, object);
                }
                object2 = map3.get(object2);
                Preconditions.checkNotNull(object2);
                object3 = (List)object3;
                object2 = (List)object2;
                this.zze((List)object3, (List)object2);
                continue;
            }
            bl3 = object3 instanceof Map;
            if (bl3) {
                object = map3.get(object2);
                bl3 = object instanceof Map;
                if (!bl3) {
                    object = new Object();
                    map3.put(object2, object);
                }
                object2 = map3.get(object2);
                Preconditions.checkNotNull(object2);
                object3 = (Map)object3;
                object2 = (Map)object2;
                this.zzf((Map)object3, (Map)object2);
                continue;
            }
            map3.put(object2, object3);
        }
    }

    public final void zzg(zzaq zzaq2) {
        Integer n3 = 0;
        this.zzc.put(zzaq2, n3);
    }
}

