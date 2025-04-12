/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzgd;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzns
extends zzjo {
    private static final Pattern zza = Pattern.compile("(.+)/(.+)/(.+)");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzqo zza(zzhx object, zzqo ... object2) {
        block7: {
            Object object3;
            boolean bl2;
            int n3 = 1;
            Preconditions.checkArgument(n3 != 0);
            int n4 = ((Object)object2).length;
            String string2 = null;
            int n7 = 3;
            if (n4 >= n7) {
                bl2 = true;
            } else {
                bl2 = false;
                object3 = null;
            }
            Preconditions.checkArgument(bl2);
            bl2 = object2[n3] instanceof zzqz;
            Preconditions.checkArgument(bl2);
            string2 = zzjn.zzd((zzqo)object2[0]);
            object3 = zzjn.zzd((zzqo)object2[n3]);
            int n8 = 2;
            String string3 = zzjn.zzd((zzqo)object2[n8]);
            int n10 = 4;
            object2 = n4 < n10 ? "AES/CBC/NoPadding" : zzjn.zzd((zzqo)object2[n7]);
            Object object4 = zza.matcher((CharSequence)object2);
            n7 = (int)(((Matcher)object4).matches() ? 1 : 0);
            String string4 = "Encrypt: invalid transformation:";
            if (n7 == 0) {
                object = String.valueOf(object2);
                object = string4.concat((String)object);
                object2 = new RuntimeException((String)object);
                throw object2;
            }
            object4 = ((Matcher)object4).group(n3);
            object3 = ((String)object3).getBytes();
            SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object3, (String)object4);
            object3 = string3.getBytes();
            object4 = new IvParameterSpec((byte[])object3);
            try {
                object2 = Cipher.getInstance((String)object2);
                if (string2 == null || (n8 = string2.length()) == 0) break block7;
            }
            catch (NoSuchAlgorithmException | NoSuchPaddingException generalSecurityException) {
                object = String.valueOf(object2);
                object = string4.concat((String)object);
                object2 = new RuntimeException((String)object);
                throw object2;
            }
            try {
                ((Cipher)object2).init(n3, (Key)secretKeySpec, (AlgorithmParameterSpec)object4);
                object = string2.getBytes();
                object = ((Cipher)object2).doFinal((byte[])object);
                object = zzgd.zza((byte[])object);
                return new zzqz((String)object);
            }
            catch (Exception exception) {
                String string5 = String.valueOf(exception.getMessage());
                string5 = "Encrypt: ".concat(string5);
                object2 = new RuntimeException(string5);
                throw object2;
            }
        }
        object = new RuntimeException("Encrypt: empty input string");
        throw object;
    }
}

