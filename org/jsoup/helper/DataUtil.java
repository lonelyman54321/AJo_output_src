/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.helper;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.jsoup.helper.DataUtil$BomCharset;
import org.jsoup.helper.Validate;
import org.jsoup.internal.ControllableInputStream;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;

public final class DataUtil {
    public static final Charset UTF_8;
    static final int boundaryLength = 32;
    private static final Pattern charsetPattern;
    static final String defaultCharsetName;
    private static final int firstReadBufferSize = 5120;
    private static final char[] mimeBoundaryChars;

    static {
        Charset charset;
        charsetPattern = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        UTF_8 = charset = Charset.forName("UTF-8");
        defaultCharsetName = charset.name();
        mimeBoundaryChars = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    }

    private DataUtil() {
    }

    public static void crossStreams(InputStream inputStream, OutputStream outputStream) {
        int n3;
        int n4;
        int n7 = 32768;
        byte[] byArray = new byte[n7];
        while ((n4 = inputStream.read(byArray)) != (n3 = -1)) {
            n3 = 0;
            outputStream.write(byArray, 0, n4);
        }
    }

    private static DataUtil$BomCharset detectCharsetFromBom(ByteBuffer object) {
        byte by2;
        ((Buffer)object).mark();
        int n3 = 4;
        byte[] byArray = new byte[n3];
        int n4 = ((Buffer)object).remaining();
        if (n4 >= n3) {
            ((ByteBuffer)object).get(byArray);
            ((Buffer)object).rewind();
        }
        int n7 = 0;
        object = null;
        n3 = byArray[0];
        n4 = 3;
        int n8 = 2;
        int n10 = -1;
        int n14 = -2;
        boolean bl2 = true;
        if (n3 == 0 && (by2 = byArray[bl2]) == 0 && (by2 = byArray[n8]) == n14 && (by2 = byArray[n4]) == n10 || n3 == n10 && (by2 = byArray[bl2]) == n14 && (by2 = byArray[n8]) == 0 && (n4 = byArray[n4]) == 0) {
            DataUtil$BomCharset dataUtil$BomCharset = new DataUtil$BomCharset("UTF-32", false);
            return dataUtil$BomCharset;
        }
        if (n3 == n14 && (n4 = byArray[bl2]) == n10 || n3 == n10 && (n4 = byArray[bl2]) == n14) {
            DataUtil$BomCharset dataUtil$BomCharset = new DataUtil$BomCharset("UTF-16", false);
            return dataUtil$BomCharset;
        }
        n7 = -17;
        if (n3 == n7 && (n7 = byArray[bl2]) == (n3 = -69) && (n7 = byArray[n8]) == (n3 = -65)) {
            object = new DataUtil$BomCharset("UTF-8", bl2);
            return object;
        }
        return null;
    }

    public static ByteBuffer emptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }

    public static String getCharsetFromContentType(String object) {
        if (object == null) {
            return null;
        }
        Pattern pattern = charsetPattern;
        boolean bl2 = ((Matcher)(object = pattern.matcher((CharSequence)object))).find();
        if (bl2) {
            return DataUtil.validateCharset(((Matcher)object).group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    public static Document load(File file, String string2, String string3) {
        Parser parser = Parser.htmlParser();
        return DataUtil.load(file, string2, string3, parser);
    }

    public static Document load(File file, String string2, String string3, Parser parser) {
        Throwable throwable22;
        InputStream inputStream;
        block8: {
            int n3;
            String string4;
            inputStream = new FileInputStream(file);
            Object object = Normalizer.lowerCase(file.getName());
            boolean n4 = ((String)object).endsWith(string4 = ".gz");
            if (n4 || (n3 = (int)(((String)object).endsWith(string4 = ".z") ? 1 : 0)) != 0) {
                block7: {
                    block6: {
                        try {
                            n3 = ((InputStream)inputStream).read();
                            int n7 = 31;
                            if (n3 != n7) break block6;
                        }
                        catch (Throwable throwable22) {
                            break block8;
                        }
                        n3 = ((InputStream)inputStream).read();
                        int n8 = 139;
                        if (n3 != n8) break block6;
                        n3 = 1;
                        break block7;
                    }
                    n3 = 0;
                    object = null;
                }
                ((InputStream)inputStream).close();
                if (n3 != 0) {
                    object = new FileInputStream(file);
                    inputStream = new GZIPInputStream((InputStream)object);
                } else {
                    inputStream = new FileInputStream(file);
                }
            }
            return DataUtil.parseInputStream(inputStream, string2, string3, parser);
        }
        ((InputStream)inputStream).close();
        throw throwable22;
    }

    public static Document load(InputStream inputStream, String string2, String string3) {
        Parser parser = Parser.htmlParser();
        return DataUtil.parseInputStream(inputStream, string2, string3, parser);
    }

    public static Document load(InputStream inputStream, String string2, String string3, Parser parser) {
        return DataUtil.parseInputStream(inputStream, string2, string3, parser);
    }

    public static String mimeBoundary() {
        int n3;
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        Random random = new Random();
        for (int i3 = 0; i3 < (n3 = 32); ++i3) {
            char[] cArray = mimeBoundaryChars;
            int n4 = cArray.length;
            n4 = random.nextInt(n4);
            n3 = cArray[n4];
            stringBuilder.append((char)n3);
        }
        return StringUtil.releaseBuilder(stringBuilder);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Document parseInputStream(InputStream var0, String var1_1, String var2_8, Parser var3_9) {
        block29: {
            block32: {
                block31: {
                    block30: {
                        block28: {
                            var4_10 = "charset";
                            if (var0 == null) {
                                return new Document((String)var2_8);
                            }
                            var5_11 = 32768;
                            var6_12 = false;
                            var0 = ControllableInputStream.wrap((InputStream)var0, var5_11, 0);
                            try {
                                var0.mark(var5_11);
                                var7_13 = 5119;
                                var8_14 = DataUtil.readToByteBuffer((InputStream)var0, var7_13);
                                var9_15 = var0.read();
                                var10_16 = -1;
                                if (var9_15 == var10_16) {
                                    var9_15 = 1;
                                } else {
                                    var9_15 = 0;
                                    var11_17 = null;
                                }
                                var0.reset();
                                var12_18 = DataUtil.detectCharsetFromBom((ByteBuffer)var8_14);
                                if (var12_18 == null) break block28;
                                var1_1 = DataUtil$BomCharset.access$000(var12_18);
                            }
                            catch (Throwable var1_2) {
                                break block29;
                            }
                        }
                        var13_19 = null;
                        if (var1_1 != null) ** GOTO lbl86
                        try {
                            var14_20 = DataUtil.UTF_8;
                            var8_14 = var14_20.decode((ByteBuffer)var8_14);
                            var15_21 = var8_14.hasArray();
                            if (!var15_21) break block30;
                            var16_22 /* !! */  = var8_14.array();
                            var17_23 = var8_14.arrayOffset();
                            var7_13 = var8_14.limit();
                            var14_20 = new CharArrayReader(var16_22 /* !! */ , var17_23, var7_13);
                            var8_14 = var3_9.parseInput((Reader)var14_20, (String)var2_8);
                            break block31;
                        }
                        catch (UncheckedIOException var1_3) {
                            ** GOTO lbl84
                        }
                    }
                    var8_14 = var8_14.toString();
                    var8_14 = var3_9.parseInput((String)var8_14, (String)var2_8);
                }
                var14_20 = "meta[http-equiv=content-type], meta[charset]";
                var14_20 = var8_14.select((String)var14_20);
                var14_20 = var14_20.iterator();
                var16_22 /* !! */  = null;
                while ((var17_23 = (int)var14_20.hasNext()) != 0) {
                    var18_24 = var14_20.next();
                    var19_25 = "http-equiv";
                    var20_26 = (var18_24 = (Element)var18_24).hasAttr(var19_25);
                    if (var20_26) {
                        var16_22 /* !! */  = (char[])"content";
                        var16_22 /* !! */  = (char[])var18_24.attr((String)var16_22 /* !! */ );
                        var16_22 /* !! */  = (char[])DataUtil.getCharsetFromContentType((String)var16_22 /* !! */ );
                    }
                    if (var16_22 /* !! */  == null && (var20_26 = var18_24.hasAttr((String)var4_10))) {
                        var16_22 /* !! */  = (char[])var18_24.attr((String)var4_10);
                    }
                    if (var16_22 /* !! */  == null) continue;
                }
                if (var16_22 /* !! */  != null || (var21_27 = var8_14.childNodeSize()) <= 0) ** GOTO lbl75
                var4_10 = var8_14.childNode(0);
                var15_21 = var4_10 instanceof XmlDeclaration;
                if (!var15_21) ** GOTO lbl-1000
                {
                    var4_10 = (XmlDeclaration)var4_10;
                    ** GOTO lbl72
                }
lbl-1000:
                // 1 sources

                {
                    block33: {
                        var15_21 = var4_10 instanceof Comment;
                        if (var15_21 && (var15_21 = (var4_10 = (Comment)var4_10).isXmlDeclaration())) {
                            var4_10 = var4_10.asXmlDeclaration();
                        } else {
                            var21_27 = 0;
                            var4_10 = null;
                        }
lbl72:
                        // 3 sources

                        if (var4_10 != null && (var15_21 = (var14_20 = var4_10.name()).equalsIgnoreCase((String)(var18_24 = "xml")))) {
                            var14_20 = "encoding";
                            var16_22 /* !! */  = (char[])var4_10.attr((String)var14_20);
                        }
lbl75:
                        // 4 sources

                        if ((var4_10 = DataUtil.validateCharset((String)var16_22 /* !! */ )) != null && !(var15_21 = var4_10.equalsIgnoreCase((String)(var14_20 = DataUtil.defaultCharsetName)))) {
                            var1_1 = var4_10.trim();
                            var4_10 = "[\"']";
                            var8_14 = "";
                            var1_1 = var1_1.replaceAll((String)var4_10, (String)var8_14);
                            break block33;
                        } else if (var9_15 != 0) {
                            var13_19 = var8_14;
                        }
                        break block33;
lbl84:
                        // 1 sources

                        var1_4 = var1_3.getCause();
                        throw var1_4;
lbl86:
                        // 1 sources

                        var4_10 = "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML";
                        Validate.notEmpty((String)var1_1, (String)var4_10);
                    }
                    if (var13_19 != null) break block32;
                    if (var1_1 == null) {
                        var1_1 = DataUtil.defaultCharsetName;
                    }
                    var11_17 = Charset.forName((String)var1_1);
                    var8_14 = new InputStreamReader((InputStream)var0, var11_17);
                    var4_10 = new BufferedReader((Reader)var8_14, var5_11);
                    if (var12_18 == null) ** GOTO lbl110
                }
                var5_11 = (int)DataUtil$BomCharset.access$100(var12_18);
                if (var5_11 != 0) {
                    var22_28 = 1L;
                    var24_29 = var4_10.skip(var22_28);
                    cfr_temp_0 = var24_29 - var22_28;
                    var5_11 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var5_11 == 0) {
                        var6_12 = true;
                    }
                    Validate.isTrue(var6_12);
                }
                ** GOTO lbl110
                {
                    catch (Throwable var1_5) {
                        ** GOTO lbl-1000
                    }
lbl110:
                    // 3 sources

                    try {
                        var13_19 = var3_9.parseInput((Reader)var4_10, (String)var2_8);
                        var2_8 = DataUtil.defaultCharsetName;
                    }
                    catch (UncheckedIOException var1_6) {}
                    var26_30 = var1_1.equals(var2_8);
                    var1_1 = var26_30 != false ? DataUtil.UTF_8 : Charset.forName((String)var1_1);
                    var2_8 = var13_19.outputSettings();
                    var2_8.charset((Charset)var1_1);
                    var27_31 = var1_1.canEncode();
                    if (var27_31) ** GOTO lbl-1000
                    var1_1 = DataUtil.UTF_8;
                    var13_19.charset((Charset)var1_1);
lbl-1000:
                    // 2 sources

                    {
                        var4_10.close();
                        break block32;
                    }
                    {
                        var1_7 = var1_6.getCause();
                        throw var1_7;
                    }
                }
lbl-1000:
                // 1 sources

                {
                    var4_10.close();
                    throw var1_5;
                }
            }
            var0.close();
            return var13_19;
        }
        var0.close();
        throw var1_2;
    }

    public static ByteBuffer readToByteBuffer(InputStream inputStream, int n3) {
        return ControllableInputStream.readToByteBuffer(inputStream, n3);
    }

    private static String validateCharset(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            Object object;
            block7: {
                string2 = string2.trim();
                object = "[\"']";
                String string3 = "";
                string2 = string2.replaceAll((String)object, string3);
                try {
                    n3 = (int)(Charset.isSupported(string2) ? 1 : 0);
                    if (n3 == 0) break block7;
                    return string2;
                }
                catch (IllegalCharsetNameException illegalCharsetNameException) {}
            }
            object = Locale.ENGLISH;
            string2 = string2.toUpperCase((Locale)object);
            n3 = (int)(Charset.isSupported(string2) ? 1 : 0);
            if (n3 != 0) {
                return string2;
            }
        }
        return null;
    }
}

