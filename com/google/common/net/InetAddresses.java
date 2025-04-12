/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.net;

import com.google.common.base.CharMatcher;
import com.google.common.base.Preconditions;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.common.io.ByteArrayDataInput;
import com.google.common.io.ByteStreams;
import com.google.common.net.InetAddresses$TeredoInfo;
import com.google.common.primitives.Ints;
import java.math.BigInteger;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

public final class InetAddresses {
    private static final Inet4Address ANY4;
    private static final char IPV4_DELIMITER = '.';
    private static final CharMatcher IPV4_DELIMITER_MATCHER;
    private static final int IPV4_PART_COUNT = 4;
    private static final char IPV6_DELIMITER = ':';
    private static final CharMatcher IPV6_DELIMITER_MATCHER;
    private static final int IPV6_PART_COUNT = 8;
    private static final Inet4Address LOOPBACK4;

    static {
        IPV4_DELIMITER_MATCHER = CharMatcher.is('.');
        IPV6_DELIMITER_MATCHER = CharMatcher.is(':');
        LOOPBACK4 = (Inet4Address)InetAddresses.forString("127.0.0.1");
        ANY4 = (Inet4Address)InetAddresses.forString("0.0.0.0");
    }

    private InetAddresses() {
    }

    public static /* synthetic */ Inet4Address access$000() {
        return ANY4;
    }

    private static InetAddress bytesToInetAddress(byte[] byArray) {
        try {
            return InetAddress.getByAddress(byArray);
        }
        catch (UnknownHostException unknownHostException) {
            AssertionError assertionError = new AssertionError((Object)unknownHostException);
            throw assertionError;
        }
    }

    public static int coerceToInteger(InetAddress inetAddress) {
        return ByteStreams.newDataInput(InetAddresses.getCoercedIPv4Address(inetAddress).getAddress()).readInt();
    }

    private static void compressLongestRunOfZeroes(int[] nArray) {
        int n3;
        int n4;
        int n7 = -1;
        int n8 = -1;
        int n10 = -1;
        int n14 = -1;
        for (n4 = 0; n4 < (n3 = nArray.length + 1); ++n4) {
            n3 = nArray.length;
            if (n4 < n3 && (n3 = nArray[n4]) == 0) {
                if (n14 >= 0) continue;
                n14 = n4;
                continue;
            }
            if (n14 < 0) continue;
            n3 = n4 - n14;
            if (n3 > n8) {
                n10 = n14;
                n8 = n3;
            }
            n14 = -1;
        }
        n4 = 2;
        if (n8 >= n4) {
            Arrays.fill(nArray, n10, n8 += n10, n7);
        }
    }

    private static String convertDottedQuadToHex(String object) {
        int n3 = ((String)object).lastIndexOf(58);
        int n4 = 1;
        String string2 = ((String)object).substring(0, n3 += n4);
        if ((object = (Object)InetAddresses.textToNumericFormatV4(((String)object).substring(n3))) == null) {
            return null;
        }
        n3 = (object[0] & 0xFF) << 8;
        n4 = object[n4] & 0xFF;
        String string3 = Integer.toHexString(n3 | n4);
        n4 = (object[2] & 0xFF) << 8;
        object = Integer.toHexString(object[3] & 0xFF | n4);
        return y02.a(string2, string3, ":", (String)object);
    }

    public static InetAddress decrement(InetAddress inetAddress) {
        byte by2;
        byte by4;
        byte[] byArray = inetAddress.getAddress();
        int n3 = byArray.length;
        int n4 = 1;
        n3 -= n4;
        while (n3 >= 0 && (by4 = byArray[n3]) == 0) {
            byArray[n3] = by4 = -1;
            n3 += -1;
        }
        by4 = n3 >= 0 ? (byte)1 : 0;
        Preconditions.checkArgument(by4 != 0, "Decrementing %s would wrap.", (Object)inetAddress);
        byArray[n3] = by2 = (byte)(byArray[n3] - n4);
        return InetAddresses.bytesToInetAddress(byArray);
    }

    public static InetAddress forString(String string2) {
        byte[] byArray = InetAddresses.ipStringToBytes(string2);
        if (byArray != null) {
            return InetAddresses.bytesToInetAddress(byArray);
        }
        Object[] objectArray = new Object[]{string2};
        throw InetAddresses.formatIllegalArgumentException("'%s' is not an IP string literal.", objectArray);
    }

    public static InetAddress forUriString(String string2) {
        InetAddress inetAddress = InetAddresses.forUriStringNoThrow(string2);
        if (inetAddress != null) {
            return inetAddress;
        }
        Object[] objectArray = new Object[]{string2};
        throw InetAddresses.formatIllegalArgumentException("Not a valid URI IP literal: '%s'", objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private static InetAddress forUriStringNoThrow(String object) {
        void var2_8;
        int n3;
        boolean bl2;
        Preconditions.checkNotNull(object);
        String string2 = "[";
        boolean n4 = ((String)object).startsWith(string2);
        if (n4 && (bl2 = ((String)object).endsWith(string2 = "]"))) {
            int n7 = ((String)object).length();
            n3 = 1;
            int n8 = n7 - n3;
            object = ((String)object).substring(n3, n8);
            int n10 = 16;
        } else {
            int n14 = 4;
        }
        object = InetAddresses.ipStringToBytes((String)object);
        if (object != null && (n3 = ((Object)object).length) == var2_8) {
            return InetAddresses.bytesToInetAddress((byte[])object);
        }
        return null;
    }

    private static IllegalArgumentException formatIllegalArgumentException(String string2, Object ... objectArray) {
        string2 = String.format(Locale.ROOT, string2, objectArray);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        return illegalArgumentException;
    }

    /*
     * WARNING - void declaration
     */
    private static InetAddress fromBigInteger(BigInteger bigInteger, boolean bl2) {
        void var1_5;
        Object[] objectArray;
        int n3 = 1;
        int n4 = bigInteger.signum();
        if (n4 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            objectArray = null;
        }
        Object object = "BigInteger must be greater than or equal to 0";
        Preconditions.checkArgument(n4 != 0, object);
        if (bl2) {
            int n7 = 16;
        } else {
            int n8 = 4;
        }
        objectArray = bigInteger.toByteArray();
        object = new byte[var1_5];
        int n10 = objectArray.length - var1_5;
        n10 = Math.max(0, n10);
        int n14 = objectArray.length - n10;
        void var8_12 = var1_5 - n14;
        for (int i3 = 0; i3 < n10; i3 += n3) {
            byte by2 = objectArray[i3];
            if (by2 == 0) {
                continue;
            }
            Integer n15 = (int)var1_5;
            objectArray = new Object[2];
            objectArray[0] = (byte)n15;
            objectArray[n3] = (byte)bigInteger;
            throw InetAddresses.formatIllegalArgumentException("BigInteger cannot be converted to InetAddress because it has more than %d bytes: %s", objectArray);
        }
        System.arraycopy(objectArray, n10, object, (int)var8_12, n14);
        try {
            return InetAddress.getByAddress((byte[])object);
        }
        catch (UnknownHostException unknownHostException) {
            AssertionError assertionError = new AssertionError((Object)unknownHostException);
            throw assertionError;
        }
    }

    public static Inet4Address fromIPv4BigInteger(BigInteger bigInteger) {
        return (Inet4Address)InetAddresses.fromBigInteger(bigInteger, false);
    }

    public static Inet6Address fromIPv6BigInteger(BigInteger bigInteger) {
        return (Inet6Address)InetAddresses.fromBigInteger(bigInteger, true);
    }

    public static Inet4Address fromInteger(int n3) {
        return InetAddresses.getInet4Address(Ints.toByteArray(n3));
    }

    public static InetAddress fromLittleEndianByteArray(byte[] byArray) {
        int n3;
        int n4 = byArray.length;
        byte[] byArray2 = new byte[n4];
        for (int i3 = 0; i3 < (n3 = byArray.length); ++i3) {
            n3 = byArray.length - i3 + -1;
            byArray2[i3] = n3 = byArray[n3];
        }
        return InetAddress.getByAddress(byArray2);
    }

    public static Inet4Address get6to4IPv4Address(Inet6Address inet6Address) {
        boolean bl2 = InetAddresses.is6to4Address(inet6Address);
        String string2 = InetAddresses.toAddrString(inet6Address);
        Preconditions.checkArgument(bl2, "Address '%s' is not a 6to4 address.", (Object)string2);
        return InetAddresses.getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 2, 6));
    }

    public static Inet4Address getCoercedIPv4Address(InetAddress object) {
        long l2;
        int n3;
        byte by2;
        byte by4;
        int n4;
        int n7;
        byte[] byArray;
        int n8;
        block8: {
            n8 = object instanceof Inet4Address;
            if (n8 != 0) {
                return (Inet4Address)object;
            }
            byArray = ((InetAddress)object).getAddress();
            n7 = 0;
            while (true) {
                n4 = 15;
                by4 = 1;
                if (n7 >= n4) break;
                by2 = byArray[n7];
                if (by2 != 0) {
                    n7 = 0;
                    break block8;
                }
                ++n7;
            }
            n7 = 1;
        }
        if (n7 != 0 && (by2 = byArray[n4]) == by4) {
            return LOOPBACK4;
        }
        if (n7 != 0 && (n8 = byArray[n4]) == 0) {
            return ANY4;
        }
        n8 = (int)(InetAddresses.hasEmbeddedIPv4ClientAddress((Inet6Address)(object = (Inet6Address)object)) ? 1 : 0);
        if (n8 != 0) {
            object = InetAddresses.getEmbeddedIPv4ClientAddress((Inet6Address)object);
            n3 = ((Inet4Address)object).hashCode();
            l2 = n3;
        } else {
            object = ((Inet6Address)object).getAddress();
            n8 = 8;
            object = ByteBuffer.wrap((byte[])object, 0, n8);
            l2 = ((ByteBuffer)object).getLong();
        }
        object = Hashing.murmur3_32_fixed().hashLong(l2);
        n3 = ((HashCode)object).asInt() | 0xE0000000;
        n8 = -1;
        if (n3 == n8) {
            n3 = -2;
        }
        return InetAddresses.getInet4Address(Ints.toByteArray(n3));
    }

    public static Inet4Address getCompatIPv4Address(Inet6Address inet6Address) {
        boolean bl2 = InetAddresses.isCompatIPv4Address(inet6Address);
        String string2 = InetAddresses.toAddrString(inet6Address);
        Preconditions.checkArgument(bl2, "Address '%s' is not IPv4-compatible.", (Object)string2);
        return InetAddresses.getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static Inet4Address getEmbeddedIPv4ClientAddress(Inet6Address object) {
        boolean bl2 = InetAddresses.isCompatIPv4Address((Inet6Address)object);
        if (bl2) {
            return InetAddresses.getCompatIPv4Address((Inet6Address)object);
        }
        bl2 = InetAddresses.is6to4Address((Inet6Address)object);
        if (bl2) {
            return InetAddresses.get6to4IPv4Address((Inet6Address)object);
        }
        bl2 = InetAddresses.isTeredoAddress((Inet6Address)object);
        if (bl2) {
            return InetAddresses.getTeredoInfo((Inet6Address)object).getClient();
        }
        object = InetAddresses.toAddrString((InetAddress)object);
        Object[] objectArray = new Object[]{object};
        throw InetAddresses.formatIllegalArgumentException("'%s' has no embedded IPv4 address.", objectArray);
    }

    private static Inet4Address getInet4Address(byte[] byArray) {
        boolean bl2 = byArray.length;
        boolean bl3 = 4 != 0;
        bl2 = bl2 == bl3;
        int n3 = byArray.length;
        Preconditions.checkArgument(bl2, "Byte array has invalid length for an IPv4 address: %s != 4.", n3);
        return (Inet4Address)InetAddresses.bytesToInetAddress(byArray);
    }

    public static Inet4Address getIsatapIPv4Address(Inet6Address inet6Address) {
        boolean bl2 = InetAddresses.isIsatapAddress(inet6Address);
        String string2 = InetAddresses.toAddrString(inet6Address);
        Preconditions.checkArgument(bl2, "Address '%s' is not an ISATAP address.", (Object)string2);
        return InetAddresses.getInet4Address(Arrays.copyOfRange(inet6Address.getAddress(), 12, 16));
    }

    public static InetAddresses$TeredoInfo getTeredoInfo(Inet6Address object) {
        int n3 = InetAddresses.isTeredoAddress((Inet6Address)object);
        String string2 = InetAddresses.toAddrString((InetAddress)object);
        Preconditions.checkArgument(n3 != 0, "Address '%s' is not a Teredo address.", (Object)string2);
        object = ((Inet6Address)object).getAddress();
        n3 = 4;
        int n4 = 8;
        Inet4Address inet4Address = InetAddresses.getInet4Address(Arrays.copyOfRange((byte[])object, n3, n4));
        ByteArrayDataInput byteArrayDataInput = ByteStreams.newDataInput((byte[])object, n4);
        n4 = byteArrayDataInput.readShort();
        int n7 = -1;
        n4 &= n7;
        int n8 = ~ByteStreams.newDataInput((byte[])object, 10).readShort();
        n7 &= n8;
        int n10 = 16;
        object = Arrays.copyOfRange((byte[])object, 12, n10);
        InetAddresses$TeredoInfo inetAddresses$TeredoInfo = null;
        for (n8 = 0; n8 < (n10 = ((Object)object).length); ++n8) {
            n10 = (byte)(~object[n8]);
            object[n8] = n10;
        }
        object = InetAddresses.getInet4Address((byte[])object);
        inetAddresses$TeredoInfo = new InetAddresses$TeredoInfo(inet4Address, (Inet4Address)object, n7, n4);
        return inetAddresses$TeredoInfo;
    }

    public static boolean hasEmbeddedIPv4ClientAddress(Inet6Address inet6Address) {
        boolean bl2;
        boolean bl3 = InetAddresses.isCompatIPv4Address(inet6Address);
        if (!(bl3 || (bl3 = InetAddresses.is6to4Address(inet6Address)) || (bl2 = InetAddresses.isTeredoAddress(inet6Address)))) {
            bl2 = false;
            inet6Address = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    private static String hextetsToIPv6String(int[] nArray) {
        int n3;
        StringBuilder stringBuilder = new StringBuilder(39);
        int n4 = 0;
        String string2 = null;
        for (int i3 = 0; i3 < (n3 = nArray.length); ++i3) {
            n3 = nArray[i3];
            n3 = n3 >= 0 ? 1 : 0;
            if (n3 != 0) {
                if (n4 != 0) {
                    n4 = 58;
                    stringBuilder.append((char)n4);
                }
                n4 = nArray[i3];
                string2 = Integer.toHexString(n4);
                stringBuilder.append(string2);
            } else if (i3 == 0 || n4 != 0) {
                string2 = "::";
                stringBuilder.append(string2);
            }
            n4 = n3;
        }
        return stringBuilder.toString();
    }

    public static InetAddress increment(InetAddress inetAddress) {
        byte by2;
        boolean bl2;
        byte[] byArray = inetAddress.getAddress();
        int n3 = byArray.length;
        int n4 = 1;
        n3 -= n4;
        while (true) {
            byte by4;
            byte by5;
            bl2 = false;
            if (n3 < 0 || (by5 = byArray[n3]) != (by4 = -1)) break;
            byArray[n3] = 0;
            n3 += -1;
        }
        if (n3 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "Incrementing %s would wrap.", (Object)inetAddress);
        byArray[n3] = by2 = (byte)(byArray[n3] + n4);
        return InetAddresses.bytesToInetAddress(byArray);
    }

    /*
     * Unable to fully structure code
     */
    private static byte[] ipStringToBytes(String var0) {
        block13: {
            var1_1 = 0;
            var2_2 = false;
            var3_3 = false;
            while (true) {
                var4_4 = var0.length();
                var5_5 = -1;
                if (var1_1 >= var4_4) break;
                var4_4 = var0.charAt(var1_1);
                if (var4_4 == (var6_6 = 46)) {
                    var2_2 = true;
                } else {
                    var6_6 = 58;
                    if (var4_4 == var6_6) {
                        if (var2_2) {
                            return null;
                        }
                        var3_3 = true;
                    } else {
                        var6_6 = 37;
                        if (var4_4 != var6_6) {
                            var6_6 = 16;
                            if ((var4_4 = Character.digit((char)var4_4, var6_6)) == var5_5) {
                                return null;
                            } else {
                                ** GOTO lbl24
                            }
                        }
                        break block13;
                    }
                }
lbl24:
                // 4 sources

                ++var1_1;
            }
            var1_1 = -1;
        }
        if (var3_3) {
            if (var2_2 && (var0 = InetAddresses.convertDottedQuadToHex(var0)) == null) {
                return null;
            }
            if (var1_1 != var5_5) {
                var0 = var0.substring(0, var1_1);
            }
            return InetAddresses.textToNumericFormatV6(var0);
        }
        if (var2_2) {
            if (var1_1 != var5_5) {
                return null;
            }
            return InetAddresses.textToNumericFormatV4(var0);
        }
        return null;
    }

    public static boolean is6to4Address(Inet6Address object) {
        Object object2;
        object = ((Inet6Address)object).getAddress();
        boolean bl2 = false;
        Object object3 = object[0];
        int n3 = 32;
        if (object3 == n3 && (object2 = object[object3 = (Object)true]) == (n3 = 2)) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isCompatIPv4Address(Inet6Address object) {
        int n3;
        Object object2;
        Object object3;
        Object object4;
        boolean n32 = ((Inet6Address)object).isIPv4CompatibleAddress();
        if (!n32) {
            return false;
        }
        object = ((Inet6Address)object).getAddress();
        Object object5 = object[12];
        boolean bl2 = true;
        if (object5 == false && (object4 = object[13]) == false && (object3 = object[14]) == false && ((object2 = object[n3 = 15]) == false || object2 == bl2)) {
            return false;
        }
        return bl2;
    }

    public static boolean isInetAddress(String object) {
        boolean bl2;
        if ((object = (Object)InetAddresses.ipStringToBytes((String)object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static boolean isIsatapAddress(Inet6Address object) {
        Object object2;
        Object object3 = InetAddresses.isTeredoAddress((Inet6Address)object);
        boolean bl2 = false;
        if (object3 != 0) {
            return false;
        }
        object = ((Inet6Address)object).getAddress();
        object3 = object[8];
        int n3 = 3;
        if ((object3 |= n3) != n3) {
            return false;
        }
        object3 = object[9];
        if (object3 == 0 && (object3 = object[10]) == (n3 = 94) && (object2 = object[11]) == (object3 = -2)) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isMappedIPv4Address(String object) {
        Object object2;
        Object object3;
        if ((object = (Object)InetAddresses.ipStringToBytes((String)object)) != null && (object3 = ((Object)object).length) == (object2 = 16)) {
            for (object3 = 0; object3 < (object2 = 10); ++object3) {
                object2 = object[object3];
                if (object2 == 0) continue;
                return false;
            }
            while (object2 < (object3 = 12)) {
                object3 = object[object2];
                Object object4 = -1;
                if (object3 != object4) {
                    return false;
                }
                ++object2;
            }
            return true;
        }
        return false;
    }

    public static boolean isMaximum(InetAddress object) {
        for (Object object2 : (Object)((InetAddress)object).getAddress()) {
            int n3 = -1;
            if (object2 == n3) continue;
            return false;
        }
        return true;
    }

    public static boolean isTeredoAddress(Inet6Address object) {
        Object object2;
        object = ((Inet6Address)object).getAddress();
        boolean bl2 = false;
        Object object3 = object[0];
        Object object4 = 32;
        if (object3 == object4 && (object4 = (Object)object[object3 = (Object)true]) == object3 && (object4 = (Object)object[2]) == 0 && (object2 = object[object4 = 3]) == false) {
            bl2 = true;
        }
        return bl2;
    }

    public static boolean isUriInetAddress(String object) {
        boolean bl2;
        if ((object = InetAddresses.forUriStringNoThrow((String)object)) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    private static short parseHextet(String object, int n3, int n4) {
        int n7;
        int n8 = n4 - n3;
        if (n8 > 0 && n8 <= (n7 = 4)) {
            n8 = 0;
            while (n3 < n4) {
                n8 <<= 4;
                n7 = ((String)object).charAt(n3);
                int n10 = 16;
                n7 = Character.digit((char)n7, n10);
                n8 |= n7;
                ++n3;
            }
            return (short)n8;
        }
        object = new NumberFormatException();
        throw object;
    }

    private static byte parseOctet(String object, int n3, int n4) {
        int n7;
        int n8 = n4 - n3;
        if (n8 > 0 && n8 <= (n7 = 3)) {
            n7 = 1;
            if (n8 > n7 && (n8 = (int)((String)object).charAt(n3)) == (n7 = 48)) {
                object = new NumberFormatException();
                throw object;
            }
            n8 = 0;
            while (n3 < n4) {
                n8 *= 10;
                n7 = ((String)object).charAt(n3);
                int n10 = 10;
                if ((n7 = Character.digit((char)n7, n10)) >= 0) {
                    n8 += n7;
                    ++n3;
                    continue;
                }
                object = new NumberFormatException();
                throw object;
            }
            int n14 = 255;
            if (n8 <= n14) {
                return (byte)n8;
            }
            object = new NumberFormatException();
            throw object;
        }
        object = new NumberFormatException();
        throw object;
    }

    private static byte[] textToNumericFormatV4(String string2) {
        int n3;
        Object object = IPV4_DELIMITER_MATCHER;
        int n4 = ((CharMatcher)object).countIn(string2) + 1;
        if (n4 != (n3 = 4)) {
            return null;
        }
        object = new byte[n3];
        int n7 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n8;
            int n10 = string2.indexOf(46, n7);
            if (n10 == (n8 = -1)) {
                n10 = string2.length();
            }
            try {
                n7 = InetAddresses.parseOctet(string2, n7, n10);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
            object[i3] = n7;
            n7 = n10 + 1;
            continue;
        }
        return object;
    }

    private static byte[] textToNumericFormatV6(String string2) {
        block24: {
            int n3;
            int n4;
            int n7;
            int n8;
            int n10;
            Object object;
            block21: {
                object = IPV6_DELIMITER_MATCHER;
                int n14 = ((CharMatcher)object).countIn(string2);
                if (n14 < (n10 = 2) || n14 > (n8 = 8)) break block24;
                n7 = 1;
                n4 = 8 - (n14 += n7);
                int n15 = 0;
                int n16 = 0;
                while (true) {
                    int n17 = string2.length() - n7;
                    n3 = 58;
                    if (n15 >= n17) break;
                    n17 = string2.charAt(n15);
                    if (n17 == n3) {
                        n17 = n15 + 1;
                        if ((n17 = (int)string2.charAt(n17)) == n3) {
                            if (n16 != 0) {
                                return null;
                            }
                            n16 = n4 + 1;
                            if (n15 == 0) {
                                n16 = n4 + 2;
                            }
                            if (n15 == (n4 = string2.length() - n10)) {
                                ++n16;
                            }
                            n4 = n16;
                            n16 = 1;
                        }
                    }
                    ++n15;
                }
                n15 = string2.charAt(0);
                if (n15 == n3 && (n15 = (int)string2.charAt(n7)) != n3) {
                    return null;
                }
                n15 = string2.length() - n7;
                if ((n15 = (int)string2.charAt(n15)) == n3 && (n10 = (int)string2.charAt(n15 = string2.length() - n10)) != n3) {
                    return null;
                }
                if (n16 != 0 && n4 <= 0) {
                    return null;
                }
                if (n16 == 0 && n14 != n8) {
                    return null;
                }
                n14 = 16;
                object = ByteBuffer.allocate(n14);
                try {
                    n10 = string2.charAt(0);
                    if (n10 == n3) break block21;
                    n7 = 0;
                }
                catch (NumberFormatException numberFormatException) {}
            }
            while (true) {
                block25: {
                    block23: {
                        block22: {
                            n10 = string2.length();
                            if (n7 >= n10) break;
                            n10 = string2.indexOf(n3, n7);
                            n8 = -1;
                            if (n10 != n8) break block22;
                            n10 = string2.length();
                        }
                        n8 = string2.charAt(n7);
                        if (n8 != n3) break block23;
                        for (n8 = 0; n8 < n4; ++n8) {
                            ((ByteBuffer)object).putShort((short)0);
                            continue;
                        }
                        break block25;
                    }
                    n8 = InetAddresses.parseHextet(string2, n7, n10);
                    ((ByteBuffer)object).putShort((short)n8);
                }
                n7 = n10 + 1;
            }
            return ((ByteBuffer)object).array();
        }
        return null;
    }

    public static String toAddrString(InetAddress object) {
        Preconditions.checkNotNull(object);
        int n3 = object instanceof Inet4Address;
        if (n3 != 0) {
            return ((InetAddress)object).getHostAddress();
        }
        Preconditions.checkArgument(object instanceof Inet6Address);
        object = ((InetAddress)object).getAddress();
        n3 = 8;
        int[] nArray = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2 = i3 * 2;
            Object object2 = object[by2];
            ++by2;
            byte by2 = (byte)object[by2];
            by2 = (byte)Ints.fromBytes((byte)0, (byte)0, (byte)object2, by2);
            nArray[i3] = by2;
        }
        InetAddresses.compressLongestRunOfZeroes(nArray);
        return InetAddresses.hextetsToIPv6String(nArray);
    }

    public static BigInteger toBigInteger(InetAddress object) {
        object = ((InetAddress)object).getAddress();
        BigInteger bigInteger = new BigInteger(1, (byte[])object);
        return bigInteger;
    }

    public static String toUriString(InetAddress object) {
        boolean bl2 = object instanceof Inet6Address;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder("[");
            object = InetAddresses.toAddrString((InetAddress)object);
            stringBuilder.append((String)object);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        return InetAddresses.toAddrString((InetAddress)object);
    }
}

