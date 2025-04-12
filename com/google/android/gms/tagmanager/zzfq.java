/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.DataLayer;
import com.google.android.gms.tagmanager.zzfm;
import com.google.android.gms.tagmanager.zzfn;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzfq
extends zzfn {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzaJ.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzm.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.zzaU.toString();
    private static final String zzd = com.google.android.gms.internal.gtm.zzb.zzaN.toString();
    private static final String zze = com.google.android.gms.internal.gtm.zzb.zzaM.toString();
    private static final String zzf = com.google.android.gms.internal.gtm.zzb.zzl.toString();
    private static final String zzg = com.google.android.gms.internal.gtm.zzb.zzdI.toString();
    private static final String zzh = com.google.android.gms.internal.gtm.zzb.zzdL.toString();
    private static final String zzi = com.google.android.gms.internal.gtm.zzb.zzdN.toString();
    private static final List zzj = Arrays.asList("detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund");
    private static final Pattern zzk = Pattern.compile("dimension(\\d+)");
    private static final Pattern zzl = Pattern.compile("metric(\\d+)");
    private static Map zzm;
    private static Map zzn;
    private final Set zzo;
    private final zzfm zzp;
    private final DataLayer zzq;

    public zzfq(Context object, DataLayer dataLayer) {
        zzfm zzfm2 = new zzfm((Context)object);
        object = zza;
        String[] stringArray = new String[]{};
        super((String)object, stringArray);
        this.zzq = dataLayer;
        this.zzp = zzfm2;
        super();
        this.zzo = object;
        object.add("");
        object.add("0");
        object.add("false");
    }

    private final String zzd(String object) {
        DataLayer dataLayer = this.zzq;
        if ((object = dataLayer.get((String)object)) == null) {
            return null;
        }
        return object.toString();
    }

    private final Map zzh(zzap hashMap) {
        Set set;
        boolean bl2;
        if (hashMap == null) {
            hashMap = new HashMap();
            return hashMap;
        }
        if ((hashMap = zzfq.zzm((zzap)((Object)hashMap))) == null) {
            hashMap = new HashMap();
            return hashMap;
        }
        String string2 = "&aip";
        String string3 = (String)hashMap.get(string2);
        if (string3 != null && (bl2 = (set = this.zzo).contains(string3 = string3.toLowerCase()))) {
            hashMap.remove(string2);
        }
        return hashMap;
    }

    private static final void zzi(Map map2, String string2, String string3) {
        if (string3 != null) {
            map2.put(string2, string3);
        }
    }

    private static final boolean zzj(Map object, String string2) {
        if ((object = (zzap)object.get(string2)) == null) {
            return false;
        }
        return zzfp.zzf(zzfp.zzk((zzap)object));
    }

    private static final Double zzk(Object object) {
        boolean bl2 = object instanceof String;
        String string2 = "Cannot convert the object to Double: ";
        if (bl2) {
            try {
                object = (String)object;
            }
            catch (NumberFormatException numberFormatException) {
                String string3 = String.valueOf(numberFormatException.getMessage());
                string3 = string2.concat(string3);
                RuntimeException runtimeException = new RuntimeException(string3);
                throw runtimeException;
            }
            return Double.valueOf((String)object);
        }
        bl2 = object instanceof Integer;
        if (bl2) {
            return ((Integer)object).doubleValue();
        }
        bl2 = object instanceof Double;
        if (bl2) {
            return (Double)object;
        }
        object = String.valueOf(object.toString());
        object = string2.concat((String)object);
        RuntimeException runtimeException = new RuntimeException((String)object);
        throw runtimeException;
    }

    private static final Integer zzl(Object object) {
        boolean bl2 = object instanceof String;
        String string2 = "Cannot convert the object to Integer: ";
        if (bl2) {
            try {
                object = (String)object;
            }
            catch (NumberFormatException numberFormatException) {
                String string3 = String.valueOf(numberFormatException.getMessage());
                string3 = string2.concat(string3);
                RuntimeException runtimeException = new RuntimeException(string3);
                throw runtimeException;
            }
            return Integer.valueOf((String)object);
        }
        bl2 = object instanceof Double;
        if (bl2) {
            return ((Double)object).intValue();
        }
        bl2 = object instanceof Integer;
        if (bl2) {
            return (Integer)object;
        }
        object = String.valueOf(object.toString());
        object = string2.concat((String)object);
        RuntimeException runtimeException = new RuntimeException((String)object);
        throw runtimeException;
    }

    private static final Map zzm(zzap iterator) {
        boolean bl2;
        boolean bl3 = (iterator = zzfp.zzk((zzap)((Object)iterator))) instanceof Map;
        if (!bl3) {
            return null;
        }
        iterator = (Map)((Object)iterator);
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        iterator = iterator.entrySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = iterator.next();
            String string2 = object.getKey().toString();
            object = object.getValue().toString();
            linkedHashMap.put(string2, object);
        }
        return linkedHashMap;
    }

    private static final Product zzn(Map map2) {
        int n3;
        int n4;
        Product product = new Product();
        Object object = map2.get("id");
        if (object != null) {
            object = object.toString();
            product.setId((String)object);
        }
        if ((object = map2.get("name")) != null) {
            object = object.toString();
            product.setName((String)object);
        }
        if ((object = map2.get("brand")) != null) {
            object = object.toString();
            product.setBrand((String)object);
        }
        if ((object = map2.get("category")) != null) {
            object = object.toString();
            product.setCategory((String)object);
        }
        if ((object = map2.get("variant")) != null) {
            object = object.toString();
            product.setVariant((String)object);
        }
        if ((object = map2.get("coupon")) != null) {
            object = object.toString();
            product.setCouponCode((String)object);
        }
        if ((object = map2.get("position")) != null) {
            object = zzfq.zzl(object);
            n4 = (Integer)object;
            product.setPosition(n4);
        }
        if ((object = map2.get("price")) != null) {
            object = zzfq.zzk(object);
            double d2 = (Double)object;
            product.setPrice(d2);
        }
        if ((object = map2.get("quantity")) != null) {
            object = zzfq.zzl(object);
            n4 = (Integer)object;
            product.setQuantity(n4);
        }
        object = map2.keySet().iterator();
        while ((n3 = object.hasNext()) != 0) {
            int n7;
            Object object2 = (String)object.next();
            Object object3 = zzk.matcher((CharSequence)object2);
            boolean bl2 = ((Matcher)object3).matches();
            int n8 = 1;
            if (bl2) {
                try {
                    object3 = ((Matcher)object3).group(n8);
                }
                catch (NumberFormatException numberFormatException) {
                    object2 = String.valueOf(object2);
                    object3 = "illegal number in custom dimension value: ";
                    ((String)object3).concat((String)object2);
                    continue;
                }
                n7 = Integer.parseInt((String)object3);
                object2 = String.valueOf(map2.get(object2));
                product.setCustomDimension(n7, (String)object2);
                continue;
            }
            object3 = zzl.matcher((CharSequence)object2);
            bl2 = ((Matcher)object3).matches();
            if (!bl2) continue;
            try {
                object3 = ((Matcher)object3).group(n8);
            }
            catch (NumberFormatException numberFormatException) {
                object2 = String.valueOf(object2);
                object3 = "illegal number in custom metric value: ";
                ((String)object3).concat((String)object2);
                continue;
            }
            n7 = Integer.parseInt((String)object3);
            object2 = zzfq.zzl(map2.get(object2));
            n3 = (Integer)object2;
            product.setCustomMetric(n7, n3);
        }
        return product;
    }

    /*
     * Exception decompiling
     */
    public final void zzc(Map var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [9 : 593->600)] java.lang.RuntimeException
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
}

