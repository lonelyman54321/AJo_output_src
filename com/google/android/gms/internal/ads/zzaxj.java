/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzavo;
import com.google.android.gms.internal.ads.zzaxi;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzaxj {
    private static Cipher zza;
    private static final Object zzb;
    private static final Object zzc;

    static {
        Object object;
        zzb = object = new Object();
        zzc = object = new Object();
    }

    public zzaxj(SecureRandom secureRandom) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Cipher zzc() {
        Object object = zzc;
        synchronized (object) {
            try {
                Object object2 = zza;
                if (object2 != null) return zza;
                object2 = "AES/CBC/PKCS5Padding";
                zza = object2 = Cipher.getInstance((String)object2);
                return zza;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zza(byte[] object, byte[] object2) {
        NoSuchAlgorithmException noSuchAlgorithmException2;
        block15: {
            InvalidKeyException invalidKeyException2;
            block14: {
                IllegalBlockSizeException illegalBlockSizeException2;
                block13: {
                    NoSuchPaddingException noSuchPaddingException2;
                    block12: {
                        BadPaddingException badPaddingException2;
                        block11: {
                            Object object3;
                            Object object4;
                            int cfr_ignored_0 = ((byte[])object).length;
                            try {
                                object4 = "AES";
                                object3 = new SecretKeySpec((byte[])object, (String)object4);
                                object = zzb;
                                synchronized (object) {
                                }
                            }
                            catch (BadPaddingException badPaddingException2) {
                                break block11;
                            }
                            catch (NoSuchPaddingException noSuchPaddingException2) {
                                break block12;
                            }
                            catch (IllegalBlockSizeException illegalBlockSizeException2) {
                                break block13;
                            }
                            catch (InvalidKeyException invalidKeyException2) {
                                break block14;
                            }
                            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                                break block15;
                            }
                            {
                                object4 = zzaxj.zzc();
                                int n3 = 1;
                                ((Cipher)object4).init(n3, (Key)object3, (SecureRandom)null);
                                object3 = zzaxj.zzc();
                                object2 = ((Cipher)object3).doFinal((byte[])object2);
                                object3 = zzaxj.zzc();
                                object3 = ((Cipher)object3).getIV();
                            }
                            {
                                int n4 = ((byte[])object2).length;
                                int n7 = ((Object)object3).length;
                                object4 = ByteBuffer.allocate(n4 += n7);
                                object3 = ((ByteBuffer)object4).put((byte[])object3);
                                ((ByteBuffer)object3).put((byte[])object2);
                                ((ByteBuffer)object4).flip();
                                object = new byte[n4];
                                ((ByteBuffer)object4).get((byte[])object);
                                return zzavo.zza(object, false);
                            }
                        }
                        object2 = new zzaxi;
                        object2(this, (Throwable)badPaddingException2);
                        throw object2;
                    }
                    object2 = new zzaxi;
                    object2(this, (Throwable)noSuchPaddingException2);
                    throw object2;
                }
                object2 = new zzaxi;
                object2(this, (Throwable)illegalBlockSizeException2);
                throw object2;
            }
            object2 = new zzaxi;
            object2(this, (Throwable)invalidKeyException2);
            throw object2;
        }
        object2 = new zzaxi;
        object2(this, (Throwable)noSuchAlgorithmException2);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zzb(byte[] object, String object2) {
        NoSuchAlgorithmException noSuchAlgorithmException2;
        block18: {
            InvalidKeyException invalidKeyException2;
            block17: {
                IllegalBlockSizeException illegalBlockSizeException2;
                block16: {
                    NoSuchPaddingException noSuchPaddingException2;
                    block15: {
                        BadPaddingException badPaddingException2;
                        block14: {
                            InvalidAlgorithmParameterException invalidAlgorithmParameterException2;
                            block13: {
                                IllegalArgumentException illegalArgumentException2;
                                block12: {
                                    block11: {
                                        SecretKeySpec secretKeySpec;
                                        Object object3;
                                        int n3 = ((byte[])object).length;
                                        n3 = 0;
                                        byte[] byArray = null;
                                        try {
                                            object2 = zzavo.zzb((String)object2, false);
                                            n3 = ((Object)object2).length;
                                            int n4 = 16;
                                            if (n3 <= n4) break block11;
                                            object3 = ByteBuffer.allocate(n3);
                                            ((ByteBuffer)object3).put((byte[])object2);
                                            ((ByteBuffer)object3).flip();
                                            object2 = new byte[n4];
                                            byArray = new byte[n3 += -16];
                                            ((ByteBuffer)object3).get((byte[])object2);
                                            ((ByteBuffer)object3).get(byArray);
                                            object3 = "AES";
                                            secretKeySpec = new SecretKeySpec((byte[])object, (String)object3);
                                            object = zzb;
                                            synchronized (object) {
                                            }
                                        }
                                        catch (IllegalArgumentException illegalArgumentException2) {
                                            break block12;
                                        }
                                        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException2) {
                                            break block13;
                                        }
                                        catch (BadPaddingException badPaddingException2) {
                                            break block14;
                                        }
                                        catch (NoSuchPaddingException noSuchPaddingException2) {
                                            break block15;
                                        }
                                        catch (IllegalBlockSizeException illegalBlockSizeException2) {
                                            break block16;
                                        }
                                        catch (InvalidKeyException invalidKeyException2) {
                                            break block17;
                                        }
                                        catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                                            break block18;
                                        }
                                        {
                                            object3 = zzaxj.zzc();
                                            IvParameterSpec ivParameterSpec = new IvParameterSpec((byte[])object2);
                                            int n7 = 2;
                                            ((Cipher)object3).init(n7, (Key)secretKeySpec, ivParameterSpec);
                                            object2 = zzaxj.zzc();
                                            return ((Cipher)object2).doFinal(byArray);
                                        }
                                    }
                                    object = new zzaxi;
                                    object(this);
                                    throw object;
                                }
                                object2 = new zzaxi(this, (Throwable)illegalArgumentException2);
                                throw object2;
                            }
                            object2 = new zzaxi(this, (Throwable)invalidAlgorithmParameterException2);
                            throw object2;
                        }
                        object2 = new zzaxi(this, (Throwable)badPaddingException2);
                        throw object2;
                    }
                    object2 = new zzaxi(this, (Throwable)noSuchPaddingException2);
                    throw object2;
                }
                object2 = new zzaxi(this, (Throwable)illegalBlockSizeException2);
                throw object2;
            }
            object2 = new zzaxi(this, (Throwable)invalidKeyException2);
            throw object2;
        }
        object2 = new zzaxi(this, (Throwable)noSuchAlgorithmException2);
        throw object2;
    }
}

