/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/*
 * Renamed from Gz0
 */
public final class gz0_0 {
    /*
     * Exception decompiling
     */
    public static byte[] a(byte[] var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 66->72)] java.lang.Throwable
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

    public static int b(Uri object) {
        boolean bl2;
        object = object.getLastPathSegment();
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        String string2 = ".ac3";
        boolean n4 = ((String)object).endsWith(string2);
        if (!n4 && !(bl2 = ((String)object).endsWith(string2 = ".ec3"))) {
            boolean bl3;
            string2 = ".ac4";
            boolean bl4 = ((String)object).endsWith(string2);
            if (bl4) {
                return 1;
            }
            string2 = ".adts";
            boolean bl5 = ((String)object).endsWith(string2);
            if (!bl5 && !(bl3 = ((String)object).endsWith(string2 = ".aac"))) {
                boolean bl6;
                boolean bl7;
                string2 = ".amr";
                boolean bl8 = ((String)object).endsWith(string2);
                if (bl8) {
                    return 3;
                }
                string2 = ".flac";
                boolean bl9 = ((String)object).endsWith(string2);
                int n7 = 4;
                if (bl9) {
                    return n7;
                }
                string2 = ".flv";
                boolean bl10 = ((String)object).endsWith(string2);
                int n8 = 5;
                if (bl10) {
                    return n8;
                }
                string2 = ".mid";
                boolean bl11 = ((String)object).endsWith(string2);
                if (!(bl11 || (bl7 = ((String)object).endsWith(string2 = ".midi")) || (bl6 = ((String)object).endsWith(string2 = ".smf")))) {
                    boolean bl12;
                    String string3 = ".mk";
                    int n10 = ((String)object).length() - n7;
                    boolean bl13 = ((String)object).startsWith(string3, n10);
                    if (!bl13 && !(bl12 = ((String)object).endsWith(string2 = ".webm"))) {
                        int n14;
                        String string4;
                        boolean bl14;
                        int n15;
                        boolean bl15;
                        int n16;
                        String string5;
                        boolean bl16;
                        string2 = ".mp3";
                        boolean bl17 = ((String)object).endsWith(string2);
                        if (bl17) {
                            return 7;
                        }
                        string2 = ".mp4";
                        boolean bl18 = ((String)object).endsWith(string2);
                        if (!(bl18 || (bl16 = ((String)object).startsWith(string5 = ".m4", n16 = ((String)object).length() - n7)) || (bl15 = ((String)object).startsWith(string2, n15 = ((String)object).length() - n8)) || (bl14 = ((String)object).startsWith(string4 = ".cmf", n14 = ((String)object).length() - n8)))) {
                            boolean bl19;
                            string4 = ".og";
                            int n17 = ((String)object).length() - n7;
                            boolean bl20 = ((String)object).startsWith(string4, n17);
                            if (!bl20 && !(bl19 = ((String)object).endsWith(string2 = ".opus"))) {
                                boolean bl21;
                                boolean bl22;
                                boolean bl23;
                                string2 = ".ps";
                                boolean bl24 = ((String)object).endsWith(string2);
                                if (!(bl24 || (bl23 = ((String)object).endsWith(string2 = ".mpeg")) || (bl22 = ((String)object).endsWith(string2 = ".mpg")) || (bl21 = ((String)object).endsWith(string2 = ".m2p")))) {
                                    boolean bl25;
                                    string2 = ".ts";
                                    n8 = ((String)object).endsWith(string2) ? 1 : 0;
                                    if (n8 == 0 && !(bl25 = ((String)object).startsWith(string2, n8 = ((String)object).length() - n7))) {
                                        boolean bl26;
                                        string2 = ".wav";
                                        boolean bl27 = ((String)object).endsWith(string2);
                                        if (!bl27 && !(bl26 = ((String)object).endsWith(string2 = ".wave"))) {
                                            boolean bl28;
                                            string2 = ".vtt";
                                            boolean bl29 = ((String)object).endsWith(string2);
                                            if (!bl29 && !(bl28 = ((String)object).endsWith(string2 = ".webvtt"))) {
                                                boolean bl30;
                                                string2 = ".jpg";
                                                boolean bl31 = ((String)object).endsWith(string2);
                                                if (!bl31 && !(bl30 = ((String)object).endsWith(string2 = ".jpeg"))) {
                                                    boolean bl32;
                                                    string2 = ".avi";
                                                    boolean bl33 = ((String)object).endsWith(string2);
                                                    if (bl33) {
                                                        return 16;
                                                    }
                                                    string2 = ".png";
                                                    boolean bl34 = ((String)object).endsWith(string2);
                                                    if (bl34) {
                                                        return 17;
                                                    }
                                                    string2 = ".webp";
                                                    boolean bl35 = ((String)object).endsWith(string2);
                                                    if (bl35) {
                                                        return 18;
                                                    }
                                                    string2 = ".bmp";
                                                    boolean bl36 = ((String)object).endsWith(string2);
                                                    if (!bl36 && !(bl32 = ((String)object).endsWith(string2 = ".dib"))) {
                                                        boolean bl37;
                                                        string2 = ".heic";
                                                        boolean bl38 = ((String)object).endsWith(string2);
                                                        if (!bl38 && !(bl37 = ((String)object).endsWith(string2 = ".heif"))) {
                                                            string2 = ".avif";
                                                            boolean bl39 = ((String)object).endsWith(string2);
                                                            if (bl39) {
                                                                return 21;
                                                            }
                                                            return n3;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static byte[] c(InputStream object, int n3) {
        int n4;
        byte[] byArray = new byte[n3];
        for (int i3 = 0; i3 < n3; i3 += n4) {
            n4 = n3 - i3;
            if ((n4 = ((InputStream)object).read(byArray, i3, n4)) >= 0) {
                continue;
            }
            object = hj0_0.a(n3, "Not enough bytes to read: ");
            IllegalStateException illegalStateException = new IllegalStateException((String)object);
            throw illegalStateException;
        }
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] d(FileInputStream object, int n3, int n4) {
        Throwable throwable2;
        Inflater inflater;
        block10: {
            int n7;
            inflater = new Inflater();
            try {
                int n8;
                int n10;
                byte[] byArray = new byte[n4];
                int n14 = 2048;
                byte[] byArray2 = new byte[n14];
                int n15 = 0;
                for (n7 = 0; (n8 = inflater.finished()) == 0 && (n8 = inflater.needsDictionary()) == 0 && n7 < n3; n15 += n10, n7 += n8) {
                    n8 = ((InputStream)object).read(byArray2);
                    if (n8 >= 0) {
                        inflater.setInput(byArray2, 0, n8);
                        n10 = n4 - n15;
                        try {
                            n10 = inflater.inflate(byArray, n15, n10);
                            continue;
                        }
                        catch (DataFormatException dataFormatException) {
                            String string2 = dataFormatException.getMessage();
                            IllegalStateException illegalStateException = new IllegalStateException(string2);
                            throw illegalStateException;
                        }
                    }
                    object = new StringBuilder();
                    String string3 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ";
                    ((StringBuilder)object).append(string3);
                    ((StringBuilder)object).append(n3);
                    Object object2 = " bytes";
                    ((StringBuilder)object).append((String)object2);
                    object = ((StringBuilder)object).toString();
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
                if (n7 == n3) {
                    boolean bl2 = inflater.finished();
                    if (bl2) {
                        inflater.end();
                        return byArray;
                    }
                    object = "Inflater did not finish";
                    IllegalStateException illegalStateException = new IllegalStateException((String)object);
                    throw illegalStateException;
                }
            }
            catch (Throwable throwable2) {
                break block10;
            }
            object = new StringBuilder();
            String string4 = "Didn't read enough bytes during decompression. expected=";
            ((StringBuilder)object).append(string4);
            ((StringBuilder)object).append(n3);
            Object object3 = " actual=";
            ((StringBuilder)object).append((String)object3);
            ((StringBuilder)object).append(n7);
            object = ((StringBuilder)object).toString();
            object3 = new IllegalStateException((String)object);
            throw object3;
        }
        inflater.end();
        throw throwable2;
    }

    public static long e(InputStream object, int n3) {
        object = gz0_0.c((InputStream)object, n3);
        long l2 = 0L;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = object[i3] & 0xFF;
            long l3 = n4;
            int n7 = i3 * 8;
            l2 += (l3 <<= n7);
        }
        return l2;
    }

    public static void f(ByteArrayOutputStream byteArrayOutputStream, long l2, int n3) {
        byte[] byArray = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = i3 * 8;
            long l3 = l2 >> n4;
            long l4 = 255L;
            int n7 = (int)(l3 &= l4);
            byArray[i3] = n4 = (int)((byte)n7);
        }
        byteArrayOutputStream.write(byArray);
    }

    public static void g(ByteArrayOutputStream byteArrayOutputStream, int n3) {
        long l2 = n3;
        gz0_0.f(byteArrayOutputStream, l2, 2);
    }
}

