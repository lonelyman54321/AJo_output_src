/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.Crc32cHashFunction;
import com.google.common.hash.FarmHashFingerprint64;
import com.google.common.hash.Fingerprint2011;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing$ChecksumType;
import com.google.common.hash.Hashing$ConcatenatedHashFunction;
import com.google.common.hash.Hashing$LinearCongruentialGenerator;
import com.google.common.hash.Hashing$Md5Holder;
import com.google.common.hash.Hashing$Sha1Holder;
import com.google.common.hash.Hashing$Sha256Holder;
import com.google.common.hash.Hashing$Sha384Holder;
import com.google.common.hash.Hashing$Sha512Holder;
import com.google.common.hash.MacHashFunction;
import com.google.common.hash.Murmur3_128HashFunction;
import com.google.common.hash.Murmur3_32HashFunction;
import com.google.common.hash.SipHashFunction;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import javax.crypto.spec.SecretKeySpec;

public final class Hashing {
    static final int GOOD_FAST_HASH_SEED = (int)System.currentTimeMillis();

    private Hashing() {
    }

    public static HashFunction adler32() {
        return Hashing$ChecksumType.ADLER_32.hashFunction;
    }

    public static int checkPositiveAndMakeMultipleOf32(int n3) {
        boolean bl2 = n3 > 0;
        Preconditions.checkArgument(bl2, "Number of bits must be positive");
        return n3 + 31 & 0xFFFFFFE0;
    }

    public static HashCode combineOrdered(Iterable object) {
        boolean bl2;
        Object object2 = object.iterator();
        boolean bl3 = object2.hasNext();
        Object object3 = "Must be at least 1 hash code to combine.";
        Preconditions.checkArgument(bl3, object3);
        object2 = (HashCode)object2.next();
        int n3 = ((HashCode)object2).bits() / 8;
        byte[] byArray = new byte[n3];
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object3 = ((HashCode)object.next()).asBytes();
            int n4 = ((Object)object3).length;
            n4 = n4 == n3 ? 1 : 0;
            String string2 = "All hashcodes must have the same bit length.";
            Preconditions.checkArgument(n4 != 0, string2);
            for (int i3 = 0; i3 < (n4 = ((Object)object3).length); ++i3) {
                n4 = byArray[i3] * 37;
                Object object4 = object3[i3];
                byArray[i3] = n4 = (int)((byte)(n4 ^ object4));
            }
        }
        return HashCode.fromBytesNoCopy(byArray);
    }

    public static HashCode combineUnordered(Iterable object) {
        boolean bl2;
        Object object2 = object.iterator();
        boolean bl3 = object2.hasNext();
        Object object3 = "Must be at least 1 hash code to combine.";
        Preconditions.checkArgument(bl3, object3);
        object2 = (HashCode)object2.next();
        int n3 = ((HashCode)object2).bits() / 8;
        byte[] byArray = new byte[n3];
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object3 = ((HashCode)object.next()).asBytes();
            int n4 = ((Object)object3).length;
            n4 = n4 == n3 ? 1 : 0;
            String string2 = "All hashcodes must have the same bit length.";
            Preconditions.checkArgument(n4 != 0, string2);
            for (int i3 = 0; i3 < (n4 = ((Object)object3).length); ++i3) {
                n4 = byArray[i3];
                Object object4 = object3[i3];
                byArray[i3] = n4 = (int)((byte)(n4 + object4));
            }
        }
        return HashCode.fromBytesNoCopy(byArray);
    }

    public static HashFunction concatenating(HashFunction hashFunction, HashFunction hashFunctionArray, HashFunction ... hashFunctionArray2) {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add(hashFunction);
        arrayList.add(hashFunctionArray);
        Collections.addAll(arrayList, hashFunctionArray2);
        hashFunctionArray = new HashFunction[]{};
        hashFunctionArray = arrayList.toArray(hashFunctionArray);
        hashFunction = new Hashing$ConcatenatedHashFunction(hashFunctionArray, null);
        return hashFunction;
    }

    public static HashFunction concatenating(Iterable object) {
        HashFunction[] hashFunctionArray;
        boolean bl2;
        Preconditions.checkNotNull(object);
        HashFunction[] hashFunctionArray2 = new ArrayList();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            hashFunctionArray = (HashFunction[])object.next();
            hashFunctionArray2.add(hashFunctionArray);
        }
        boolean bl3 = hashFunctionArray2.isEmpty() ^ true;
        int n3 = hashFunctionArray2.size();
        Preconditions.checkArgument(bl3, "number of hash functions (%s) must be > 0", n3);
        hashFunctionArray = new HashFunction[]{};
        hashFunctionArray2 = hashFunctionArray2.toArray(hashFunctionArray);
        object = new Hashing$ConcatenatedHashFunction(hashFunctionArray2, null);
        return object;
    }

    public static int consistentHash(long l2, int n3) {
        Hashing$LinearCongruentialGenerator hashing$LinearCongruentialGenerator;
        boolean bl2;
        int n4 = 0;
        if (n3 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            hashing$LinearCongruentialGenerator = null;
        }
        String string2 = "buckets must be positive: %s";
        Preconditions.checkArgument(bl2, string2, n3);
        hashing$LinearCongruentialGenerator = new Hashing$LinearCongruentialGenerator(l2);
        while (true) {
            double d2 = n4 + 1;
            double d5 = hashing$LinearCongruentialGenerator.nextDouble();
            int n7 = (int)(d2 /= d5);
            if (n7 < 0 || n7 >= n3) break;
            n4 = n7;
        }
        return n4;
    }

    public static int consistentHash(HashCode hashCode, int n3) {
        return Hashing.consistentHash(hashCode.padToLong(), n3);
    }

    public static HashFunction crc32() {
        return Hashing$ChecksumType.CRC_32.hashFunction;
    }

    public static HashFunction crc32c() {
        return Crc32cHashFunction.CRC_32_C;
    }

    public static HashFunction farmHashFingerprint64() {
        return FarmHashFingerprint64.FARMHASH_FINGERPRINT_64;
    }

    public static HashFunction fingerprint2011() {
        return Fingerprint2011.FINGERPRINT_2011;
    }

    public static HashFunction goodFastHash(int n3) {
        HashFunction hashFunction;
        int n4;
        if ((n3 = Hashing.checkPositiveAndMakeMultipleOf32(n3)) == (n4 = 32)) {
            return Murmur3_32HashFunction.GOOD_FAST_HASH_32;
        }
        n4 = 128;
        if (n3 <= n4) {
            return Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        }
        n3 = (n3 + 127) / n4;
        HashFunction[] hashFunctionArray = new HashFunction[n3];
        hashFunctionArray[0] = hashFunction = Murmur3_128HashFunction.GOOD_FAST_HASH_128;
        int n7 = GOOD_FAST_HASH_SEED;
        for (int i3 = 1; i3 < n3; ++i3) {
            HashFunction hashFunction2;
            int n8 = 1500450271;
            hashFunctionArray[i3] = hashFunction2 = Hashing.murmur3_128(n7 += n8);
        }
        Hashing$ConcatenatedHashFunction hashing$ConcatenatedHashFunction = new Hashing$ConcatenatedHashFunction(hashFunctionArray, null);
        return hashing$ConcatenatedHashFunction;
    }

    public static HashFunction hmacMd5(Key key) {
        String string2 = Hashing.hmacToString("hmacMd5", key);
        MacHashFunction macHashFunction = new MacHashFunction("HmacMD5", key, string2);
        return macHashFunction;
    }

    public static HashFunction hmacMd5(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, "HmacMD5");
        return Hashing.hmacMd5(secretKeySpec);
    }

    public static HashFunction hmacSha1(Key key) {
        String string2 = Hashing.hmacToString("hmacSha1", key);
        MacHashFunction macHashFunction = new MacHashFunction("HmacSHA1", key, string2);
        return macHashFunction;
    }

    public static HashFunction hmacSha1(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, "HmacSHA1");
        return Hashing.hmacSha1(secretKeySpec);
    }

    public static HashFunction hmacSha256(Key key) {
        String string2 = Hashing.hmacToString("hmacSha256", key);
        MacHashFunction macHashFunction = new MacHashFunction("HmacSHA256", key, string2);
        return macHashFunction;
    }

    public static HashFunction hmacSha256(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, "HmacSHA256");
        return Hashing.hmacSha256(secretKeySpec);
    }

    public static HashFunction hmacSha512(Key key) {
        String string2 = Hashing.hmacToString("hmacSha512", key);
        MacHashFunction macHashFunction = new MacHashFunction("HmacSHA512", key, string2);
        return macHashFunction;
    }

    public static HashFunction hmacSha512(byte[] byArray) {
        byArray = (byte[])Preconditions.checkNotNull(byArray);
        SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, "HmacSHA512");
        return Hashing.hmacSha512(secretKeySpec);
    }

    private static String hmacToString(String charSequence, Key object) {
        charSequence = Gn.a("Hashing.", (String)charSequence, "(Key[algorithm=");
        String string2 = object.getAlgorithm();
        ((StringBuilder)charSequence).append(string2);
        ((StringBuilder)charSequence).append(", format=");
        object = object.getFormat();
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("])");
        return ((StringBuilder)charSequence).toString();
    }

    public static HashFunction md5() {
        return Hashing$Md5Holder.MD5;
    }

    public static HashFunction murmur3_128() {
        return Murmur3_128HashFunction.MURMUR3_128;
    }

    public static HashFunction murmur3_128(int n3) {
        Murmur3_128HashFunction murmur3_128HashFunction = new Murmur3_128HashFunction(n3);
        return murmur3_128HashFunction;
    }

    public static HashFunction murmur3_32() {
        return Murmur3_32HashFunction.MURMUR3_32;
    }

    public static HashFunction murmur3_32(int n3) {
        Murmur3_32HashFunction murmur3_32HashFunction = new Murmur3_32HashFunction(n3, false);
        return murmur3_32HashFunction;
    }

    public static HashFunction murmur3_32_fixed() {
        return Murmur3_32HashFunction.MURMUR3_32_FIXED;
    }

    public static HashFunction murmur3_32_fixed(int n3) {
        Murmur3_32HashFunction murmur3_32HashFunction = new Murmur3_32HashFunction(n3, true);
        return murmur3_32HashFunction;
    }

    public static HashFunction sha1() {
        return Hashing$Sha1Holder.SHA_1;
    }

    public static HashFunction sha256() {
        return Hashing$Sha256Holder.SHA_256;
    }

    public static HashFunction sha384() {
        return Hashing$Sha384Holder.SHA_384;
    }

    public static HashFunction sha512() {
        return Hashing$Sha512Holder.SHA_512;
    }

    public static HashFunction sipHash24() {
        return SipHashFunction.SIP_HASH_24;
    }

    public static HashFunction sipHash24(long l2, long l3) {
        SipHashFunction sipHashFunction = new SipHashFunction(2, 4, l2, l3);
        return sipHashFunction;
    }
}

