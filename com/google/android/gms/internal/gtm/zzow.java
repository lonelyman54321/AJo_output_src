/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzhi;
import com.google.android.gms.internal.gtm.zzht;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzji;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzra;
import com.google.android.gms.internal.gtm.zzto;
import com.google.android.gms.internal.gtm.zztp;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzow
extends zzjo {
    private static final List zza;
    private static final Pattern zzb;
    private static final Pattern zzc;
    private static final zztp zzd;
    private static final zzto zze;
    private static final zzto zzf;
    private final zzji zzg;
    private final zzht zzh;
    private Map zzi;

    static {
        com.google.android.gms.internal.gtm.zza.zzaJ.toString();
        zza = Arrays.asList("detail", "checkout", "checkout_option", "click", "add", "remove", "purchase", "refund");
        zzb = Pattern.compile("dimension(\\d+)");
        zzc = Pattern.compile("metric(\\d+)");
        zzd = zztp.zzi("", "0", "false");
        zze = zzto.zzc("transactionId", "&ti", "transactionAffiliation", "&ta", "transactionTax", "&tt", "transactionShipping", "&ts", "transactionTotal", "&tr", "transactionCurrency", "&cu");
        zzf = zzto.zzc("name", "&in", "sku", "&ic", "category", "&iv", "price", "&ip", "quantity", "&iq", "currency", "&cu");
    }

    public zzow(Context context, zzht zzht2) {
        zzji zzji2 = new zzji(context);
        this.zzh = zzht2;
        this.zzg = zzji2;
    }

    private static final Map zzb(zzqo iterator) {
        Preconditions.checkNotNull(iterator);
        boolean bl2 = iterator instanceof zzqw;
        Preconditions.checkArgument(bl2);
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        zzra.zze((zzqo)((Object)iterator));
        iterator = zzra.zzg((zzqo)((Object)iterator));
        boolean bl3 = iterator instanceof Map;
        Preconditions.checkState(bl3);
        iterator = ((Map)((Object)iterator)).entrySet().iterator();
        while (bl3 = iterator.hasNext()) {
            Object object = iterator.next();
            String string2 = object.getKey().toString();
            object = object.getValue().toString();
            linkedHashMap.put(string2, object);
        }
        return linkedHashMap;
    }

    private static final Double zzc(Object object) {
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

    private static final Integer zze(Object object) {
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

    private static final Map zzf(zzqo object) {
        zztp zztp2;
        boolean bl2;
        String string2;
        String string3 = (String)(object = zzow.zzb((zzqo)object)).get(string2 = "&aip");
        if (string3 != null && (bl2 = (zztp2 = zzd).contains(string3 = string3.toLowerCase()))) {
            object.remove(string2);
        }
        return object;
    }

    private static final Product zzg(Map map2) {
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
            object = zzow.zze(object);
            n4 = (Integer)object;
            product.setPosition(n4);
        }
        if ((object = map2.get("price")) != null) {
            object = zzow.zzc(object);
            double d2 = (Double)object;
            product.setPrice(d2);
        }
        if ((object = map2.get("quantity")) != null) {
            object = zzow.zze(object);
            n4 = (Integer)object;
            product.setQuantity(n4);
        }
        object = map2.keySet().iterator();
        while ((n3 = object.hasNext()) != 0) {
            int n7;
            Object object2 = (String)object.next();
            Object object3 = zzb.matcher((CharSequence)object2);
            boolean bl2 = ((Matcher)object3).matches();
            int n8 = 1;
            if (bl2) {
                try {
                    object3 = ((Matcher)object3).group(n8);
                }
                catch (NumberFormatException numberFormatException) {
                    object2 = String.valueOf(object2);
                    object3 = "illegal number in custom dimension value: ";
                    object2 = ((String)object3).concat((String)object2);
                    zzhi.zze((String)object2);
                    continue;
                }
                n7 = Integer.parseInt((String)object3);
                object2 = String.valueOf(map2.get(object2));
                product.setCustomDimension(n7, (String)object2);
                continue;
            }
            object3 = zzc.matcher((CharSequence)object2);
            bl2 = ((Matcher)object3).matches();
            if (!bl2) continue;
            try {
                object3 = ((Matcher)object3).group(n8);
            }
            catch (NumberFormatException numberFormatException) {
                object2 = String.valueOf(object2);
                object3 = "illegal number in custom metric value: ";
                object2 = ((String)object3).concat((String)object2);
                zzhi.zze((String)object2);
                continue;
            }
            n7 = Integer.parseInt((String)object3);
            object2 = zzow.zze(map2.get(object2));
            n3 = (Integer)object2;
            product.setCustomMetric(n7, n3);
        }
        return product;
    }

    /*
     * Exception decompiling
     */
    public final zzqo zza(zzhx var1_1, zzqo ... var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 7[TRYBLOCK] [7 : 138->141)] java.lang.Throwable
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

