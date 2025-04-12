/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.security.KeyPairGeneratorSpec$Builder
 *  android.security.keystore.KeyGenParameterSpec$Builder
 */
package com.appsflyer;

import android.content.Context;
import android.os.Build;
import android.security.KeyPairGeneratorSpec;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.AFLogger;
import com.appsflyer.a;
import com.appsflyer.b;
import com.appsflyer.internal.AFb1qSDK;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyPairGeneratorSpi;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

public class AFKeystoreWrapper {
    public final Object AFAdRevenueData;
    public int getCurrencyIso4217Code;
    private Context getMediationNetwork;
    public KeyStore getMonetizationNetwork;
    public String getRevenue;

    /*
     * WARNING - void declaration
     */
    public AFKeystoreWrapper(Context object) {
        void var1_6;
        Object object2;
        this.AFAdRevenueData = object2 = new Object();
        this.getMediationNetwork = object;
        this.getRevenue = "";
        this.getCurrencyIso4217Code = 0;
        AFLogger.afInfoLog("Initialising KeyStore..");
        object = "AndroidKeyStore";
        object = KeyStore.getInstance((String)object);
        this.getMonetizationNetwork = object;
        object2 = null;
        try {
            ((KeyStore)object).load(null);
            return;
        }
        catch (KeyStoreException keyStoreException) {
        }
        catch (CertificateException certificateException) {
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", (Throwable)var1_6);
    }

    private static boolean getRevenue(String string2) {
        return string2.startsWith("com.appsflyer");
    }

    public final String AFAdRevenueData() {
        String string2 = ",KSAppsFlyerRICounter=";
        StringBuilder stringBuilder = new StringBuilder("com.appsflyer,KSAppsFlyerId=");
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            String string3 = this.getRevenue;
            stringBuilder.append(string3);
            stringBuilder.append(string2);
            int n3 = this.getCurrencyIso4217Code;
            stringBuilder.append(n3);
            return ((Object)stringBuilder).toString();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void getCurrencyIso4217Code(String string2) {
        Throwable throwable3;
        block11: {
            Object object;
            Object object2;
            block10: {
                Object object3;
                int n3;
                block9: {
                    object2 = String.valueOf(string2);
                    object = "Creating a new key with alias: ".concat((String)object2);
                    AFLogger.afInfoLog((String)object);
                    try {
                        object = Calendar.getInstance();
                        object2 = Calendar.getInstance();
                        int n4 = 1;
                        n3 = 5;
                        ((Calendar)object2).add(n4, n3);
                        Object object4 = this.AFAdRevenueData;
                        // MONITORENTER : object4
                    }
                    catch (Throwable throwable2) {
                        object = new StringBuilder("Exception ");
                        object2 = throwable2.getMessage();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append(" occurred");
                        AFLogger.afErrorLog(object.toString(), throwable2);
                        return;
                    }
                    try {
                        object3 = this.getMonetizationNetwork;
                        n3 = (int)(((KeyStore)object3).containsAlias(string2) ? 1 : 0);
                        if (n3 != 0) {
                            object = "Alias already exists: ";
                            string2 = String.valueOf(string2);
                            string2 = ((String)object).concat(string2);
                            AFLogger.afInfoLog(string2);
                            // MONITOREXIT : object4
                            return;
                        }
                        n3 = Build.VERSION.SDK_INT;
                        int n7 = 23;
                        if (n3 < n7) break block9;
                        b.a();
                        string2 = o2.b(string2);
                        String string3 = "CN=AndroidSDK, O=AppsFlyer";
                        object3 = new X500Principal(string3);
                        string2 = j2.a((KeyGenParameterSpec.Builder)string2, (X500Principal)object3);
                        object3 = BigInteger.ONE;
                        string2 = a.a((KeyGenParameterSpec.Builder)string2, (BigInteger)object3);
                        object = ((Calendar)object).getTime();
                        string2 = l2_0.a((KeyGenParameterSpec.Builder)string2, (Date)object);
                        object = ((Calendar)object2).getTime();
                        string2 = m2_0.a((KeyGenParameterSpec.Builder)string2, (Date)object);
                        string2 = n2.a((KeyGenParameterSpec.Builder)string2);
                        break block10;
                    }
                    catch (Throwable throwable3) {
                        break block11;
                    }
                }
                n3 = (int)(AFb1qSDK.getMediationNetwork() ? 1 : 0);
                if (n3 == 0) {
                    Object object5 = this.getMediationNetwork;
                    object3 = new KeyPairGeneratorSpec.Builder(object5);
                    string2 = object3.setAlias(string2);
                    object5 = "CN=AndroidSDK, O=AppsFlyer";
                    object3 = new X500Principal((String)object5);
                    string2 = string2.setSubject((X500Principal)object3);
                    object3 = BigInteger.ONE;
                    string2 = string2.setSerialNumber((BigInteger)object3);
                    object = ((Calendar)object).getTime();
                    string2 = string2.setStartDate((Date)object);
                    object = ((Calendar)object2).getTime();
                    string2 = string2.setEndDate((Date)object);
                    string2 = string2.build();
                } else {
                    string2 = null;
                }
            }
            object = "RSA";
            object2 = "AndroidKeyStore";
            object = KeyPairGenerator.getInstance((String)object, (String)object2);
            ((KeyPairGenerator)object).initialize((AlgorithmParameterSpec)((Object)string2));
            ((KeyPairGeneratorSpi)object).generateKeyPair();
            return;
        }
        // MONITOREXIT : object4
        throw throwable3;
    }

    public final int getMediationNetwork() {
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            int n3 = this.getCurrencyIso4217Code;
            return n3;
        }
    }

    public final String getMonetizationNetwork() {
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            String string2 = this.getRevenue;
            return string2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean getRevenue() {
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            Throwable throwable22;
            block7: {
                int n3;
                block8: {
                    Object object2 = this.getMonetizationNetwork;
                    n3 = 0;
                    if (object2 == null) break block8;
                    try {
                        boolean bl2;
                        object2 = ((KeyStore)object2).aliases();
                        while (bl2 = object2.hasMoreElements()) {
                            int n8;
                            int n4;
                            int n7;
                            Object object3 = object2.nextElement();
                            if ((object3 = (String)object3) == null || (n7 = AFKeystoreWrapper.getRevenue(object3)) == 0) continue;
                            object2 = ",";
                            n7 = ((String[])(object2 = ((String)object3).split((String)object2))).length;
                            if (n7 != (n4 = 3)) break;
                            String string2 = "Found a matching AF key with alias:\n";
                            object3 = string2.concat((String)object3);
                            AFLogger.afInfoLog((String)object3);
                            n3 = 1;
                            object3 = object2[n3];
                            object3 = ((String)object3).trim();
                            string2 = "=";
                            object3 = ((String)object3).split(string2);
                            n7 = 2;
                            object2 = object2[n7];
                            object2 = ((String)object2).trim();
                            String string3 = "=";
                            object2 = ((String)object2).split(string3);
                            n4 = ((Object)object3).length;
                            if (n4 != n7 || (n4 = ((Object)object2).length) != n7) break;
                            object3 = object3[n3];
                            this.getRevenue = object3 = ((String)object3).trim();
                            object2 = object2[n3];
                            object2 = ((String)object2).trim();
                            this.getCurrencyIso4217Code = n8 = Integer.parseInt((String)object2);
                            break;
                        }
                    }
                    catch (Throwable throwable3) {
                        try {
                            Object object4 = "Couldn't list KeyStore Aliases: ";
                            CharSequence charSequence = new StringBuilder((String)object4);
                            object4 = throwable3.getClass();
                            object4 = ((Class)object4).getName();
                            charSequence.append((String)object4);
                            charSequence = ((Object)charSequence).toString();
                            AFLogger.afErrorLog((String)charSequence, throwable3);
                        }
                        catch (Throwable throwable22) {
                            break block7;
                        }
                    }
                }
                return n3 != 0;
            }
            throw throwable22;
        }
    }
}

