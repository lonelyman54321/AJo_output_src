/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzaqc;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqe;
import com.google.android.gms.internal.ads.zzaqg;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaql;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class zzaqk {
    /*
     * Exception decompiling
     */
    public static X509Certificate[][] zza(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 60[TRYBLOCK] [66 : 926->938)] java.lang.Throwable
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

    private static int zzb(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) {
                return 64;
            }
            String string2 = hj0_0.a(n3, "Unknown content digest algorthm: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        return 32;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int zzc(int n3) {
        int n4 = 513;
        if (n3 == n4) return 1;
        n4 = 514;
        if (n3 == n4) return 2;
        n4 = 769;
        if (n3 == n4) return 1;
        switch (n3) {
            default: {
                long l2 = n3;
                String string2 = String.valueOf(Long.toHexString(l2));
                string2 = "Unknown signature algorithm: 0x".concat(string2);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                throw illegalArgumentException;
            }
            case 258: 
            case 260: {
                return 2;
            }
            case 257: 
            case 259: 
        }
        return 1;
    }

    private static String zzd(int n3) {
        int n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) {
                return "SHA-512";
            }
            String string2 = hj0_0.a(n3, "Unknown content digest algorthm: ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer object, int n3) {
        int n4 = ((Buffer)object).limit();
        int n7 = ((Buffer)object).position();
        if ((n3 += n7) >= n7 && n3 <= n4) {
            ((ByteBuffer)object).limit(n3);
            try {
                ByteBuffer byteBuffer = ((ByteBuffer)object).slice();
                ByteOrder byteOrder = ((ByteBuffer)object).order();
                byteBuffer.order(byteOrder);
                ((ByteBuffer)object).position(n3);
                return byteBuffer;
            }
            finally {
                ((ByteBuffer)object).limit(n4);
            }
        }
        object = new BufferUnderflowException();
        throw object;
    }

    private static ByteBuffer zzf(ByteBuffer object) {
        int n3;
        int n4 = ((Buffer)object).remaining();
        if (n4 >= (n3 = 4)) {
            n4 = ((ByteBuffer)object).getInt();
            if (n4 >= 0) {
                n3 = ((Buffer)object).remaining();
                if (n4 <= n3) {
                    return zzaqk.zze((ByteBuffer)object, n4);
                }
                int n7 = ((Buffer)object).remaining();
                object = D70.b(n4, n7, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
                IOException iOException = new IOException((String)object);
                throw iOException;
            }
            object = new IllegalArgumentException("Negative length");
            throw object;
        }
        object = hj0_0.a(((Buffer)object).remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
        IOException iOException = new IOException((String)object);
        throw iOException;
    }

    private static void zzg(int n3, byte[] byArray, int n4) {
        byArray[1] = n4 = (int)((byte)(n3 & 0xFF));
        byArray[2] = n4 = (int)((byte)(n3 >>> 8 & 0xFF));
        byArray[3] = n4 = (int)((byte)(n3 >>> 16 & 0xFF));
        byArray[4] = n3 = (int)((byte)(n3 >> 24));
    }

    private static void zzh(Map map2, FileChannel fileChannel, long l2, long l3, long l4, ByteBuffer byteBuffer) {
        int n3 = 0;
        SecurityException securityException = null;
        int n4 = 1;
        int n7 = map2.isEmpty();
        if (n7 == 0) {
            int n8;
            Object object;
            zzaqe zzaqe2 = object;
            Object object2 = fileChannel;
            object = new zzaqe(fileChannel, 0L, l2);
            long l7 = l4 - l3;
            Object object3 = zzaqe2;
            Object object4 = fileChannel;
            zzaqe2 = new zzaqe(fileChannel, l3, l7);
            object2 = byteBuffer.duplicate();
            Object object5 = ByteOrder.LITTLE_ENDIAN;
            ((ByteBuffer)object2).order((ByteOrder)object5);
            zzaql.zzd((ByteBuffer)object2, l2);
            object5 = new zzaqc((ByteBuffer)object2);
            int n10 = map2.size();
            int[] nArray = new int[n10];
            object3 = map2.keySet().iterator();
            int n14 = 0;
            object4 = null;
            while ((n8 = object3.hasNext()) != 0) {
                Integer n15 = (Integer)object3.next();
                nArray[n14] = n8 = n15.intValue();
                n14 += n4;
            }
            int n16 = 3;
            object3 = new zzaqd[n16];
            object3[0] = object;
            object3[n4] = zzaqe2;
            n7 = 2;
            object3[n7] = object5;
            try {
                object = zzaqk.zzk(nArray, object3);
            }
            catch (DigestException digestException) {
                SecurityException securityException2 = new SecurityException("Failed to compute digest(s) of contents", digestException);
                throw securityException2;
            }
            while (n3 < n10) {
                int n17 = nArray[n3];
                object5 = n17;
                object3 = map2;
                boolean bl2 = MessageDigest.isEqual((byte[])(object5 = (Object)((byte[])map2.get(object5))), (byte[])(object4 = object[n3]));
                if (bl2) {
                    n3 += n4;
                    continue;
                }
                String string2 = zzaqk.zzd(n17).concat(" digest of contents did not verify");
                securityException = new SecurityException(string2);
                throw securityException;
            }
            return;
        }
        securityException = new SecurityException("No digests provided");
        throw securityException;
    }

    private static byte[] zzi(ByteBuffer object) {
        int n3 = ((ByteBuffer)object).getInt();
        if (n3 >= 0) {
            int n4 = ((Buffer)object).remaining();
            if (n3 <= n4) {
                byte[] byArray = new byte[n3];
                ((ByteBuffer)object).get(byArray);
                return byArray;
            }
            int n7 = ((Buffer)object).remaining();
            object = D70.b(n3, n7, "Underflow while reading length-prefixed value. Length: ", ", available: ");
            IOException iOException = new IOException((String)object);
            throw iOException;
        }
        object = new IOException("Negative length");
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map2, CertificateFactory certificateFactory) {
        void var3_16;
        Object object;
        Object object2;
        Object object3;
        block53: {
            Object object4;
            int n3;
            Comparable<ByteBuffer> comparable;
            int n4;
            int n7;
            Object object5;
            int n8;
            int n10;
            byte[] byArray;
            int n14;
            byte[] byArray2;
            boolean bl2;
            Object object6;
            X509Certificate[] x509CertificateArray;
            block52: {
                block51: {
                    block55: {
                        int n15;
                        int n16;
                        int n17;
                        int n18;
                        block47: {
                            void var3_6;
                            block49: {
                                x509CertificateArray = zzaqk.zzf(byteBuffer);
                                object3 = zzaqk.zzf(byteBuffer);
                                object2 = zzaqk.zzi(byteBuffer);
                                object6 = new ArrayList();
                                bl2 = false;
                                byArray2 = null;
                                n18 = -1;
                                n14 = 0;
                                byArray = null;
                                n10 = -1;
                                n8 = 0;
                                object5 = null;
                                block27: while (true) {
                                    block48: {
                                        boolean bl3 = ((Buffer)object3).hasRemaining();
                                        n7 = 8;
                                        n17 = 769;
                                        n16 = 514;
                                        n15 = 513;
                                        n4 = 1;
                                        if (!bl3) break block47;
                                        ++n8;
                                        try {
                                            comparable = zzaqk.zzf((ByteBuffer)object3);
                                            n3 = comparable.remaining();
                                            if (n3 < n7) break;
                                            n3 = comparable.getInt();
                                            Integer n19 = n3;
                                            ((ArrayList)object6).add(n19);
                                            if (n3 == n15 || n3 == n16 || n3 == n17) break block48;
                                        }
                                        catch (BufferUnderflowException bufferUnderflowException) {
                                            break block49;
                                        }
                                        catch (IOException iOException) {
                                            break block49;
                                        }
                                        switch (n3) {
                                            default: {
                                                continue block27;
                                            }
                                            case 257: 
                                            case 258: 
                                            case 259: 
                                            case 260: 
                                        }
                                    }
                                    if (n10 != n18) {
                                        n7 = zzaqk.zzc(n3);
                                        n17 = zzaqk.zzc(n10);
                                        if (n7 == n4 || n17 != n4) continue;
                                    }
                                    byArray = zzaqk.zzi(comparable);
                                    n10 = n3;
                                }
                                object3 = "Signature record too short";
                                x509CertificateArray = new SecurityException((String)object3);
                                throw x509CertificateArray;
                            }
                            object2 = hj0_0.a(n8, "Failed to parse signature record #");
                            object3 = new SecurityException((String)object2, (Throwable)var3_6);
                            throw object3;
                        }
                        if (n10 == n18) {
                            if (n8 == 0) {
                                x509CertificateArray = new SecurityException("No signatures found");
                                throw x509CertificateArray;
                            }
                            x509CertificateArray = new SecurityException("No supported signatures found");
                            throw x509CertificateArray;
                        }
                        object3 = "Unknown signature algorithm: 0x";
                        if (n10 != n15 && n10 != n16) {
                            if (n10 != n17) {
                                switch (n10) {
                                    default: {
                                        long l2 = n10;
                                        object2 = String.valueOf(Long.toHexString(l2));
                                        object3 = ((String)object3).concat((String)object2);
                                        x509CertificateArray = new IllegalArgumentException((String)object3);
                                        throw x509CertificateArray;
                                    }
                                    case 257: 
                                    case 258: 
                                    case 259: 
                                    case 260: 
                                }
                                object4 = "RSA";
                            } else {
                                object4 = "DSA";
                            }
                        } else {
                            object4 = "EC";
                        }
                        if (n10 == n15) break block55;
                        if (n10 != n16) {
                            if (n10 != n17) {
                                switch (n10) {
                                    default: {
                                        long l3 = n10;
                                        object2 = String.valueOf(Long.toHexString(l3));
                                        object3 = ((String)object3).concat((String)object2);
                                        x509CertificateArray = new IllegalArgumentException((String)object3);
                                        throw x509CertificateArray;
                                    }
                                    case 260: {
                                        object3 = Pair.create((Object)"SHA512withRSA", null);
                                        break;
                                    }
                                    case 259: {
                                        object3 = Pair.create((Object)"SHA256withRSA", null);
                                        break;
                                    }
                                    case 258: {
                                        MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
                                        int n20 = 64;
                                        int n21 = 1;
                                        String string2 = "SHA-512";
                                        String string3 = "MGF1";
                                        object3 = new PSSParameterSpec(string2, string3, mGF1ParameterSpec, n20, n21);
                                        object = "SHA512withRSA/PSS";
                                        object3 = Pair.create((Object)object, (Object)object3);
                                        break;
                                    }
                                    case 257: {
                                        MGF1ParameterSpec mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
                                        int n20 = 32;
                                        int n21 = 1;
                                        String string2 = "SHA-256";
                                        String string3 = "MGF1";
                                        object3 = new PSSParameterSpec(string2, string3, mGF1ParameterSpec, n20, n21);
                                        object = "SHA256withRSA/PSS";
                                        object3 = Pair.create((Object)object, (Object)object3);
                                        break;
                                    }
                                }
                                break block51;
                            } else {
                                object3 = Pair.create((Object)"SHA256withDSA", null);
                            }
                            break block51;
                        } else {
                            object3 = Pair.create((Object)"SHA512withECDSA", null);
                        }
                        break block51;
                    }
                    object3 = Pair.create((Object)"SHA256withECDSA", null);
                }
                object = (String)((Pair)object3).first;
                object3 = (AlgorithmParameterSpec)((Pair)object3).second;
                try {
                    object4 = KeyFactory.getInstance((String)object4);
                    object5 = new X509EncodedKeySpec((byte[])object2);
                    object4 = ((KeyFactory)object4).generatePublic((KeySpec)object5);
                    object5 = Signature.getInstance((String)object);
                    ((Signature)object5).initVerify((PublicKey)object4);
                    if (object3 == null) break block52;
                    ((Signature)object5).setParameter((AlgorithmParameterSpec)object3);
                }
                catch (SignatureException signatureException) {
                    break block53;
                }
                catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                    break block53;
                }
                catch (InvalidKeyException invalidKeyException) {
                    break block53;
                }
                catch (InvalidKeySpecException invalidKeySpecException) {
                    break block53;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    break block53;
                }
            }
            ((Signature)object5).update((ByteBuffer)x509CertificateArray);
            int n22 = ((Signature)object5).verify(byArray);
            if (n22 != 0) {
                int n24;
                x509CertificateArray.clear();
                object3 = zzaqk.zzf((ByteBuffer)x509CertificateArray);
                object4 = new ArrayList();
                n3 = 0;
                object = null;
                while ((n8 = (int)(((Buffer)object3).hasRemaining() ? 1 : 0)) != 0) {
                    void var3_14;
                    n3 += n4;
                    try {
                        object5 = zzaqk.zzf((ByteBuffer)object3);
                        n14 = ((Buffer)object5).remaining();
                        if (n14 < n7) {
                            object3 = "Record too short";
                            x509CertificateArray = new IOException((String)object3);
                            throw x509CertificateArray;
                        }
                        n14 = ((ByteBuffer)object5).getInt();
                        comparable = n14;
                        ((ArrayList)object4).add(comparable);
                        if (n14 != n10) continue;
                        byArray2 = zzaqk.zzi((ByteBuffer)object5);
                        continue;
                    }
                    catch (BufferUnderflowException bufferUnderflowException) {
                    }
                    catch (IOException iOException) {}
                    object2 = hj0_0.a(n3, "Failed to parse digest record #");
                    object3 = new IOException((String)object2, (Throwable)var3_14);
                    throw object3;
                }
                n22 = object6.equals(object4);
                if (n22 == 0) {
                    x509CertificateArray = new SecurityException("Signature algorithms don't match between digests and signatures records");
                    throw x509CertificateArray;
                }
                n22 = zzaqk.zzc(n10);
                object6 = n22;
                object4 = map2;
                if ((object6 = (Object)map2.put(object6, byArray2)) != null && (n24 = MessageDigest.isEqual((byte[])object6, byArray2)) == 0) {
                    object3 = zzaqk.zzd(n22).concat(" contents digest does not match the digest specified by a preceding signer");
                    x509CertificateArray = new SecurityException((String)object3);
                    throw x509CertificateArray;
                }
                x509CertificateArray = zzaqk.zzf((ByteBuffer)x509CertificateArray);
                object3 = new ArrayList();
                n24 = 0;
                object6 = null;
                while (bl2 = x509CertificateArray.hasRemaining()) {
                    n24 += n4;
                    byArray2 = zzaqk.zzi((ByteBuffer)x509CertificateArray);
                    try {
                        object4 = new ByteArrayInputStream(byArray2);
                        object = certificateFactory;
                        object4 = certificateFactory.generateCertificate((InputStream)object4);
                        object4 = (X509Certificate)object4;
                        zzaqi zzaqi2 = new zzaqi((X509Certificate)object4, byArray2);
                        ((ArrayList)object3).add(zzaqi2);
                    }
                    catch (CertificateException certificateException) {
                        object2 = hj0_0.a(n24, "Failed to decode certificate #");
                        object3 = new SecurityException((String)object2, certificateException);
                        throw object3;
                    }
                }
                boolean bl4 = ((ArrayList)object3).isEmpty();
                if (bl4) {
                    x509CertificateArray = new SecurityException("No certificates listed");
                    throw x509CertificateArray;
                }
                x509CertificateArray = (X509Certificate[])((X509Certificate)((ArrayList)object3).get(0)).getPublicKey().getEncoded();
                bl4 = Arrays.equals(object2, (byte[])x509CertificateArray);
                if (bl4) {
                    x509CertificateArray = new X509Certificate[((ArrayList)object3).size()];
                    return ((ArrayList)object3).toArray(x509CertificateArray);
                }
                x509CertificateArray = new SecurityException("Public key mismatch between certificate and signature record");
                throw x509CertificateArray;
            }
            x509CertificateArray = String.valueOf(object);
            x509CertificateArray = x509CertificateArray.concat(" signature did not verify");
            object3 = new SecurityException((String)x509CertificateArray);
            throw object3;
        }
        object2 = cP.a("Failed to verify ", (String)object, " signature");
        object3 = new SecurityException((String)object2, (Throwable)var3_16);
        throw object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[][] zzk(int[] nArray, zzaqd[] zzaqdArray) {
        int n8;
        Serializable serializable;
        int n10;
        String string2;
        String string3;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        Object object;
        int n3;
        long l2;
        long l3;
        Object object2 = nArray;
        int n4 = 0;
        Object object3 = null;
        long l4 = l3 = 0L;
        int n7 = 0;
        byte[][] byArrayArray = null;
        while (true) {
            l2 = 0x100000L;
            n3 = 3;
            if (n7 >= n3) break;
            object = zzaqdArray[n7];
            long l7 = object.zza();
            long l8 = 1048575L;
            l7 = (l7 + l8) / l2;
            l4 += l7;
            ++n7;
        }
        long l12 = 0x1FFFFFL;
        long l7 = l4 - l12;
        n7 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
        if (n7 >= 0) {
            object2 = new DigestException;
            object3 = Wm2.a(l4, "Too many chunks: ");
            object2((String)object3);
            throw object2;
        }
        n7 = ((int[])object2).length;
        byArrayArray = new byte[n7][];
        int n19 = 0;
        while (true) {
            n18 = ((int[])object2).length;
            n17 = 5;
            n16 = 1;
            if (n19 >= n18) break;
            n18 = (int)l4;
            byte[] byArray2 = new byte[zzaqk.zzb(object2[n19]) * n18 + n17];
            byArray2[0] = n15 = 90;
            zzaqk.zzg(n18, byArray2, n16);
            byArrayArray[n19] = byArray2;
            ++n19;
        }
        byte[] byArray = new byte[n17];
        byArray[0] = n14 = -91;
        MessageDigest[] messageDigestArray = new MessageDigest[n18];
        n19 = 0;
        while (true) {
            n15 = ((int[])object2).length;
            string3 = " digest not supported";
            if (n19 >= n15) break;
            n15 = object2[n19];
            string2 = zzaqk.zzd(n15);
            try {
                MessageDigest messageDigest;
                messageDigestArray[n19] = messageDigest = MessageDigest.getInstance(string2);
                ++n19;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                object3 = string2.concat(string3);
                RuntimeException runtimeException = new RuntimeException((String)object3, noSuchAlgorithmException);
                throw runtimeException;
            }
        }
        n15 = 0;
        string2 = null;
        for (n19 = 0; n19 < n3; ++n4, ++n19) {
            byte[] byArray3;
            long l15;
            object = zzaqdArray[n19];
            long l16 = object.zza();
            long l17 = l3;
            long l18 = l16;
            while ((l15 = l18 == l3 ? 0 : (l18 < l3 ? -1 : 1)) > 0) {
                zzaqd zzaqd2;
                int n20;
                l3 = Math.min(l18, l2);
                n10 = (int)l3;
                zzaqk.zzg(n10, byArray, 1);
                serializable = null;
                for (n8 = 0; n8 < n18; ++n8) {
                    MessageDigest messageDigest = messageDigestArray[n8];
                    messageDigest.update(byArray);
                    l2 = 0x100000L;
                }
                l2 = l17;
                try {
                    object.zzb(messageDigestArray, l17, n10);
                    byArray3 = byArray;
                    serializable = null;
                }
                catch (IOException iOException) {
                    object2 = new DigestException;
                    object3 = D70.b(n15, n4, "Failed to digest chunk #", " of section #");
                    object2((String)object3, iOException);
                    throw object2;
                }
                for (n8 = 0; n8 < (n20 = ((int[])object2).length); ++n8) {
                    n20 = object2[n8];
                    zzaqd2 = object;
                    object = byArrayArray[n8];
                    n20 = zzaqk.zzb(n20);
                    MessageDigest messageDigest = messageDigestArray[n8];
                    int n21 = n15 * n20;
                    n14 = n21 + 5;
                    if ((n14 = messageDigest.digest((byte[])object, n14, n20)) != n20) {
                        object2 = new RuntimeException;
                        object3 = messageDigest.getAlgorithm();
                        serializable = new StringBuilder("Unexpected output size of ");
                        ((StringBuilder)serializable).append((String)object3);
                        ((StringBuilder)serializable).append(" digest: ");
                        ((StringBuilder)serializable).append(n14);
                        object3 = ((StringBuilder)serializable).toString();
                        object2((String)object3);
                        throw object2;
                    }
                    object = zzaqd2;
                }
                zzaqd2 = object;
                l3 = n10;
                l4 = l2 + l3;
                l18 -= l3;
                ++n15;
                l3 = 0L;
                l2 = 0x100000L;
                byArray = byArray3;
                l17 = l4;
            }
            byArray3 = byArray;
            l3 = 0L;
            l2 = 0x100000L;
            n3 = 3;
            n17 = 5;
            n16 = 1;
        }
        n4 = ((int[])object2).length;
        object3 = new byte[n4][];
        n8 = 0;
        serializable = null;
        while (n8 < (n10 = ((int[])object2).length)) {
            n10 = object2[n8];
            byArray = byArrayArray[n8];
            Object object4 = zzaqk.zzd(n10);
            try {
                object3[n8] = object4 = (Object)MessageDigest.getInstance((String)object4).digest(byArray);
                ++n8;
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                object2 = ((String)object4).concat(string3);
                serializable = new RuntimeException((String)object2, noSuchAlgorithmException);
                throw serializable;
            }
        }
        return object3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static X509Certificate[][] zzl(FileChannel x509CertificateArrayArray, zzaqg object) {
        boolean bl2;
        int n3;
        ByteBuffer byteBuffer;
        Object object2 = new HashMap();
        ArrayList<X509Certificate[]> arrayList = new ArrayList<X509Certificate[]>();
        Object object3 = "X.509";
        try {
            object3 = CertificateFactory.getInstance((String)object3);
        }
        catch (CertificateException certificateException) {
            object = new RuntimeException("Failed to obtain X.509 CertificateFactory", certificateException);
            throw object;
        }
        try {
            byteBuffer = zzaqg.zze((zzaqg)object);
            byteBuffer = zzaqk.zzf(byteBuffer);
            n3 = 0;
        }
        catch (IOException iOException) {
            object = new SecurityException("Failed to read list of signers", iOException);
            throw object;
        }
        while (bl2 = byteBuffer.hasRemaining()) {
            void var0_4;
            ++n3;
            try {
                X509Certificate[] x509CertificateArray = zzaqk.zzf(byteBuffer);
                x509CertificateArray = zzaqk.zzj((ByteBuffer)x509CertificateArray, object2, (CertificateFactory)object3);
                arrayList.add(x509CertificateArray);
                continue;
            }
            catch (SecurityException securityException) {
            }
            catch (BufferUnderflowException bufferUnderflowException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            object2 = Gj0.b(n3, "Failed to parse/verify signer #", " block");
            object = new SecurityException((String)object2, (Throwable)var0_4);
            throw object;
        }
        if (n3 <= 0) {
            x509CertificateArrayArray = new SecurityException("No signers found");
            throw x509CertificateArrayArray;
        }
        boolean bl3 = ((HashMap)object2).isEmpty();
        if (!bl3) {
            long l2 = zzaqg.zza((zzaqg)object);
            long l3 = zzaqg.zzb((zzaqg)object);
            long l4 = zzaqg.zzc((zzaqg)object);
            ByteBuffer byteBuffer2 = zzaqg.zzd((zzaqg)object);
            object3 = x509CertificateArrayArray;
            zzaqk.zzh((Map)object2, (FileChannel)x509CertificateArrayArray, l2, l3, l4, byteBuffer2);
            x509CertificateArrayArray = new X509Certificate[arrayList.size()][];
            return (X509Certificate[][])arrayList.toArray((T[])x509CertificateArrayArray);
        }
        x509CertificateArrayArray = new SecurityException("No content digests found");
        throw x509CertificateArrayArray;
    }
}

