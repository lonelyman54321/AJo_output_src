/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  android.util.Base64
 */
package com.ril.ajio.services.helper;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SecurityHelper {
    private static final String ALGORITHM = "AES";
    private static final String CIPHER = "AES/CBC/PKCS5Padding";
    private static final String ENCODING = "UTF8";
    private static final String TAG = "com.ril.ajio.services.helper.SecurityHelper";
    private static final IvParameterSpec mIvParameterSpec;
    private static final SecretKeySpec mSecretKeySpec;

    static {
        byte[] byArray = "d2cb415e067c7b13".getBytes();
        Object object = new SecretKeySpec(byArray, ALGORITHM);
        mSecretKeySpec = object;
        byArray = "e36dc751d0433f05".getBytes();
        mIvParameterSpec = object = new IvParameterSpec(byArray);
    }

    public static String decode(String string2) {
        return URLDecoder.decode(string2, "UTF-8").replace(" ", "+");
    }

    public static String decrypt(String object) {
        block15: {
            NoSuchAlgorithmException noSuchAlgorithmException2;
            Object object2;
            yn3$a yn3$a;
            block20: {
                Object[] objectArray;
                block19: {
                    InvalidKeyException invalidKeyException2;
                    block18: {
                        InvalidAlgorithmParameterException invalidAlgorithmParameterException2;
                        block17: {
                            yn3$a = null;
                            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                            if (bl2) break block15;
                            object2 = CIPHER;
                            object2 = Cipher.getInstance((String)object2);
                            Object object3 = mSecretKeySpec;
                            IvParameterSpec ivParameterSpec = mIvParameterSpec;
                            int n3 = 2;
                            ((Cipher)object2).init(n3, (Key)object3, ivParameterSpec);
                            int n4 = 16;
                            object = Base64.decode((String)object, (int)n4);
                            object = ((Cipher)object2).doFinal((byte[])object);
                            object2 = ENCODING;
                            try {
                                object3 = new String((byte[])object, (String)object2);
                                return object3;
                            }
                            catch (UnsupportedEncodingException unsupportedEncodingException) {
                            }
                            catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException2) {
                                break block17;
                            }
                            catch (InvalidKeyException invalidKeyException2) {
                                break block18;
                            }
                            catch (BadPaddingException badPaddingException) {
                                break block19;
                            }
                            catch (IllegalBlockSizeException illegalBlockSizeException) {
                                break block19;
                            }
                            catch (NoSuchPaddingException noSuchPaddingException) {
                                break block19;
                            }
                            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                                break block20;
                            }
                            yn3_0.a(unsupportedEncodingException);
                            Object[] objectArray2 = new Object[]{};
                            yn3$a = yn3_0.a;
                            object2 = "Character to convert is unavailable";
                            yn3$a.d((String)object2, objectArray2);
                            break block15;
                        }
                        yn3_0.a(invalidAlgorithmParameterException2);
                        Object[] objectArray3 = new Object[]{};
                        yn3$a = yn3_0.a;
                        object2 = "Algorithm parameter specification is invalid";
                        yn3$a.d((String)object2, objectArray3);
                        break block15;
                    }
                    yn3_0.a(invalidKeyException2);
                    Object[] objectArray4 = new Object[]{};
                    yn3$a = yn3_0.a;
                    object2 = "No valid key provided.";
                    yn3$a.d((String)object2, objectArray4);
                    break block15;
                }
                yn3_0.a((Exception)objectArray);
                objectArray = new Object[]{};
                yn3$a = yn3_0.a;
                object2 = "Exception during decrypt";
                yn3$a.d((String)object2, objectArray);
                break block15;
            }
            yn3_0.a(noSuchAlgorithmException2);
            Object[] objectArray = new Object[]{};
            yn3$a = yn3_0.a;
            object2 = "Algorithm not found.";
            yn3$a.d((String)object2, objectArray);
        }
        return "";
    }

    public static String encrypt(String object) {
        block17: {
            block12: {
                block18: {
                    NoSuchAlgorithmException noSuchAlgorithmException2;
                    Object object2;
                    yn3$a yn3$a;
                    block16: {
                        block15: {
                            InvalidKeyException invalidKeyException2;
                            block14: {
                                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                                if (bl2) break block17;
                                bl2 = false;
                                yn3$a = null;
                                object2 = CIPHER;
                                object2 = Cipher.getInstance((String)object2);
                                SecretKeySpec secretKeySpec = mSecretKeySpec;
                                IvParameterSpec ivParameterSpec = mIvParameterSpec;
                                int n3 = 1;
                                ((Cipher)object2).init(n3, (Key)secretKeySpec, ivParameterSpec);
                                object = object.getBytes();
                                object = ((Cipher)object2).doFinal((byte[])object);
                                int n4 = 16;
                                try {
                                    object = Base64.encodeToString((byte[])object, (int)n4);
                                    break block12;
                                }
                                catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
                                }
                                catch (InvalidKeyException invalidKeyException2) {
                                    break block14;
                                }
                                catch (IllegalBlockSizeException illegalBlockSizeException) {
                                    break block15;
                                }
                                catch (BadPaddingException badPaddingException) {
                                    break block15;
                                }
                                catch (NoSuchPaddingException noSuchPaddingException) {
                                    break block15;
                                }
                                catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                                    break block16;
                                }
                                yn3_0.a(invalidAlgorithmParameterException);
                                object = new Object[]{};
                                yn3$a = yn3_0.a;
                                object2 = "Algorithm parameter specification is invalid";
                                yn3$a.d((String)object2, object);
                                break block18;
                            }
                            yn3_0.a(invalidKeyException2);
                            object = new Object[]{};
                            yn3$a = yn3_0.a;
                            object2 = "No valid key provided.";
                            yn3$a.d((String)object2, object);
                            break block18;
                        }
                        yn3_0.a((Exception)object);
                        object = new Object[]{};
                        yn3$a = yn3_0.a;
                        object2 = "Exception during encrypt";
                        yn3$a.d((String)object2, object);
                        break block18;
                    }
                    yn3_0.a(noSuchAlgorithmException2);
                    object = new Object[]{};
                    yn3$a = yn3_0.a;
                    object2 = "Algorithm not found.";
                    yn3$a.d((String)object2, object);
                }
                object = "";
            }
            return object;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public static String getStringFromSecureSharedPreferences(SharedPreferences object, String string2, String string3) {
        if (object != null && string2 != null) {
            return SecurityHelper.decrypt(object.getString(string2, string3));
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public static void setStringToSecureSharedPreferences(SharedPreferences object, String string2, String string3) {
        boolean bl2;
        if (object != null && string2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)string3))) {
            object = object.edit();
            string3 = SecurityHelper.encrypt(string3);
            object.putString(string2, string3);
            object.apply();
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }
}

