/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetManager$AssetInputStream
 *  android.media.MediaMetadataRetriever
 *  android.os.Build$VERSION
 *  android.system.OsConstants
 *  android.util.Log
 */
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/*
 * Renamed from uE0
 */
public final class ue0_0 {
    public static final byte[] A;
    public static final byte[] B;
    public static final byte[] C;
    public static final String[] D;
    public static final int[] E;
    public static final byte[] F;
    public static final uE0$d G;
    public static final uE0$d[][] H;
    public static final uE0$d[] I;
    public static final HashMap[] J;
    public static final HashMap[] K;
    public static final HashSet L;
    public static final HashMap M;
    public static final Charset N;
    public static final byte[] O;
    public static final byte[] P;
    public static final boolean l;
    public static final List m;
    public static final List n;
    public static final int[] o;
    public static final int[] p;
    public static final byte[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final byte[] t;
    public static final byte[] u;
    public static final byte[] v;
    public static final byte[] w;
    public static final byte[] x;
    public static final byte[] y;
    public static final byte[] z;
    public final FileDescriptor a;
    public final AssetManager.AssetInputStream b;
    public int c;
    public final HashMap[] d;
    public final HashSet e;
    public ByteOrder f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    static {
        int n3 = 3;
        Object object = n3;
        l = Log.isLoggable((String)"ExifInterface", (int)n3);
        int n4 = 1;
        Object object2 = n4;
        int n7 = 6;
        Object object3 = n7;
        int n8 = 8;
        Object object4 = n8;
        int n10 = 4;
        Object object5 = new Integer[n10];
        object5[0] = object2;
        object5[n4] = object3;
        int n14 = 2;
        object5[n14] = object;
        object5[n3] = object4;
        m = Arrays.asList(object5);
        object5 = n14;
        Object object6 = 7;
        Object object7 = n10;
        Object object8 = 5;
        Object object9 = new Integer[n10];
        object9[0] = object5;
        object9[n4] = object6;
        object9[n14] = object7;
        object9[n3] = object8;
        n = Arrays.asList(object9);
        o = new int[]{n8, n8, n8};
        p = new int[]{n8};
        Object[] objectArray = object9 = (Object)new byte[n3];
        object9[0] = -1;
        objectArray[1] = -40;
        objectArray[2] = -1;
        q = (byte[])object9;
        Object[] objectArray2 = object9 = (Object)new byte[n10];
        Object[] objectArray3 = object9;
        objectArray2[0] = 102;
        objectArray3[1] = 116;
        objectArray2[2] = 121;
        objectArray3[3] = 112;
        r = (byte[])object9;
        Object[] objectArray4 = object9 = (Object)new byte[n10];
        Object[] objectArray5 = object9;
        objectArray4[0] = 109;
        objectArray5[1] = 105;
        objectArray4[2] = 102;
        objectArray5[3] = 49;
        s = (byte[])object9;
        Object[] objectArray6 = object9 = (Object)new byte[n10];
        Object[] objectArray7 = object9;
        objectArray6[0] = 104;
        objectArray7[1] = 101;
        objectArray6[2] = 105;
        objectArray7[3] = 99;
        t = (byte[])object9;
        Object[] objectArray8 = object9 = (Object)new byte[n7];
        Object[] objectArray9 = object9;
        objectArray8[0] = 79;
        objectArray9[1] = 76;
        objectArray8[2] = 89;
        objectArray9[3] = 77;
        objectArray8[4] = 80;
        objectArray9[5] = (Integer)false;
        u = (byte[])object9;
        Object[] objectArray10 = object9 = (Object)new byte[10];
        Object[] objectArray11 = object9;
        objectArray10[0] = 79;
        objectArray11[1] = 76;
        objectArray10[2] = 89;
        objectArray11[3] = 77;
        objectArray10[4] = 80;
        objectArray11[5] = 85;
        objectArray10[6] = 83;
        objectArray11[7] = (Integer)false;
        objectArray10[8] = 73;
        objectArray11[9] = 73;
        v = (byte[])object9;
        Object[] objectArray12 = object9 = (Object)new byte[n8];
        Object[] objectArray13 = object9;
        objectArray12[0] = -119;
        objectArray13[1] = 80;
        objectArray12[2] = 78;
        objectArray13[3] = 71;
        objectArray12[4] = 13;
        objectArray13[5] = 10;
        objectArray12[6] = 26;
        objectArray13[7] = 10;
        w = (byte[])object9;
        Object[] objectArray14 = object9 = (Object)new byte[n10];
        Object[] objectArray15 = object9;
        objectArray14[0] = 101;
        objectArray15[1] = 88;
        objectArray14[2] = 73;
        objectArray15[3] = 102;
        x = (byte[])object9;
        Object[] objectArray16 = object9 = (Object)new byte[n10];
        Object[] objectArray17 = object9;
        objectArray16[0] = 73;
        objectArray17[1] = 72;
        objectArray16[2] = 68;
        objectArray17[3] = 82;
        y = (byte[])object9;
        Object[] objectArray18 = object9 = (Object)new byte[n10];
        Object[] objectArray19 = object9;
        objectArray18[0] = 73;
        objectArray19[1] = 69;
        objectArray18[2] = 78;
        objectArray19[3] = 68;
        z = (byte[])object9;
        Object[] objectArray20 = object9 = (Object)new byte[n10];
        Object[] objectArray21 = object9;
        objectArray20[0] = 82;
        objectArray21[1] = 73;
        objectArray20[2] = 70;
        objectArray21[3] = 70;
        A = (byte[])object9;
        Object[] objectArray22 = object9 = (Object)new byte[n10];
        Object[] objectArray23 = object9;
        objectArray22[0] = 87;
        objectArray23[1] = 69;
        objectArray22[2] = 66;
        objectArray23[3] = 80;
        B = (byte[])object9;
        Object[] objectArray24 = object9 = (Object)new byte[n10];
        Object[] objectArray25 = object9;
        objectArray24[0] = 69;
        objectArray25[1] = 88;
        objectArray24[2] = 73;
        objectArray25[3] = 70;
        C = (byte[])object9;
        object7 = Charset.defaultCharset();
        "VP8X".getBytes((Charset)object7);
        object7 = Charset.defaultCharset();
        "VP8L".getBytes((Charset)object7);
        object7 = Charset.defaultCharset();
        "VP8 ".getBytes((Charset)object7);
        object7 = Charset.defaultCharset();
        "ANIM".getBytes((Charset)object7);
        object7 = Charset.defaultCharset();
        "ANMF".getBytes((Charset)object7);
        String string2 = "SRATIONAL";
        String string3 = "SINGLE";
        String string4 = "";
        String string5 = "BYTE";
        String string6 = "USHORT";
        String string7 = "ULONG";
        String string8 = "SBYTE";
        String string9 = "UNDEFINED";
        String string10 = "SSHORT";
        String string11 = "SLONG";
        String string12 = "DOUBLE";
        D = new String[]{string4, string5, "STRING", string6, string7, "URATIONAL", string8, string9, string10, string11, string2, string3, string12, "IFD"};
        object7 = new int[14];
        uE0$d[] uE0$dArray = object7;
        uE0$dArray[0] = false;
        uE0$dArray[1] = true;
        uE0$dArray[2] = true;
        uE0$dArray[3] = 2;
        uE0$dArray[4] = 4;
        uE0$dArray[5] = 8;
        uE0$dArray[6] = true;
        uE0$dArray[7] = true;
        uE0$dArray[8] = 2;
        uE0$dArray[9] = 4;
        uE0$dArray[10] = 8;
        uE0$dArray[11] = 4;
        uE0$dArray[12] = 8;
        uE0$dArray[13] = true;
        E = (int[])object7;
        uE0$d[] uE0$dArray2 = object7 = (Object)new byte[n8];
        uE0$d[] uE0$dArray3 = object7;
        uE0$dArray2[0] = 65;
        uE0$dArray3[1] = 83;
        uE0$dArray2[2] = 67;
        uE0$dArray3[3] = 73;
        uE0$dArray2[4] = 73;
        uE0$dArray3[5] = false;
        uE0$dArray2[6] = false;
        uE0$dArray3[7] = false;
        F = (byte[])object7;
        object9 = "NewSubfileType";
        object7 = new uE0$d((String)object9, 254, n10);
        Object object10 = "SubfileType";
        uE0$d[] uE0$dArray4 = new uE0$d((String)object10, 255, n10);
        Object object11 = new uE0$d("ImageWidth", 256, n3, n10);
        Object object12 = new uE0$d("ImageLength", 257, n3, n10);
        object3 = "BitsPerSample";
        Object object13 = new uE0$d((String)object3, 258, n3);
        Integer n15 = object4;
        object4 = "Compression";
        Integer n16 = object6;
        Object object14 = new uE0$d((String)object4, 259, n3);
        Integer n17 = object;
        object = "PhotometricInterpretation";
        Object object15 = object5;
        object6 = new uE0$d((String)object, 262, n3);
        Object object16 = "ImageDescription";
        Integer n18 = object2;
        Integer n19 = object8;
        int n20 = 2;
        object5 = new uE0$d((String)object16, 270, n20);
        Object object17 = object16;
        List<String> list = object;
        object2 = new uE0$d("Make", 271, n20);
        Object object18 = object4;
        object16 = new uE0$d("Model", 272, n20);
        object4 = "StripOffsets";
        Object[] objectArray26 = object3;
        Object object19 = object10;
        n14 = 3;
        object = new uE0$d((String)object4, 273, n14, 4);
        Object object20 = object4;
        object10 = new uE0$d("Orientation", 274, n14);
        Object object21 = object9;
        Object object22 = object4 = new uE0$d("SamplesPerPixel", 277, n14);
        uE0$d[] uE0$dArray5 = object10;
        int n21 = 4;
        Object object23 = object9 = new uE0$d("RowsPerStrip", 278, n14, n21);
        object4 = new uE0$d("StripByteCounts", 279, n14, n21);
        n20 = 5;
        uE0$d[] uE0$dArray6 = object3 = new uE0$d("XResolution", 282, n20);
        uE0$d[] uE0$dArray7 = object10 = new uE0$d("YResolution", 283, n20);
        n21 = 3;
        uE0$d[] uE0$dArray8 = object3 = new uE0$d("PlanarConfiguration", 284, n21);
        Object object24 = object9 = new uE0$d("ResolutionUnit", 296, n21);
        uE0$d[] uE0$dArray9 = object3 = new uE0$d("TransferFunction", 301, n21);
        n14 = 2;
        Object object25 = object10 = new uE0$d("Software", 305, n14);
        Object object26 = object9 = new uE0$d("DateTime", 306, n14);
        Object object27 = object10 = new uE0$d("Artist", 315, n14);
        n21 = 5;
        Object object28 = object3 = new uE0$d("WhitePoint", 318, n21);
        object9 = new uE0$d("PrimaryChromaticities", 319, n21);
        object10 = "SubIFDPointer";
        Object object29 = object9;
        int n22 = 4;
        object3 = new uE0$d((String)object10, 330, n22);
        uE0$d[] uE0$dArray10 = object10;
        Object object30 = object3;
        Object object31 = object8 = new uE0$d("JPEGInterchangeFormat", 513, n22);
        Object object32 = object3 = new uE0$d("JPEGInterchangeFormatLength", 514, n22);
        Object object33 = object10 = new uE0$d("YCbCrCoefficients", 529, 5);
        n21 = 3;
        Object object34 = object3 = new uE0$d("YCbCrSubSampling", 530, n21);
        Object object35 = object9 = new uE0$d("YCbCrPositioning", 531, n21);
        Object object36 = object3 = new uE0$d("ReferenceBlackWhite", 532, 5);
        object10 = new uE0$d("Copyright", 33432, 2);
        object9 = "ExifIFDPointer";
        Object object37 = object10;
        n21 = 4;
        object3 = new uE0$d((String)object9, 34665, n21);
        Object object38 = object9;
        object9 = "GPSInfoIFDPointer";
        Object object39 = object3;
        object8 = new uE0$d((String)object9, 34853, n21);
        Object object40 = object9;
        Object object41 = object3 = new uE0$d("SensorTopBorder", n21, n21);
        Object object42 = object8;
        Object object43 = object9 = new uE0$d("SensorLeftBorder", 5, n21);
        uE0$d[] uE0$dArray11 = object3 = new uE0$d("SensorBottomBorder", 6, n21);
        Object object44 = object9 = new uE0$d("SensorRightBorder", 7, n21);
        Object object45 = object10 = new uE0$d("ISO", 23, 3);
        Object object46 = object9 = new uE0$d("JpgFromRaw", 46, 7);
        n22 = 1;
        object3 = new uE0$d("Xmp", 700, n22);
        object10 = new uE0$d[42];
        object10[0] = object7;
        object10[n22] = uE0$dArray4;
        object10[2] = object11;
        object10[3] = object12;
        object10[4] = object13;
        object10[5] = object14;
        object10[6] = object6;
        object10[7] = object5;
        object10[8] = object2;
        object10[9] = object16;
        object10[10] = object;
        object10[11] = uE0$dArray5;
        object10[12] = object22;
        object10[13] = object23;
        object10[14] = object4;
        object10[15] = uE0$dArray6;
        object10[16] = uE0$dArray7;
        object10[17] = uE0$dArray8;
        object10[18] = object24;
        object10[19] = uE0$dArray9;
        object10[20] = object25;
        object10[21] = object26;
        object10[22] = object27;
        object10[23] = object28;
        object10[24] = object29;
        object10[25] = object30;
        object10[26] = object31;
        object10[27] = object32;
        object10[28] = object33;
        object10[29] = object34;
        object10[30] = object35;
        object10[31] = object36;
        object10[32] = object37;
        object10[33] = object39;
        object10[34] = object8;
        object10[35] = object41;
        object10[36] = object43;
        object10[37] = uE0$dArray11;
        object10[38] = object44;
        object10[39] = object45;
        object10[40] = object9;
        object10[41] = object3;
        n22 = 5;
        object3 = new uE0$d("ExposureTime", 33434, n22);
        object14 = new uE0$d("FNumber", 33437, n22);
        int n24 = 3;
        object5 = new uE0$d("ExposureProgram", 34850, n24);
        object9 = new uE0$d("SpectralSensitivity", 34852, 2);
        object6 = new uE0$d("PhotographicSensitivity", 34855, n24);
        object13 = new uE0$d("OECF", 34856, 7);
        uE0$dArray4 = new uE0$d("SensitivityType", 34864, n24);
        n7 = 4;
        object4 = new uE0$d("StandardOutputSensitivity", 34865, n7);
        object7 = new uE0$d("RecommendedExposureIndex", 34866, n7);
        object2 = new uE0$d("ISOSpeed", 34867, n7);
        object = new uE0$d("ISOSpeedLatitudeyyy", 34868, n7);
        object16 = new uE0$d("ISOSpeedLatitudezzz", 34869, n7);
        uE0$dArray9 = object10;
        n21 = 2;
        object11 = new uE0$d("ExifVersion", 36864, n21);
        object25 = object11;
        object12 = new uE0$d("DateTimeOriginal", 36867, n21);
        object26 = object12;
        object11 = new uE0$d("DateTimeDigitized", 36868, n21);
        object27 = object11;
        object12 = new uE0$d("OffsetTime", 36880, n21);
        object28 = object12;
        object11 = new uE0$d("OffsetTimeOriginal", 36881, n21);
        object29 = object11;
        object12 = new uE0$d("OffsetTimeDigitized", 36882, n21);
        object30 = object12;
        object11 = new uE0$d("ComponentsConfiguration", 37121, 7);
        object31 = object11;
        object12 = new uE0$d("CompressedBitsPerPixel", 37122, 5);
        object32 = object12;
        object33 = object10 = new uE0$d("ShutterSpeedValue", 37377, 10);
        object11 = new uE0$d("ApertureValue", 37378, 5);
        object34 = object11;
        n4 = 10;
        object12 = new uE0$d("BrightnessValue", 37379, n4);
        object35 = object12;
        object36 = object10 = new uE0$d("ExposureBiasValue", 37380, n4);
        n21 = 5;
        object11 = new uE0$d("MaxApertureValue", 37381, n21);
        object37 = object11;
        object12 = new uE0$d("SubjectDistance", 37382, n21);
        object39 = object12;
        n7 = 3;
        object11 = new uE0$d("MeteringMode", 37383, n7);
        object41 = object11;
        object42 = object10 = new uE0$d("LightSource", 37384, n7);
        object11 = new uE0$d("Flash", 37385, n7);
        object43 = object11;
        uE0$dArray11 = object10 = new uE0$d("FocalLength", 37386, 5);
        object11 = new uE0$d("SubjectArea", 37396, 3);
        object44 = object11;
        n4 = 7;
        object12 = new uE0$d("MakerNote", 37500, n4);
        object45 = object12;
        object10 = new uE0$d("UserComment", 37510, n4);
        object46 = object10;
        n21 = 2;
        uE0$d[] uE0$dArray12 = object11 = new uE0$d("SubSecTime", 37520, n21);
        object12 = new uE0$d("SubSecTimeOriginal", 37521, n21);
        uE0$d uE0$d = object12;
        uE0$d[] uE0$dArray13 = object11 = new uE0$d("SubSecTimeDigitized", 37522, n21);
        object12 = new uE0$d("FlashpixVersion", 40960, 7);
        uE0$d uE0$d2 = object12;
        n7 = 3;
        uE0$d[] uE0$dArray14 = object11 = new uE0$d("ColorSpace", 40961, n7);
        uE0$d[] uE0$dArray15 = object16;
        n3 = 4;
        Object object47 = object10 = new uE0$d("PixelXDimension", 40962, n7, n3);
        object11 = new uE0$d("PixelYDimension", 40963, n7, n3);
        object12 = new uE0$d("RelatedSoundFile", 40964, 2);
        uE0$d uE0$d3 = object12;
        object16 = new uE0$d("InteroperabilityIFDPointer", 40965, 4);
        uE0$d[] uE0$dArray16 = object16;
        object12 = new uE0$d("FlashEnergy", 41483, 5);
        uE0$d uE0$d4 = object12;
        Object object48 = object10 = new uE0$d("SpatialFrequencyResponse", 41484, 7);
        n21 = 5;
        object16 = new uE0$d("FocalPlaneXResolution", 41486, n21);
        uE0$d[] uE0$dArray17 = object16;
        object12 = new uE0$d("FocalPlaneYResolution", 41487, n21);
        uE0$d uE0$d5 = object12;
        n7 = 3;
        object16 = new uE0$d("FocalPlaneResolutionUnit", 41488, n7);
        uE0$d[] uE0$dArray18 = object16;
        Object object49 = object10 = new uE0$d("SubjectLocation", 41492, n7);
        object16 = new uE0$d("ExposureIndex", 41493, 5);
        uE0$d[] uE0$dArray19 = object16;
        object12 = new uE0$d("SensingMethod", 41495, 3);
        uE0$d uE0$d6 = object12;
        n7 = 7;
        object16 = new uE0$d("FileSource", 41728, n7);
        uE0$d[] uE0$dArray20 = object16;
        Object object50 = object10 = new uE0$d("SceneType", 41729, n7);
        object16 = new uE0$d("CFAPattern", 41730, n7);
        uE0$d[] uE0$dArray21 = object16;
        n3 = 3;
        object12 = new uE0$d("CustomRendered", 41985, n3);
        uE0$d uE0$d7 = object12;
        Object object51 = object10 = new uE0$d("ExposureMode", 41986, n3);
        object12 = new uE0$d("WhiteBalance", 41987, n3);
        uE0$d uE0$d8 = object12;
        Object object52 = object10 = new uE0$d("DigitalZoomRatio", 41988, 5);
        n21 = 3;
        object16 = new uE0$d("FocalLengthIn35mmFilm", 41989, n21);
        uE0$d[] uE0$dArray22 = object16;
        object12 = new uE0$d("SceneCaptureType", 41990, n21);
        uE0$d uE0$d9 = object12;
        object16 = new uE0$d("GainControl", 41991, n21);
        uE0$d[] uE0$dArray23 = object16;
        object12 = new uE0$d("Contrast", 41992, n21);
        uE0$d uE0$d10 = object12;
        object16 = new uE0$d("Saturation", 41993, n21);
        uE0$d[] uE0$dArray24 = object16;
        object12 = new uE0$d("Sharpness", 41994, n21);
        uE0$d uE0$d11 = object12;
        object16 = new uE0$d("DeviceSettingDescription", 41995, 7);
        uE0$d[] uE0$dArray25 = object16;
        object12 = new uE0$d("SubjectDistanceRange", 41996, 3);
        uE0$d uE0$d12 = object12;
        n7 = 2;
        object16 = new uE0$d("ImageUniqueID", 42016, n7);
        uE0$d[] uE0$dArray26 = object16;
        Object object53 = object10 = new uE0$d("CameraOwnerName", 42032, n7);
        object16 = new uE0$d("BodySerialNumber", 42033, n7);
        uE0$d[] uE0$dArray27 = object16;
        Object object54 = object10 = new uE0$d("LensSpecification", 42034, 5);
        n21 = 2;
        object16 = new uE0$d("LensMake", 42035, n21);
        uE0$d[] uE0$dArray28 = object16;
        object12 = new uE0$d("LensModel", 42036, n21);
        uE0$d uE0$d13 = object12;
        object16 = new uE0$d("Gamma", 42240, 5);
        uE0$d[] uE0$dArray29 = object16;
        object12 = new uE0$d("DNGVersion", 50706, 1);
        n4 = 4;
        n7 = 3;
        object10 = new uE0$d("DefaultCropSize", 50720, n7, n4);
        object16 = new uE0$d[74];
        object16[0] = object3;
        object16[1] = object14;
        object16[2] = object5;
        object16[n7] = object9;
        object16[n4] = object6;
        object16[5] = object13;
        object16[6] = uE0$dArray4;
        object16[7] = object4;
        object16[8] = object7;
        object16[9] = object2;
        object16[10] = object;
        object16[11] = uE0$dArray15;
        object16[12] = object25;
        object16[13] = object26;
        object16[14] = object27;
        object16[15] = object28;
        object16[16] = object29;
        object16[17] = object30;
        object16[18] = object31;
        object16[19] = object32;
        object16[20] = object33;
        object16[21] = object34;
        object16[22] = object35;
        object16[23] = object36;
        object16[24] = object37;
        object16[25] = object39;
        object16[26] = object41;
        object16[27] = object42;
        object16[28] = object43;
        object16[29] = uE0$dArray11;
        object16[30] = object44;
        object16[31] = object45;
        object16[32] = object46;
        object16[33] = uE0$dArray12;
        object16[34] = uE0$d;
        object16[35] = uE0$dArray13;
        object16[36] = uE0$d2;
        object16[37] = uE0$dArray14;
        object16[38] = object47;
        object16[39] = object11;
        object16[40] = uE0$d3;
        object16[41] = uE0$dArray16;
        object16[42] = uE0$d4;
        object16[43] = object48;
        object16[44] = uE0$dArray17;
        object16[45] = uE0$d5;
        object16[46] = uE0$dArray18;
        object16[47] = object49;
        object16[48] = uE0$dArray19;
        object16[49] = uE0$d6;
        object16[50] = uE0$dArray20;
        object16[51] = object50;
        object16[52] = uE0$dArray21;
        object16[53] = uE0$d7;
        object16[54] = object51;
        object16[55] = uE0$d8;
        object16[56] = object52;
        object16[57] = uE0$dArray22;
        object16[58] = uE0$d9;
        object16[59] = uE0$dArray23;
        object16[60] = uE0$d10;
        object16[61] = uE0$dArray24;
        object16[62] = uE0$d11;
        object16[63] = uE0$dArray25;
        object16[64] = uE0$d12;
        object16[65] = uE0$dArray26;
        object16[66] = object53;
        object16[67] = uE0$dArray27;
        object16[68] = object54;
        object16[69] = uE0$dArray28;
        object16[70] = uE0$d13;
        object16[71] = uE0$dArray29;
        object16[72] = object12;
        object16[73] = object10;
        int n25 = 1;
        object = new uE0$d("GPSVersionID", 0, n25);
        n14 = 2;
        object11 = new uE0$d("GPSLatitudeRef", n25, n14);
        n8 = 5;
        int n26 = 10;
        object2 = new uE0$d("GPSLatitude", n14, n8, n26);
        object12 = new uE0$d("GPSLongitudeRef", 3, n14);
        object3 = new uE0$d("GPSLongitude", 4, n8, n26);
        object4 = new uE0$d("GPSAltitudeRef", n8, 1);
        object14 = new uE0$d("GPSAltitude", 6, n8);
        object5 = new uE0$d("GPSTimeStamp", 7, n8);
        int n27 = 2;
        uE0$dArray4 = new uE0$d("GPSSatellites", 8, n27);
        object10 = new uE0$d("GPSStatus", 9, n27);
        object9 = new uE0$d("GPSMeasureMode", 10, n27);
        object7 = new uE0$d("GPSDOP", 11, 5);
        uE0$d[] uE0$dArray30 = object16;
        object6 = new uE0$d("GPSSpeedRef", 12, 2);
        object25 = object6;
        object16 = new uE0$d("GPSSpeed", 13, 5);
        object26 = object16;
        object6 = new uE0$d("GPSTrackRef", 14, 2);
        object27 = object6;
        object16 = new uE0$d("GPSTrack", 15, 5);
        object28 = object16;
        object6 = new uE0$d("GPSImgDirectionRef", 16, 2);
        object29 = object6;
        object16 = new uE0$d("GPSImgDirection", 17, 5);
        object30 = object16;
        n20 = 2;
        object6 = new uE0$d("GPSMapDatum", 18, n20);
        object31 = object6;
        object16 = new uE0$d("GPSDestLatitudeRef", 19, n20);
        object32 = object16;
        object6 = new uE0$d("GPSDestLatitude", 20, 5);
        object33 = object6;
        object13 = new uE0$d("GPSDestLongitudeRef", 21, 2);
        object34 = object13;
        object16 = new uE0$d("GPSDestLongitude", 22, 5);
        object35 = object16;
        object6 = new uE0$d("GPSDestBearingRef", 23, 2);
        object36 = object6;
        object13 = new uE0$d("GPSDestBearing", 24, 5);
        object37 = object13;
        object16 = new uE0$d("GPSDestDistanceRef", 25, 2);
        object39 = object16;
        object6 = new uE0$d("GPSDestDistance", 26, 5);
        object41 = object6;
        n27 = 7;
        object16 = new uE0$d("GPSProcessingMethod", 27, n27);
        object42 = object16;
        object43 = object13 = new uE0$d("GPSAreaInformation", 28, n27);
        object16 = new uE0$d("GPSDateStamp", 29, 2);
        uE0$dArray11 = object16;
        object6 = new uE0$d("GPSDifferential", 30, 3);
        object44 = object6;
        n27 = 5;
        object13 = new uE0$d("GPSHPositioningError", 31, n27);
        object16 = new uE0$d[32];
        object16[0] = object;
        object16[1] = object11;
        object16[2] = object2;
        object16[3] = object12;
        object16[4] = object3;
        object16[n27] = object4;
        object16[6] = object14;
        object16[7] = object5;
        object16[8] = uE0$dArray4;
        object16[9] = object10;
        object16[10] = object9;
        object16[11] = object7;
        object16[12] = object25;
        object16[13] = object26;
        object16[14] = object27;
        object16[15] = object28;
        object16[16] = object29;
        object16[17] = object30;
        object16[18] = object31;
        object16[19] = object32;
        object16[20] = object33;
        object16[21] = object34;
        object16[22] = object35;
        object16[23] = object36;
        object16[24] = object37;
        object16[25] = object39;
        object16[26] = object41;
        object16[27] = object42;
        object16[28] = object43;
        object16[29] = uE0$dArray11;
        object16[30] = object6;
        object16[31] = object13;
        n25 = 1;
        object = new uE0$d("InteroperabilityIndex", n25, 2);
        object11 = new uE0$d[n25];
        object11[0] = object;
        object2 = object21;
        n14 = 4;
        object = new uE0$d((String)object21, 254, n14);
        object12 = object19;
        object2 = new uE0$d((String)object19, 255, n14);
        n26 = 3;
        object12 = new uE0$d("ThumbnailImageWidth", 256, n26, n14);
        uE0$dArray4 = new uE0$d("ThumbnailImageLength", 257, n26, n14);
        object14 = objectArray26;
        int n28 = 258;
        object3 = new uE0$d((String)objectArray26, n28, n26);
        object5 = object18;
        n21 = 259;
        object14 = new uE0$d((String)object18, n21, n26);
        object10 = list;
        object5 = new uE0$d((String)((Object)list), 262, n26);
        object10 = object17;
        n22 = 270;
        n27 = 2;
        object4 = new uE0$d((String)object17, n22, n27);
        object10 = new uE0$d("Make", 271, n27);
        object9 = new uE0$d("Model", 272, n27);
        uE0$d[] uE0$dArray31 = object11;
        object13 = object20;
        n24 = 3;
        object6 = new uE0$d((String)object20, 273, n24, 4);
        Object object55 = object16;
        object11 = new uE0$d("ThumbnailOrientation", 274, n24);
        object16 = new uE0$d("SamplesPerPixel", 277, n24);
        Object object56 = object16;
        Object object57 = object11;
        n4 = 4;
        Object object58 = object13 = new uE0$d("RowsPerStrip", 278, n24, n4);
        object16 = new uE0$d("StripByteCounts", 279, n24, n4);
        n20 = 5;
        object17 = object11 = new uE0$d("XResolution", 282, n20);
        object7 = new uE0$d("YResolution", 283, n20);
        list = object7;
        n24 = 3;
        object18 = object11 = new uE0$d("PlanarConfiguration", 284, n24);
        object13 = new uE0$d("ResolutionUnit", 296, n24);
        objectArray26 = object13;
        object19 = object11 = new uE0$d("TransferFunction", 301, n24);
        n4 = 2;
        object7 = new uE0$d("Software", 305, n4);
        object21 = object7;
        object13 = new uE0$d("DateTime", 306, n4);
        object25 = object13;
        object7 = new uE0$d("Artist", 315, n4);
        object26 = object7;
        n24 = 5;
        object11 = new uE0$d("WhitePoint", 318, n24);
        object27 = object11;
        object13 = new uE0$d("PrimaryChromaticities", 319, n24);
        object28 = object13;
        object7 = uE0$dArray10;
        int n29 = 4;
        object11 = new uE0$d((String)uE0$dArray10, 330, n29);
        object29 = object11;
        object30 = object8 = new uE0$d("JPEGInterchangeFormat", 513, n29);
        object11 = new uE0$d("JPEGInterchangeFormatLength", 514, n29);
        object31 = object11;
        object32 = object7 = new uE0$d("YCbCrCoefficients", 529, 5);
        n24 = 3;
        object11 = new uE0$d("YCbCrSubSampling", 530, n24);
        object33 = object11;
        object13 = new uE0$d("YCbCrPositioning", 531, n24);
        object34 = object13;
        object11 = new uE0$d("ReferenceBlackWhite", 532, 5);
        object35 = object11;
        object36 = object7 = new uE0$d("Copyright", 33432, 2);
        object13 = object38;
        n24 = 4;
        object11 = new uE0$d((String)object38, 34665, n24);
        object37 = object11;
        object13 = object40;
        object39 = object8 = new uE0$d((String)object40, 34853, n24);
        object11 = new uE0$d("DNGVersion", 50706, 1);
        object42 = object16;
        object41 = object11;
        n3 = 4;
        n4 = 3;
        object7 = new uE0$d("DefaultCropSize", 50720, n4, n3);
        n29 = 37;
        object13 = new uE0$d[n29];
        object13[0] = object;
        object13[1] = object2;
        object13[2] = object12;
        object13[n4] = uE0$dArray4;
        object13[n3] = object3;
        object13[5] = object14;
        object13[6] = object5;
        object13[7] = object4;
        object13[8] = object10;
        object13[9] = object9;
        object13[10] = object6;
        object13[11] = object57;
        object13[12] = object56;
        object13[13] = object58;
        object13[14] = object16;
        object13[15] = object17;
        object13[16] = list;
        object13[17] = object18;
        object13[18] = objectArray26;
        object13[19] = object19;
        object13[20] = object21;
        object13[21] = object25;
        object13[22] = object26;
        object13[23] = object27;
        object13[24] = object28;
        object13[25] = object29;
        object13[26] = object30;
        object13[27] = object31;
        object13[28] = object32;
        object13[29] = object33;
        object13[30] = object34;
        object13[31] = object35;
        object13[32] = object36;
        object13[33] = object37;
        object13[34] = object8;
        object13[35] = object11;
        object13[36] = object7;
        object11 = object20;
        object16 = new uE0$d((String)object20, 273, 3);
        G = object16;
        n4 = 7;
        object16 = new uE0$d("ThumbnailImage", 256, n4);
        n7 = 4;
        object = new uE0$d("CameraSettingsIFDPointer", 8224, n7);
        object11 = new uE0$d("ImageProcessingIFDPointer", 8256, n7);
        object3 = new uE0$d[3];
        object3[0] = object16;
        n3 = 1;
        object3[n3] = object;
        int n30 = 2;
        object3[n30] = object11;
        object11 = new uE0$d("PreviewImageStart", 257, n7);
        object4 = "PreviewImageLength";
        uE0$dArray4 = new uE0$d((String)object4, 258, n7);
        object12 = new uE0$d[n30];
        object12[0] = object11;
        object12[n3] = uE0$dArray4;
        n26 = 3;
        object = new uE0$d("AspectFrame", 4371, n26);
        object11 = new uE0$d[n3];
        object11[0] = object;
        object = new uE0$d("ColorSpace", 55, n26);
        uE0$dArray4 = new uE0$d[n3];
        uE0$dArray4[0] = object;
        object14 = new uE0$d[10][];
        object14[0] = uE0$dArray9;
        object14[n3] = uE0$dArray30;
        object14[2] = object55;
        object14[n26] = uE0$dArray31;
        n3 = 4;
        object14[n3] = object13;
        object14[5] = uE0$dArray9;
        object14[6] = object3;
        object14[7] = object12;
        object14[8] = object11;
        object14[9] = uE0$dArray4;
        H = object14;
        object11 = uE0$dArray10;
        n25 = 330;
        object = new uE0$d((String)uE0$dArray10, n25, n3);
        object2 = object38;
        n7 = 34665;
        object11 = new uE0$d((String)object38, n7, n3);
        object12 = object40;
        n14 = 34853;
        object2 = new uE0$d((String)object40, n14, n3);
        object12 = new uE0$d("InteroperabilityIFDPointer", 40965, n3);
        n26 = 1;
        object16 = new uE0$d("CameraSettingsIFDPointer", 8224, n26);
        object3 = new uE0$d("ImageProcessingIFDPointer", 8256, n26);
        n8 = 6;
        uE0$dArray4 = new uE0$d[n8];
        n10 = 0;
        object14 = null;
        uE0$dArray4[0] = object;
        uE0$dArray4[n26] = object11;
        uE0$dArray4[2] = object2;
        uE0$dArray4[3] = object12;
        n30 = 4;
        uE0$dArray4[n30] = object16;
        uE0$dArray4[5] = object3;
        I = uE0$dArray4;
        n3 = 10;
        J = new HashMap[n3];
        K = new HashMap[n3];
        object2 = "FNumber";
        object12 = "SubjectDistance";
        object3 = "GPSTimeStamp";
        object = Arrays.asList(object2, "DigitalZoomRatio", "ExposureTime", object12, object3);
        object16 = new HashSet(object);
        L = object16;
        object16 = new HashMap();
        M = object16;
        object16 = Charset.forName("US-ASCII");
        N = object16;
        O = "Exif\u0000\u0000".getBytes((Charset)object16);
        P = "http://ns.adobe.com/xap/1.0/\u0000".getBytes((Charset)object16);
        object = Locale.US;
        object16 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", (Locale)object);
        object11 = TimeZone.getTimeZone("UTC");
        ((DateFormat)object16).setTimeZone((TimeZone)object11);
        object11 = "yyyy-MM-dd HH:mm:ss";
        object16 = new SimpleDateFormat((String)object11, (Locale)object);
        object = TimeZone.getTimeZone("UTC");
        ((DateFormat)object16).setTimeZone((TimeZone)object);
        object8 = null;
        for (n20 = 0; n20 < (n30 = ((Object)(object16 = H)).length); n20 += n25) {
            object = J;
            object[n20] = object11 = new HashMap();
            object = K;
            object[n20] = object11 = new HashMap();
            object16 = object16[n20];
            n30 = ((Object)object16).length;
            object11 = null;
            for (n4 = 0; n4 < n30; n4 += n25) {
                object2 = object16[n4];
                object12 = J[n20];
                n14 = object2.a;
                object3 = n14;
                ((HashMap)object12).put(object3, object2);
                object12 = K[n20];
                object3 = object2.b;
                ((HashMap)object12).put(object3, object2);
                n25 = 1;
            }
            n25 = 1;
        }
        object16 = M;
        object = I;
        object11 = ((uE0$d)object[0]).a;
        object12 = n19;
        ((HashMap)object16).put(object11, n19);
        object11 = ((uE0$d)object[1]).a;
        object2 = n18;
        ((HashMap)object16).put(object11, n18);
        object11 = ((uE0$d)object[2]).a;
        object2 = object15;
        ((HashMap)object16).put(object11, object15);
        object11 = ((uE0$d)object[3]).a;
        object2 = n17;
        ((HashMap)object16).put(object11, n17);
        object11 = ((uE0$d)object[4]).a;
        object2 = n16;
        ((HashMap)object16).put(object11, n16);
        object = ((uE0$d)object[5]).a;
        object11 = n15;
        ((HashMap)object16).put(object, n15);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ue0_0(InputStream object) {
        block29: {
            int n3;
            block24: {
                Throwable throwable2;
                block23: {
                    block28: {
                        int n4;
                        int n7;
                        int n8;
                        int n10;
                        Object object2;
                        block22: {
                            int n14;
                            block21: {
                                FileDescriptor fileDescriptor;
                                block26: {
                                    block27: {
                                        Object object3;
                                        block25: {
                                            object2 = H;
                                            n3 = ((uE0$d[][])object2).length;
                                            object3 = new HashMap[n3];
                                            this.d = object3;
                                            n14 = ((uE0$d[][])object2).length;
                                            super(n14);
                                            this.e = object3;
                                            object3 = ByteOrder.BIG_ENDIAN;
                                            this.f = object3;
                                            if (object == null) {
                                                object = new NullPointerException("inputStream cannot be null");
                                                throw object;
                                            }
                                            n3 = object instanceof AssetManager.AssetInputStream;
                                            n14 = 0;
                                            if (n3 == 0) break block25;
                                            object3 = object;
                                            object3 = (AssetManager.AssetInputStream)object;
                                            this.b = object3;
                                            this.a = null;
                                            break block26;
                                        }
                                        n3 = object instanceof FileInputStream;
                                        if (n3 == 0) break block27;
                                        object3 = object;
                                        object3 = (FileInputStream)object;
                                        fileDescriptor = ((FileInputStream)object3).getFD();
                                        try {
                                            n10 = OsConstants.SEEK_CUR;
                                            long l2 = 0L;
                                            xE0$a.c(fileDescriptor, l2, n10);
                                            this.b = null;
                                        }
                                        catch (Exception exception) {}
                                        this.a = object3 = ((FileInputStream)object3).getFD();
                                        break block26;
                                    }
                                    this.b = null;
                                    this.a = null;
                                }
                                n3 = (int)(l ? 1 : 0);
                                n14 = 0;
                                fileDescriptor = null;
                                try {
                                    int n15;
                                    for (n8 = 0; n8 < (n10 = ((uE0$d[][])object2).length); ++n8) {
                                        HashMap hashMap;
                                        HashMap[] hashMapArray = this.d;
                                        hashMapArray[n8] = hashMap = new HashMap();
                                    }
                                    n8 = 5000;
                                    super((InputStream)object, n8);
                                    this.c = n15 = this.g((BufferedInputStream)object2);
                                    n8 = 14;
                                    n10 = 13;
                                    n7 = 9;
                                    n4 = 4;
                                    if (n15 != n4 && n15 != n7 && n15 != n10 && n15 != n8) break block21;
                                    break block22;
                                }
                                catch (Throwable throwable2) {
                                    break block23;
                                }
                                catch (IOException | UnsupportedOperationException exception) {
                                    break block24;
                                }
                            }
                            object = new uE0$f((InputStream)object2);
                            int n16 = this.c;
                            n14 = 12;
                            if (n16 == n14) {
                                this.e((uE0$f)object);
                            } else {
                                n14 = 7;
                                if (n16 == n14) {
                                    this.h((uE0$f)object);
                                } else {
                                    n14 = 10;
                                    if (n16 == n14) {
                                        this.l((uE0$f)object);
                                    } else {
                                        this.k((uE0$f)object);
                                    }
                                }
                            }
                            n16 = this.h;
                            long l3 = n16;
                            ((uE0$f)object).b(l3);
                            this.v((uE0$b)object);
                            break block28;
                        }
                        object = new uE0$b((InputStream)object2);
                        int n17 = this.c;
                        if (n17 == n4) {
                            this.f((uE0$b)object, 0, 0);
                        } else if (n17 == n10) {
                            this.i((uE0$b)object);
                        } else if (n17 == n7) {
                            this.j((uE0$b)object);
                        } else if (n17 == n8) {
                            this.m((uE0$b)object);
                        }
                    }
                    this.a();
                    if (n3 == 0) return;
                    break block29;
                }
                this.a();
                if (n3 == 0) throw throwable2;
                this.q();
                throw throwable2;
            }
            this.a();
            if (n3 == 0) return;
        }
        this.q();
    }

    public static ByteOrder r(uE0$b object) {
        int n3;
        int n4 = ((uE0$b)object).readShort();
        if (n4 != (n3 = 18761)) {
            n3 = 19789;
            if (n4 == n3) {
                return ByteOrder.BIG_ENDIAN;
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid byte order: ");
            object = Integer.toHexString(n4);
            stringBuilder.append((String)object);
            object = stringBuilder.toString();
            IOException iOException = new IOException((String)object);
            throw iOException;
        }
        return ByteOrder.LITTLE_ENDIAN;
    }

    public final void a() {
        Object object;
        Object object2;
        Object object3;
        Object object4 = this.b("DateTimeOriginal");
        int n3 = 0;
        Object object5 = null;
        Object object6 = this.d;
        if (object4 != null && (object3 = this.b((String)(object2 = "DateTime"))) == null) {
            object3 = object6[0];
            object4 = ((String)object4).concat("\u0000");
            Object object7 = N;
            object4 = ((String)object4).getBytes((Charset)object7);
            int n4 = ((Object)object4).length;
            int n7 = 2;
            object7 = new uE0$c(n7, (byte[])object4, n4);
            ((HashMap)object3).put(object2, object7);
        }
        object4 = "ImageWidth";
        object2 = this.b((String)object4);
        long l2 = 0L;
        if (object2 == null) {
            object2 = object6[0];
            object = this.f;
            object = uE0$c.a(l2, (ByteOrder)object);
            ((HashMap)object2).put(object4, object);
        }
        if ((object2 = this.b((String)(object4 = "ImageLength"))) == null) {
            object2 = object6[0];
            object = this.f;
            object = uE0$c.a(l2, (ByteOrder)object);
            ((HashMap)object2).put(object4, object);
        }
        if ((object2 = this.b((String)(object4 = "Orientation"))) == null) {
            object5 = object6[0];
            object2 = this.f;
            object2 = uE0$c.a(l2, (ByteOrder)object2);
            ((HashMap)object5).put(object4, object2);
        }
        if ((object5 = this.b((String)(object4 = "LightSource"))) == null) {
            n3 = 1;
            object5 = object6[n3];
            object6 = this.f;
            object6 = uE0$c.a(l2, (ByteOrder)object6);
            ((HashMap)object5).put(object4, object6);
        }
    }

    public final String b(String object) {
        int n3 = 2;
        int n4 = 1;
        int n7 = 3;
        Object object2 = this.d((String)object);
        float f5 = 0.0f;
        Object object3 = null;
        if (object2 != null) {
            Object object4 = L;
            boolean n8 = ((HashSet)object4).contains(object);
            if (!n8) {
                object = this.f;
                return ((uE0$c)object2).f((ByteOrder)object);
            }
            object4 = "GPSTimeStamp";
            int n10 = ((String)object).equals(object4);
            if (n10 != 0) {
                int n14;
                n10 = 5;
                float f6 = 7.0E-45f;
                int n15 = ((uE0$c)object2).a;
                if (n15 != n10) {
                    n10 = 10;
                    f6 = 1.4E-44f;
                    if (n15 != n10) {
                        return null;
                    }
                }
                object = this.f;
                if ((object = (uE0$e[])((uE0$c)object2).g((ByteOrder)object)) != null && (n14 = ((Object)object).length) == n7) {
                    object2 = object[0];
                    f5 = ((uE0$e)object2).a;
                    float f7 = ((uE0$e)object2).b;
                    object2 = (int)(f5 / f7);
                    object3 = object[n4];
                    float f8 = ((uE0$e)object3).a;
                    f5 = ((uE0$e)object3).b;
                    object3 = (int)(f8 / f5);
                    object = object[n3];
                    f8 = ((uE0$e)object).a;
                    f6 = ((uE0$e)object).b;
                    object = (int)(f8 / f6);
                    Object[] objectArray = new Object[n7];
                    objectArray[0] = object2;
                    objectArray[n4] = object3;
                    objectArray[n3] = object;
                    return String.format("%02d:%02d:%02d", objectArray);
                }
                Arrays.toString((Object[])object);
                return null;
            }
            try {
                object = this.f;
            }
            catch (NumberFormatException numberFormatException) {}
            double d2 = ((uE0$c)object2).d((ByteOrder)object);
            return Double.toString(d2);
        }
        return null;
    }

    public final int c() {
        ByteOrder byteOrder;
        uE0$c uE0$c = this.d("Orientation");
        int n3 = 1;
        if (uE0$c == null) {
            return n3;
        }
        try {
            byteOrder = this.f;
        }
        catch (NumberFormatException numberFormatException) {
            return n3;
        }
        return uE0$c.e(byteOrder);
    }

    public final uE0$c d(String string2) {
        Object object;
        int n3;
        String string3 = "ISOSpeedRatings";
        int n4 = string3.equals(string2);
        if (n4 != 0) {
            string2 = "PhotographicSensitivity";
        }
        string3 = null;
        for (n4 = 0; n4 < (n3 = ((uE0$d[][])(object = H)).length); ++n4) {
            object = (uE0$c)this.d[n4].get(string2);
            if (object == null) continue;
            return object;
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(uE0$f object) {
        Throwable throwable222222;
        MediaMetadataRetriever mediaMetadataRetriever;
        Object object2;
        block15: {
            Object object3;
            Object object4;
            int n3;
            object2 = "yes";
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 28;
            if (n4 < n7) {
                object = new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
                throw object;
            }
            mediaMetadataRetriever = new MediaMetadataRetriever();
            Object object5 = new uE0$a((uE0$f)object);
            xE0$b.a(mediaMetadataRetriever, object5);
            n7 = 33;
            object5 = mediaMetadataRetriever.extractMetadata(n7);
            int n8 = 34;
            String string2 = mediaMetadataRetriever.extractMetadata(n8);
            int n10 = 26;
            Object object6 = mediaMetadataRetriever.extractMetadata(n10);
            int n14 = 17;
            Object object7 = mediaMetadataRetriever.extractMetadata(n14);
            n10 = (int)(((String)object2).equals(object6) ? 1 : 0);
            if (n10 != 0) {
                n3 = 29;
                object2 = mediaMetadataRetriever.extractMetadata(n3);
                n10 = 30;
                object6 = mediaMetadataRetriever.extractMetadata(n10);
                n14 = 31;
                object7 = mediaMetadataRetriever.extractMetadata(n14);
            } else {
                n3 = (int)(((String)object2).equals(object7) ? 1 : 0);
                if (n3 != 0) {
                    n3 = 18;
                    object2 = mediaMetadataRetriever.extractMetadata(n3);
                    n10 = 19;
                    object6 = mediaMetadataRetriever.extractMetadata(n10);
                    n14 = 24;
                    object7 = mediaMetadataRetriever.extractMetadata(n14);
                } else {
                    n3 = 0;
                    object2 = null;
                    n10 = 0;
                    object6 = null;
                    n14 = 0;
                    object7 = null;
                }
            }
            Object object8 = this.d;
            if (object2 != null) {
                object4 = object8[0];
                object3 = "ImageWidth";
                n3 = Integer.parseInt((String)object2);
                ByteOrder byteOrder = this.f;
                object2 = uE0$c.c(n3, byteOrder);
                ((HashMap)object4).put(object3, object2);
            }
            if (object6 != null) {
                object2 = object8[0];
                object4 = "ImageLength";
                n10 = Integer.parseInt((String)object6);
                object3 = this.f;
                object6 = uE0$c.c(n10, (ByteOrder)object3);
                ((HashMap)object2).put(object4, object6);
            }
            n3 = 6;
            if (object7 != null) {
                n10 = Integer.parseInt((String)object7);
                n10 = n10 != (n14 = 90) ? (n10 != (n14 = 180) ? (n10 != (n14 = 270) ? 1 : 8) : 3) : 6;
                object7 = object8[0];
                object8 = "Orientation";
                object4 = this.f;
                object6 = uE0$c.c(n10, (ByteOrder)object4);
                ((HashMap)object7).put(object8, object6);
            }
            if (object5 == null || string2 == null) break block15;
            n7 = Integer.parseInt((String)object5);
            n8 = Integer.parseInt(string2);
            if (n8 <= n3) {
                object2 = "Invalid exif length";
                object = new IOException((String)object2);
                throw object;
            }
            long l2 = n7;
            ((uE0$f)object).b(l2);
            object6 = new byte[n3];
            ((uE0$b)object).readFully((byte[])object6);
            n7 += n3;
            n8 += -6;
            object2 = O;
            n3 = (int)(Arrays.equals((byte[])object6, (byte[])object2) ? 1 : 0);
            if (n3 == 0) {
                object2 = "Invalid identifier";
                object = new IOException((String)object2);
                throw object;
            }
            object2 = new byte[n8];
            ((uE0$b)object).readFully((byte[])object2);
            this.h = n7;
            this.s(0, (byte[])object2);
        }
        mediaMetadataRetriever.release();
        return;
        {
            catch (Throwable throwable222222) {
            }
            catch (RuntimeException runtimeException) {}
            {
                object2 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.";
                object = new UnsupportedOperationException((String)object2);
                throw object;
            }
        }
        mediaMetadataRetriever.release();
        throw throwable222222;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void f(uE0$b var1_1, int var2_2, int var3_3) {
        block26: {
            block27: {
                var4_4 = this;
                var5_5 = var1_1;
                var6_6 = var3_3;
                var7_7 = ue0_0.l;
                if (var7_7) {
                    Objects.toString(var1_1);
                }
                var8_8 = ByteOrder.BIG_ENDIAN;
                var5_5.c = var8_8;
                var9_9 /* !! */  = var1_1.readByte();
                var10_10 = "Invalid marker: ";
                var11_11 = -1;
                if (var9_9 /* !! */  != var11_11) break block26;
                var12_12 = var1_1.readByte();
                if (var12_12 != (var13_13 = -40)) break block27;
                var9_9 /* !! */  = 2;
                var14_14 = 2;
                while ((var12_12 = var1_1.readByte()) == var11_11) {
                    block28: {
                        block29: {
                            block24: {
                                block25: {
                                    block30: {
                                        block31: {
                                            var12_12 = var1_1.readByte();
                                            if (var7_7) {
                                                var13_13 = var12_12 & 255;
                                                Integer.toHexString(var13_13);
                                            }
                                            if (var12_12 == (var13_13 = -39) || var12_12 == (var13_13 = -38)) break block28;
                                            var13_13 = var1_1.readUnsignedShort();
                                            var15_15 = var13_13 + -2;
                                            var16_16 = 4;
                                            var14_14 += var16_16;
                                            if (var7_7) {
                                                var17_17 = var12_12 & 255;
                                                Integer.toHexString(var17_17);
                                            }
                                            var18_18 = "Invalid length";
                                            if (var15_15 < 0) break block29;
                                            var19_19 = 0;
                                            var20_20 = null;
                                            var21_21 /* !! */  = -31;
                                            var22_22 = var4_4.d;
                                            if (var12_12 == var21_21 /* !! */ ) break block30;
                                            var21_21 /* !! */  = -2;
                                            var23_23 /* !! */  = 1;
                                            if (var12_12 == var21_21 /* !! */ ) break block31;
                                            block0 : switch (var12_12) {
                                                default: {
                                                    switch (var12_12) {
                                                        default: {
                                                            switch (var12_12) {
                                                                default: {
                                                                    switch (var12_12) {
                                                                        default: {
                                                                            break block0;
                                                                        }
                                                                        case -51: 
                                                                        case -50: 
                                                                        case -49: 
                                                                    }
                                                                }
                                                                case -55: 
                                                                case -54: 
                                                                case -53: 
                                                            }
                                                        }
                                                        case -59: 
                                                        case -58: 
                                                        case -57: 
                                                    }
                                                }
                                                case -64: 
                                                case -63: 
                                                case -62: 
                                                case -61: {
                                                    var5_5.a(var23_23 /* !! */ );
                                                    var24_24 = var22_22[var6_6];
                                                    var25_25 = var6_6 != var16_16 ? "ImageLength" : "ThumbnailImageLength";
                                                    var19_19 = var1_1.readUnsignedShort();
                                                    var26_26 = var19_19;
                                                    var28_27 = var4_4.f;
                                                    var20_20 = uE0$c.a(var26_26, var28_27);
                                                    var24_24.put(var25_25, var20_20);
                                                    var24_24 = var22_22[var6_6];
                                                    var25_25 = var6_6 != var16_16 ? "ImageWidth" : "ThumbnailImageWidth";
                                                    var16_16 = var1_1.readUnsignedShort();
                                                    var26_26 = var16_16;
                                                    var29_28 = var4_4.f;
                                                    var29_28 = uE0$c.a(var26_26, (ByteOrder)var29_28);
                                                    var24_24.put(var25_25, var29_28);
                                                    var15_15 = var13_13 + -7;
                                                    break;
                                                }
                                            }
                                            break block24;
                                        }
                                        var24_24 = new byte[var15_15];
                                        var5_5.readFully((byte[])var24_24);
                                        var30_29 = "UserComment";
                                        var25_25 = var4_4.b(var30_29);
                                        if (var25_25 == null) {
                                            var25_25 = var22_22[var23_23 /* !! */ ];
                                            var29_28 = new String;
                                            var31_30 = ue0_0.N;
                                            var29_28((byte[])var24_24, var31_30);
                                            var24_24 = var29_28.concat("\u0000").getBytes(var31_30);
                                            var21_21 /* !! */  = ((byte[])var24_24).length;
                                            var29_28 = new uE0$c(var9_9 /* !! */ , (byte[])var24_24, var21_21 /* !! */ );
                                            var25_25.put(var30_29, var29_28);
                                        }
lbl91:
                                        // 4 sources

                                        while (true) {
                                            var15_15 = 0;
                                            var25_25 = null;
                                            break block24;
                                            break;
                                        }
                                    }
                                    var24_24 = new byte[var15_15];
                                    var5_5.readFully((byte[])var24_24);
                                    var13_13 = var14_14 + var15_15;
                                    var29_28 = ue0_0.O;
                                    if (var29_28 == null || var15_15 < (var21_21 /* !! */  = ((byte[])var29_28).length)) ** GOTO lbl106
                                    var31_30 = null;
                                    for (var21_21 /* !! */  = 0; var21_21 /* !! */  < (var23_23 /* !! */  = ((byte[])var29_28).length); ++var21_21 /* !! */ ) {
                                        block32: {
                                            var23_23 /* !! */  = var24_24[var21_21 /* !! */ ];
                                            var9_9 /* !! */  = (int)var29_28[var21_21 /* !! */ ];
                                            if (var23_23 /* !! */  == var9_9 /* !! */ ) break block32;
lbl106:
                                            // 2 sources

                                            if ((var8_8 = (Object)ue0_0.P) == null || var15_15 < (var16_16 = ((Object)var8_8).length)) break block25;
                                            var29_28 = null;
                                            for (var16_16 = 0; var16_16 < (var21_21 /* !! */  = ((Object)var8_8).length); ++var16_16) {
                                                var21_21 /* !! */  = (int)var24_24[var16_16];
                                                var23_23 /* !! */  = (int)var8_8[var16_16];
                                                if (var21_21 /* !! */  == var23_23 /* !! */ ) {
                                                    continue;
                                                }
                                                break block25;
                                            }
                                            var16_16 = ((Object)var8_8).length;
                                            var14_14 += var16_16;
                                            var9_9 /* !! */  = ((Object)var8_8).length;
                                            var8_8 = Arrays.copyOfRange((byte[])var24_24, var9_9 /* !! */ , var15_15);
                                            var24_24 = "Xmp";
                                            var25_25 = var4_4.b((String)var24_24);
                                            if (var25_25 == null) {
                                                var25_25 = var22_22[0];
                                                var21_21 /* !! */  = ((Object)var8_8).length;
                                                var32_31 = var14_14;
                                                var34_32 = 1;
                                                var29_28 = new uE0$c(var32_31, (byte[])var8_8, var34_32, var21_21 /* !! */ );
                                                var25_25.put(var24_24, var29_28);
                                            }
                                            break block25;
                                        }
                                        var9_9 /* !! */  = 2;
                                    }
                                    var9_9 /* !! */  = ((byte[])var29_28).length;
                                    var8_8 = Arrays.copyOfRange((byte[])var24_24, var9_9 /* !! */ , var15_15);
                                    var14_14 = var2_2 + var14_14;
                                    var12_12 = ((Object)var29_28).length;
                                    var4_4.h = var14_14 += var12_12;
                                    var4_4.s(var6_6, (byte[])var8_8);
                                    var10_10 = new uE0$b((byte[])var8_8);
                                    var4_4.v((uE0$b)var10_10);
                                }
                                var14_14 = var13_13;
                                ** continue;
                            }
                            if (var15_15 >= 0) {
                                var5_5.a(var15_15);
                                var14_14 += var15_15;
                                var9_9 /* !! */  = 2;
                                continue;
                            }
                            var5_5 = new IOException(var18_18);
                            throw var5_5;
                        }
                        var5_5 = new IOException(var18_18);
                        throw var5_5;
                    }
                    var5_5.c = var35_33 = var4_4.f;
                    return;
                }
                var35_34 /* !! */  = new StringBuilder("Invalid marker:");
                var36_37 = Integer.toHexString(var12_12 & 255);
                var35_34 /* !! */ .append(var36_37);
                var35_34 /* !! */  = var35_34 /* !! */ .toString();
                var5_5 = new IOException((String)var35_34 /* !! */ );
                throw var5_5;
            }
            var35_35 /* !! */  = new StringBuilder((String)var10_10);
            var36_38 = Integer.toHexString(var9_9 /* !! */  & 255);
            var35_35 /* !! */ .append(var36_38);
            var35_35 /* !! */  = var35_35 /* !! */ .toString();
            var5_5 = new IOException((String)var35_35 /* !! */ );
            throw var5_5;
        }
        var35_36 /* !! */  = new StringBuilder((String)var10_10);
        var36_39 = Integer.toHexString(var9_9 /* !! */  & 255);
        var35_36 /* !! */ .append(var36_39);
        var35_36 /* !! */  = var35_36 /* !! */ .toString();
        var5_5 = new IOException((String)var35_36 /* !! */ );
        throw var5_5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int g(BufferedInputStream var1_1) {
        block63: {
            block67: {
                block62: {
                    block61: {
                        block59: {
                            block50: {
                                var2_2 = this;
                                var3_3 = var1_1;
                                var4_13 = 5000;
                                var1_1.mark(var4_13);
                                var5_14 = new byte[var4_13];
                                var1_1.read(var5_14);
                                var1_1.reset();
                                var6_15 = 0;
                                var3_3 = null;
                                var7_16 = 0;
                                var8_17 /* !! */  = null;
                                while (true) {
                                    var9_18 /* !! */  = ue0_0.q;
                                    var10_19 = var9_18 /* !! */ .length;
                                    var11_20 = 4;
                                    if (var7_16 >= var10_19) {
                                        return var11_20;
                                    }
                                    var10_19 = var5_14[var7_16];
                                    var12_21 = var9_18 /* !! */ [var7_16];
                                    if (var10_19 != var12_21) break;
                                    ++var7_16;
                                }
                                var9_18 /* !! */  = (byte[])Charset.defaultCharset();
                                var8_17 /* !! */  = "FUJIFILMCCD-RAW".getBytes((Charset)var9_18 /* !! */ );
                                var12_21 = 0;
                                var9_18 /* !! */  = null;
                                while (true) {
                                    block64: {
                                        block52: {
                                            block51: {
                                                if (var12_21 >= (var10_19 = var8_17 /* !! */ .length)) {
                                                    return 9;
                                                }
                                                var10_19 = var5_14[var12_21];
                                                var13_22 = var8_17 /* !! */ [var12_21];
                                                if (var10_19 == var13_22) break block64;
                                                var14_23 = new uE0$b(var5_14);
                                                var13_22 = var14_23.readInt();
                                                var15_24 = var13_22;
                                                var17_25 = new byte[var11_20];
                                                var14_23.readFully(var17_25);
                                                var18_26 = ue0_0.r;
                                                var19_27 = Arrays.equals(var17_25, var18_26);
                                                if (!var19_27) break;
                                                var20_28 = 8;
                                                var22_29 = 1L;
                                                cfr_temp_0 = var15_24 - var22_29;
                                                var24_30 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                if (var24_30 /* !! */  == false) {
                                                    var15_24 = var14_23.readLong();
                                                    var25_31 = 16;
                                                    var27_32 = var15_24 == var25_31 ? 0 : (var15_24 < var25_31 ? -1 : 1);
                                                    if (var27_32 < 0) {
                                                        break;
                                                    }
                                                } else {
                                                    var25_31 = var20_28;
                                                }
                                                if ((var4_13 = (int)((cfr_temp_1 = var15_24 - (var28_33 = (long)var4_13)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) > 0) {
                                                    var15_24 = var28_33;
                                                }
                                                if ((var4_13 = (int)((cfr_temp_2 = (var15_24 -= var25_31) - var20_28) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) < 0) break;
                                                try {
                                                    var30_34 = new byte[var11_20];
                                                    var28_33 = 0L;
                                                    var19_27 = false;
                                                    var17_25 = null;
                                                    var31_35 = false;
                                                    var18_26 = null;
                                                    break block50;
                                                }
                                                catch (Throwable var3_4) {
                                                    var9_18 /* !! */  = (byte[])var14_23;
                                                    break block51;
                                                }
                                                catch (Exception v0) {
                                                    break block52;
                                                }
                                                catch (Throwable var3_5) {
                                                    var12_21 = 0;
                                                    var9_18 /* !! */  = null;
                                                }
                                                catch (Exception v1) {
                                                    var10_19 = 0;
                                                    var14_23 = null;
                                                    break block52;
                                                }
                                            }
                                            if (var9_18 /* !! */  == null) throw var3_6;
                                            var9_18 /* !! */ .close();
                                            throw var3_6;
                                        }
                                        if (var14_23 != null) {
                                            break;
                                        }
                                        ** GOTO lbl95
                                    }
                                    ++var12_21;
                                }
lbl92:
                                // 6 sources

                                while (true) {
                                    block66: {
                                        block58: {
                                            block57: {
                                                block56: {
                                                    block65: {
                                                        block55: {
                                                            block54: {
                                                                block53: {
                                                                    var14_23.close();
lbl95:
                                                                    // 3 sources

                                                                    var30_34 = new uE0$b(var5_14);
                                                                    try {
                                                                        var8_17 /* !! */  = (byte[])ue0_0.r((uE0$b)var30_34);
                                                                        var2_2.f = var8_17 /* !! */ ;
                                                                        var30_34.c = var8_17 /* !! */ ;
                                                                        var7_16 = var30_34.readShort();
                                                                        var12_21 = 20306;
                                                                        if (var7_16 != var12_21 && var7_16 != (var12_21 = 21330)) {
                                                                            var7_16 = 0;
                                                                            var8_17 /* !! */  = null;
                                                                            break block53;
                                                                        }
                                                                        var7_16 = 1;
                                                                    }
                                                                    catch (Throwable var3_7) {
                                                                        var9_18 /* !! */  = var30_34;
                                                                        break block54;
                                                                    }
                                                                    catch (Exception v2) {
                                                                        break block55;
                                                                    }
                                                                }
                                                                var30_34.close();
                                                                break block65;
                                                                catch (Throwable var3_8) {
                                                                    var12_21 = 0;
                                                                    var9_18 /* !! */  = null;
                                                                }
                                                                catch (Exception v3) {
                                                                    var4_13 = 0;
                                                                    var30_34 = null;
                                                                    break block55;
                                                                }
                                                            }
                                                            if (var9_18 /* !! */  == null) throw var3_9;
                                                            var9_18 /* !! */ .close();
                                                            throw var3_9;
                                                        }
                                                        if (var30_34 != null) {
                                                            var30_34.close();
                                                        }
                                                        var7_16 = 0;
                                                        var8_17 /* !! */  = null;
                                                    }
                                                    if (var7_16 != 0) {
                                                        return 7;
                                                    }
                                                    var30_34 = new uE0$b(var5_14);
                                                    try {
                                                        var8_17 /* !! */  = (byte[])ue0_0.r((uE0$b)var30_34);
                                                        var2_2.f = var8_17 /* !! */ ;
                                                        var30_34.c = var8_17 /* !! */ ;
                                                        var7_16 = var30_34.readShort();
                                                        var12_21 = 85;
                                                        if (var7_16 == var12_21) {
                                                            var7_16 = 1;
                                                            break block56;
                                                        }
                                                        var7_16 = 0;
                                                        var8_17 /* !! */  = null;
                                                    }
                                                    catch (Throwable var3_10) {
                                                        var9_18 /* !! */  = var30_34;
                                                        break block57;
                                                    }
                                                    catch (Exception v4) {
                                                        var9_18 /* !! */  = var30_34;
                                                        break block58;
                                                    }
                                                }
                                                var30_34.close();
                                                break block66;
                                                catch (Throwable var3_11) {
                                                    var12_21 = 0;
                                                    var9_18 /* !! */  = null;
                                                }
                                                catch (Exception v5) {
                                                    var12_21 = 0;
                                                    var9_18 /* !! */  = null;
                                                    break block58;
                                                }
                                            }
                                            if (var9_18 /* !! */  == null) throw var3_12;
                                            var9_18 /* !! */ .close();
                                            throw var3_12;
                                        }
                                        if (var9_18 /* !! */  != null) {
                                            var9_18 /* !! */ .close();
                                        }
                                        var7_16 = 0;
                                        var8_17 /* !! */  = null;
                                    }
                                    if (var7_16 != 0) {
                                        return 10;
                                    }
                                    break block59;
                                    break;
                                }
                            }
                            while (true) lbl-1000:
                            // 2 sources

                            {
                                var25_31 = 4;
                                cfr_temp_3 = var28_33 - (var25_31 = var15_24 / var25_31);
                                var32_36 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                if (var32_36 /* !! */  >= 0) ** GOTO lbl92
                                var14_23.readFully((byte[])var30_34);
                                var24_30 /* !! */  = var28_33 == var22_29 ? 0 : (var28_33 < var22_29 ? -1 : 1);
                                if (var24_30 /* !! */  == false) break block60;
                                break;
                            }
                            catch (EOFException v6) {
                                ** continue;
                            }
                            {
                                block60: {
                                    var33_37 = ue0_0.s;
                                    var24_30 /* !! */  = (long)Arrays.equals((byte[])var30_34, var33_37);
                                    if (var24_30 /* !! */  != false) {
                                        var19_27 = true;
                                    } else {
                                        var33_37 = ue0_0.t;
                                        var24_30 /* !! */  = (long)Arrays.equals((byte[])var30_34, var33_37);
                                        if (var24_30 /* !! */  != false) {
                                            var31_35 = true;
                                        }
                                    }
                                    if (var19_27 && var31_35) {
                                        var14_23.close();
                                        return 12;
                                    }
                                }
                                var28_33 += var22_29;
                                ** while (true)
                            }
                        }
                        var4_13 = 0;
                        var30_34 = null;
                        while (var4_13 < (var12_21 = (var8_17 /* !! */  = ue0_0.w).length)) {
                            var12_21 = var5_14[var4_13];
                            var7_16 = var8_17 /* !! */ [var4_13];
                            if (var12_21 == var7_16) {
                                ++var4_13;
                                continue;
                            }
                            break block61;
                        }
                        return 13;
                    }
                    var4_13 = 0;
                    var30_34 = null;
                    if (var4_13 != 0) {
                        return 13;
                    }
                    var30_34 = null;
                    for (var4_13 = 0; var4_13 < (var12_21 = (var8_17 /* !! */  = ue0_0.A).length); ++var4_13) {
                        var12_21 = var5_14[var4_13];
                        var7_16 = var8_17 /* !! */ [var4_13];
                        if (var12_21 == var7_16) {
                            continue;
                        }
                        break block62;
                    }
                    var4_13 = 0;
                    var30_34 = null;
                    break block67;
                }
                while (true) {
                    break block63;
                    break;
                }
            }
            while (var4_13 < (var10_19 = (var9_18 /* !! */  = (byte[])ue0_0.B).length)) {
                var10_19 = var8_17 /* !! */ .length + var4_13 + var11_20;
                if ((var10_19 = var5_14[var10_19]) != (var12_21 = var9_18 /* !! */ [var4_13])) ** continue;
                ++var4_13;
            }
            return 14;
        }
        var7_16 = 0;
        var8_17 /* !! */  = null;
        if (var7_16 == 0) return var6_15;
        return 14;
    }

    public final void h(uE0$f object) {
        this.k((uE0$f)object);
        object = this.d;
        int n3 = 1;
        Object object2 = object[n3];
        Object object3 = "MakerNote";
        object2 = (uE0$c)((HashMap)object2).get(object3);
        if (object2 != null) {
            object2 = ((uE0$c)object2).d;
            object3 = new uE0$f((byte[])object2);
            ((uE0$b)object3).c = object2 = this.f;
            object2 = u;
            int n4 = ((Object)object2).length;
            Object object4 = new byte[n4];
            ((uE0$b)object3).readFully((byte[])object4);
            long l2 = 0L;
            ((uE0$f)object3).b(l2);
            Object object5 = v;
            Object object6 = ((byte[])object5).length;
            Object object7 = new byte[object6];
            ((uE0$b)object3).readFully((byte[])object7);
            Object object8 = Arrays.equals(object4, (byte[])object2);
            if (object8 != 0) {
                long l3 = 8;
                ((uE0$f)object3).b(l3);
            } else {
                object8 = Arrays.equals(object7, (byte[])object5);
                if (object8 != 0) {
                    long l4 = 12;
                    ((uE0$f)object3).b(l4);
                }
            }
            this.t((uE0$f)object3, 6);
            object8 = 7;
            object3 = (uE0$c)object[object8].get("PreviewImageStart");
            object2 = object[object8];
            object4 = "PreviewImageLength";
            object2 = (uE0$c)((HashMap)object2).get(object4);
            if (object3 != null && object2 != null) {
                n4 = 5;
                object5 = object[n4];
                object7 = "JPEGInterchangeFormat";
                ((HashMap)object5).put(object7, object3);
                object3 = object[n4];
                object4 = "JPEGInterchangeFormatLength";
                ((HashMap)object3).put(object4, object2);
            }
            object8 = 8;
            object2 = object[object8];
            object3 = "AspectFrame";
            if ((object2 = (uE0$c)((HashMap)object2).get(object3)) != null) {
                Object object9;
                object3 = this.f;
                if ((object2 = (Object)((int[])((uE0$c)object2).g((ByteOrder)object3))) != null && (object9 = ((Object)object2).length) == (n4 = 4)) {
                    object9 = object2[2];
                    n4 = 0;
                    object4 = null;
                    Object object10 = object2[0];
                    if (object9 > object10 && (object6 = (Object)object2[3]) > (object8 = (Object)object2[n3])) {
                        if ((object9 = object9 - object10 + n3) < (object6 = object6 - object8 + n3)) {
                            object9 += object6;
                            object6 = object9 - object6;
                            object9 -= object6;
                        }
                        Object object11 = this.f;
                        object11 = uE0$c.c(object9, (ByteOrder)object11);
                        object2 = this.f;
                        object2 = uE0$c.c(object6, (ByteOrder)object2);
                        object3 = object[0];
                        object5 = "ImageWidth";
                        ((HashMap)object3).put(object5, object11);
                        object = object[0];
                        object11 = "ImageLength";
                        ((HashMap)object).put(object11, object2);
                    }
                } else {
                    Arrays.toString((int[])object2);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(uE0$b object) {
        int n3 = l;
        if (n3 != 0) {
            Objects.toString(object);
        }
        Object object2 = ByteOrder.BIG_ENDIAN;
        ((uE0$b)object).c = object2;
        object2 = w;
        int n4 = ((Object)object2).length;
        ((uE0$b)object).a(n4);
        n3 = ((Object)object2).length;
        try {
            while (true) {
                Object object3;
                n4 = ((uE0$b)object).readInt();
                int n7 = 4;
                byte[] byArray = new byte[n7];
                ((uE0$b)object).readFully(byArray);
                int n8 = 16;
                if ((n3 += 8) == n8 && (n8 = (int)(Arrays.equals(byArray, object3 = y) ? 1 : 0)) == 0) {
                    object2 = "Encountered invalid PNG file--IHDR chunk should appearas the first chunk";
                    object = new IOException((String)object2);
                    throw object;
                }
                object3 = z;
                n8 = (int)(Arrays.equals(byArray, object3) ? 1 : 0);
                if (n8 != 0) {
                    return;
                }
                object3 = x;
                n8 = (int)(Arrays.equals(byArray, object3) ? 1 : 0);
                if (n8 != 0) {
                    Object object4 = new byte[n4];
                    ((uE0$b)object).readFully((byte[])object4);
                    int n10 = ((uE0$b)object).readInt();
                    object3 = new CRC32;
                    object3();
                    object3.update(byArray);
                    object3.update((byte[])object4);
                    long l2 = object3.getValue();
                    n7 = (int)l2;
                    if (n7 == n10) {
                        this.h = n3;
                        n10 = 0;
                        object = null;
                        this.s(0, (byte[])object4);
                        this.y();
                        object = new uE0$b((byte[])object4);
                        this.v((uE0$b)object);
                        return;
                    }
                    object4 = new StringBuilder;
                    ((StringBuilder)object4)();
                    String string2 = "Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: ";
                    ((StringBuilder)object4).append(string2);
                    ((StringBuilder)object4).append(n10);
                    object = ", calculated CRC value: ";
                    ((StringBuilder)object4).append((String)object);
                    long l3 = object3.getValue();
                    ((StringBuilder)object4).append(l3);
                    object = ((StringBuilder)object4).toString();
                    object2 = new IOException((String)object);
                    throw object2;
                }
                ((uE0$b)object).a(n4 += 4);
                n3 += n4;
            }
        }
        catch (EOFException eOFException) {
            object = new IOException("Encountered corrupt PNG file.");
            throw object;
        }
    }

    public final void j(uE0$b object) {
        int n3 = l;
        if (n3 != 0) {
            Objects.toString(object);
        }
        ((uE0$b)object).a(84);
        n3 = 4;
        byte[] byArray = new byte[n3];
        Object object2 = new byte[n3];
        Object object3 = new byte[n3];
        ((uE0$b)object).readFully(byArray);
        ((uE0$b)object).readFully((byte[])object2);
        ((uE0$b)object).readFully((byte[])object3);
        int n4 = ByteBuffer.wrap(byArray).getInt();
        int n7 = ByteBuffer.wrap(object2).getInt();
        n3 = ByteBuffer.wrap(object3).getInt();
        object2 = new byte[n7];
        int n8 = ((uE0$b)object).b;
        n8 = n4 - n8;
        ((uE0$b)object).a(n8);
        ((uE0$b)object).readFully((byte[])object2);
        uE0$b uE0$b = new uE0$b((byte[])object2);
        this.f(uE0$b, n4, 5);
        n4 = ((uE0$b)object).b;
        ((uE0$b)object).a(n3 -= n4);
        object3 = ByteOrder.BIG_ENDIAN;
        ((uE0$b)object).c = object3;
        n3 = ((uE0$b)object).readInt();
        n4 = 0;
        byArray = null;
        object2 = null;
        for (n7 = 0; n7 < n3; ++n7) {
            n8 = ((uE0$b)object).readUnsignedShort();
            int n10 = ((uE0$b)object).readUnsignedShort();
            uE0$d uE0$d = G;
            int n14 = uE0$d.a;
            if (n8 == n14) {
                n3 = ((uE0$b)object).readShort();
                short s7 = ((uE0$b)object).readShort();
                object2 = this.f;
                object3 = uE0$c.c(n3, (ByteOrder)object2);
                object2 = this.f;
                object = uE0$c.c(s7, (ByteOrder)object2);
                object2 = this.d;
                object2[0].put("ImageLength", object3);
                object2[0].put("ImageWidth", object);
                return;
            }
            ((uE0$b)object).a(n10);
        }
    }

    public final void k(uE0$f object) {
        this.p((uE0$b)object);
        this.t((uE0$f)object, 0);
        this.x((uE0$f)object, 0);
        this.x((uE0$f)object, 5);
        this.x((uE0$f)object, 4);
        this.y();
        int n3 = this.c;
        int n4 = 8;
        if (n3 == n4) {
            object = this.d;
            n4 = 1;
            Object object2 = object[n4];
            Object object3 = "MakerNote";
            if ((object2 = (uE0$c)((HashMap)object2).get(object3)) != null) {
                object2 = ((uE0$c)object2).d;
                object3 = new uE0$f((byte[])object2);
                ((uE0$b)object3).c = object2 = this.f;
                ((uE0$b)object3).a(6);
                int n7 = 9;
                this.t((uE0$f)object3, n7);
                object2 = object[n7];
                object3 = "ColorSpace";
                object2 = (uE0$c)((HashMap)object2).get(object3);
                if (object2 != null) {
                    object = object[n4];
                    ((HashMap)object).put(object3, object2);
                }
            }
        }
    }

    public final void l(uE0$f object) {
        int n3;
        Object object2;
        boolean bl2 = l;
        if (bl2) {
            Objects.toString(object);
        }
        this.k((uE0$f)object);
        object = this.d;
        bl2 = false;
        Object object3 = null;
        Object object4 = object[0];
        Object object5 = "JpgFromRaw";
        object4 = (uE0$c)((HashMap)object4).get(object5);
        if (object4 != null) {
            object2 = ((uE0$c)object4).d;
            object5 = new uE0$b((byte[])object2);
            long l2 = ((uE0$c)object4).c;
            n3 = (int)l2;
            int n4 = 5;
            this.f((uE0$b)object5, n3, n4);
        }
        object3 = object[0];
        object4 = "ISO";
        object3 = (uE0$c)((HashMap)object3).get(object4);
        n3 = 1;
        object5 = object[n3];
        object2 = "PhotographicSensitivity";
        object5 = (uE0$c)((HashMap)object5).get(object2);
        if (object3 != null && object5 == null) {
            object = object[n3];
            ((HashMap)object).put(object2, object3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m(uE0$b object) {
        int n3 = l;
        if (n3 != 0) {
            Objects.toString(object);
        }
        Object object2 = ByteOrder.LITTLE_ENDIAN;
        ((uE0$b)object).c = object2;
        object2 = A;
        n3 = ((Object)object2).length;
        ((uE0$b)object).a(n3);
        n3 = ((uE0$b)object).readInt() + 8;
        byte[] byArray = B;
        int n4 = byArray.length;
        ((uE0$b)object).a(n4);
        int n7 = byArray.length + 8;
        while (true) {
            n4 = 4;
            try {
                byte[] byArray2 = new byte[n4];
                ((uE0$b)object).readFully(byArray2);
                int n8 = ((uE0$b)object).readInt();
                n7 += 8;
                byte[] byArray3 = C;
                n4 = (int)(Arrays.equals(byArray3, byArray2) ? 1 : 0);
                if (n4 != 0) {
                    object2 = new byte[n8];
                    ((uE0$b)object).readFully((byte[])object2);
                    this.h = n7;
                    object = null;
                    this.s(0, (byte[])object2);
                    object = new uE0$b((byte[])object2);
                    this.v((uE0$b)object);
                    return;
                }
                n4 = n8 % 2;
                int n10 = 1;
                if (n4 == n10) {
                    ++n8;
                }
                if ((n7 += n8) == n3) {
                    return;
                }
                if (n7 > n3) {
                    object2 = "Encountered WebP file with invalid chunk size";
                    object = new IOException((String)object2);
                    throw object;
                }
                ((uE0$b)object).a(n8);
                continue;
            }
            catch (EOFException eOFException) {}
            break;
        }
        object = new IOException("Encountered corrupt WebP file.");
        throw object;
    }

    public final void n(uE0$b uE0$b, HashMap object) {
        uE0$c uE0$c = (uE0$c)((HashMap)object).get("JPEGInterchangeFormat");
        Object object2 = "JPEGInterchangeFormatLength";
        object = (uE0$c)((HashMap)object).get(object2);
        if (uE0$c != null && object != null) {
            object2 = this.f;
            int n3 = uE0$c.e((ByteOrder)object2);
            object2 = this.f;
            int n4 = ((uE0$c)object).e((ByteOrder)object2);
            int n7 = this.c;
            int n8 = 7;
            if (n7 == n8) {
                n7 = this.i;
                n3 += n7;
            }
            if (n3 > 0 && n4 > 0 && (object2 = this.b) == null && (object2 = this.a) == null) {
                object = new byte[n4];
                uE0$b.a(n3);
                uE0$b.readFully((byte[])object);
            }
        }
    }

    public final boolean o(HashMap object) {
        uE0$c uE0$c = (uE0$c)((HashMap)object).get("ImageLength");
        Object object2 = "ImageWidth";
        object = (uE0$c)((HashMap)object).get(object2);
        if (uE0$c != null && object != null) {
            object2 = this.f;
            int n3 = uE0$c.e((ByteOrder)object2);
            object2 = this.f;
            int n4 = ((uE0$c)object).e((ByteOrder)object2);
            int n7 = 512;
            if (n3 <= n7 && n4 <= n7) {
                return true;
            }
        }
        return false;
    }

    public final void p(uE0$b object) {
        Object object2 = ue0_0.r((uE0$b)object);
        this.f = object2;
        ((uE0$b)object).c = object2;
        int n3 = ((uE0$b)object).readUnsignedShort();
        int n4 = this.c;
        int n7 = 7;
        if (n4 != n7 && n4 != (n7 = 10) && n3 != (n4 = 42)) {
            StringBuilder stringBuilder = new StringBuilder("Invalid start code: ");
            object2 = Integer.toHexString(n3);
            stringBuilder.append((String)object2);
            object2 = stringBuilder.toString();
            object = new IOException((String)object2);
            throw object;
        }
        n3 = ((uE0$b)object).readInt();
        if (n3 >= (n4 = 8)) {
            if ((n3 += -8) > 0) {
                ((uE0$b)object).a(n3);
            }
            return;
        }
        object2 = hj0_0.a(n3, "Invalid first Ifd offset: ");
        object = new IOException((String)object2);
        throw object;
    }

    public final void q() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((HashMap[])(object = this.d)).length); ++i3) {
            Object object2 = object[i3];
            ((HashMap)object2).size();
            object = object[i3].entrySet().iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (Map.Entry)object.next();
                uE0$c uE0$c = (uE0$c)object2.getValue();
                object2 = (String)object2.getKey();
                uE0$c.toString();
                object2 = this.f;
                uE0$c.f((ByteOrder)object2);
            }
        }
    }

    public final void s(int n3, byte[] byArray) {
        uE0$f uE0$f = new uE0$f(byArray);
        this.p(uE0$f);
        this.t(uE0$f, n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void t(uE0$f var1_1, int var2_2) {
        var3_3 = this;
        var4_4 = var1_1;
        var5_5 = var2_2;
        var6_6 = 5;
        var7_7 = Integer.valueOf(var1_1.b);
        var8_8 = this.e;
        var8_8.add(var7_7);
        var9_9 = var1_1.readShort();
        if (var9_9 <= 0) {
            return;
        }
        var10_10 = 0;
        var11_11 = null;
        while (true) {
            block37: {
                block49: {
                    block48: {
                        block47: {
                            block42: {
                                block36: {
                                    block43: {
                                        block44: {
                                            block45: {
                                                block46: {
                                                    block41: {
                                                        block40: {
                                                            block39: {
                                                                block38: {
                                                                    block35: {
                                                                        var12_12 = ue0_0.l;
                                                                        var13_13 = var3_3.d;
                                                                        if (var10_10 >= var9_9) break;
                                                                        var14_14 = var1_1.readUnsignedShort();
                                                                        var15_15 = var1_1.readUnsignedShort();
                                                                        var16_16 = var1_1.readInt();
                                                                        var17_17 = var4_4.b;
                                                                        var18_18 = var17_17;
                                                                        var20_19 = 4;
                                                                        var18_18 += var20_19;
                                                                        var22_20 = ue0_0.J[var5_5];
                                                                        var23_21 /* !! */  = var14_14;
                                                                        var22_20 = (uE0$d)var22_20.get(var23_21 /* !! */ );
                                                                        if (var12_12) {
                                                                            var23_21 /* !! */  = var2_2;
                                                                            var24_22 = var14_14;
                                                                            if (var22_20 != null) {
                                                                                var25_23 = var22_20.b;
                                                                            } else {
                                                                                var26_24 = 0;
                                                                                var25_23 = null;
                                                                            }
                                                                            var27_25 /* !! */  = Integer.valueOf(var15_15);
                                                                            var28_26 = var16_16;
                                                                            var29_27 = var9_9;
                                                                            var7_7 = new Object[var6_6];
                                                                            var7_7[0] = var23_21 /* !! */ ;
                                                                            var7_7[1] = var24_22;
                                                                            var30_28 = 2;
                                                                            var7_7[var30_28] = var25_23;
                                                                            var7_7[3] = var27_25 /* !! */ ;
                                                                            var26_24 = 4;
                                                                            var7_7[var26_24] = var28_26;
                                                                            var25_23 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d";
                                                                            String.format((String)var25_23, (Object[])var7_7);
                                                                        } else {
                                                                            var29_27 = var9_9;
                                                                        }
                                                                        var9_9 = 7;
                                                                        if (var22_20 == null) lbl-1000:
                                                                        // 4 sources

                                                                        {
                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if (var15_15 <= 0 || var15_15 >= (var30_28 = ((int[])(var32_30 = ue0_0.E)).length)) ** GOTO lbl-1000
                                                                        var30_28 = var22_20.c;
                                                                        if (var30_28 == var9_9 || var15_15 == var9_9 || var30_28 == var15_15 || (var9_9 = var22_20.d) == var15_15) ** GOTO lbl-1000
                                                                        var26_24 = 4;
                                                                        if (var30_28 != var26_24 && var9_9 != var26_24) ** GOTO lbl-1000
                                                                        var26_24 = 3;
                                                                        if (var15_15 != var26_24) lbl-1000:
                                                                        // 2 sources

                                                                        {
                                                                            var26_24 = 9;
                                                                        } else lbl-1000:
                                                                        // 3 sources

                                                                        {
                                                                            while (true) {
                                                                                break block35;
                                                                                break;
                                                                            }
                                                                        }
                                                                        if ((var30_28 == var26_24 || var9_9 == var26_24) && var15_15 == (var26_24 = (long)8) || (var30_28 == (var26_24 = (long)12) || var9_9 == var26_24) && var15_15 == (var26_24 = (long)11)) ** continue;
                                                                        if (!var12_12) ** GOTO lbl-1000
                                                                        var32_30 = ue0_0.D[var15_15];
                                                                        ** continue;
                                                                    }
                                                                    var26_24 = 7;
                                                                    if (var15_15 == var26_24) {
                                                                        var15_15 = var30_28;
                                                                    }
                                                                    var33_31 = var16_16;
                                                                    var6_6 = var32_30[var15_15];
                                                                    var31_29 = var8_8;
                                                                    var35_32 = var6_6;
                                                                    cfr_temp_0 = (var33_31 *= var35_32) - (var35_32 = 0L);
                                                                    var6_6 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                                                    if (var6_6 >= 0 && (var6_6 = (int)((cfr_temp_1 = var33_31 - (var35_32 = 0x7FFFFFFFL)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) <= 0) {
                                                                        var6_6 = 1;
                                                                    } else {
                                                                        var6_6 = 0;
                                                                        var32_30 = null;
                                                                    }
                                                                    break block38;
                                                                    var31_29 = var8_8;
                                                                    var6_6 = 0;
                                                                    var32_30 = null;
                                                                    var33_31 = 0L;
                                                                }
                                                                if (var6_6 != 0) break block39;
                                                                var4_4.b(var18_18);
                                                                var37_33 = var10_10;
                                                                var23_21 /* !! */  = var31_29;
                                                                var5_5 = 3;
                                                                var38_34 = 1;
                                                                var26_24 = 2;
                                                                break block37;
                                                            }
                                                            var32_30 = "Compression";
                                                            var9_9 = (int)(var33_31 == var20_19 ? 0 : (var33_31 < var20_19 ? -1 : 1));
                                                            if (var9_9 <= 0) break block40;
                                                            var9_9 = var1_1.readInt();
                                                            var39_35 = var3_3.c;
                                                            var37_33 = var10_10;
                                                            var10_10 = 7;
                                                            if (var39_35 != var10_10) ** GOTO lbl114
                                                            var11_11 = "MakerNote";
                                                            var8_8 = var22_20.b;
                                                            var39_35 = (int)var11_11.equals(var8_8);
                                                            if (var39_35 != 0) {
                                                                var3_3.i = var9_9;
lbl114:
                                                                // 3 sources

                                                                while (true) {
                                                                    var40_36 = var18_18;
                                                                    var20_19 = var33_31;
                                                                    break;
                                                                }
                                                            } else {
                                                                if (var5_5 != (var39_35 = 6) || (var39_35 = (int)(var11_11 = "ThumbnailImage").equals(var8_8 = var22_20.b)) == 0) ** continue;
                                                                var3_3.j = var9_9;
                                                                var3_3.k = var16_16;
                                                                var8_8 = var3_3.f;
                                                                var8_8 = uE0$c.c(6, (ByteOrder)var8_8);
                                                                var10_10 = var3_3.j;
                                                                var20_19 = var33_31;
                                                                var33_31 = var10_10;
                                                                var11_11 = var3_3.f;
                                                                var25_23 = uE0$c.a(var33_31, (ByteOrder)var11_11);
                                                                var30_28 = var3_3.k;
                                                                var40_36 = var18_18;
                                                                var42_37 = var30_28;
                                                                var44_38 = var3_3.f;
                                                                var45_39 = uE0$c.a(var42_37, (ByteOrder)var44_38);
                                                                var38_34 = 4;
                                                                var13_13[var38_34].put(var32_30, var8_8);
                                                                var44_38 = var13_13[var38_34];
                                                                var23_21 /* !! */  = "JPEGInterchangeFormat";
                                                                var44_38.put(var23_21 /* !! */ , var25_23);
                                                                var44_38 = var13_13[var38_34];
                                                                var46_40 = "JPEGInterchangeFormatLength";
                                                                var44_38.put(var46_40, var45_39);
                                                            }
                                                            var42_37 = var9_9;
                                                            var4_4.b(var42_37);
                                                            break block41;
                                                        }
                                                        var40_36 = var18_18;
                                                        var20_19 = var33_31;
                                                        var37_33 = var10_10;
                                                    }
                                                    var45_39 = ue0_0.M;
                                                    var46_40 = var14_14;
                                                    var45_39 = (Integer)var45_39.get(var46_40);
                                                    if (var45_39 == null) break block42;
                                                    var38_34 = 3;
                                                    if (var15_15 == var38_34) break block43;
                                                    var38_34 = 4;
                                                    if (var15_15 == var38_34) break block44;
                                                    var38_34 = 8;
                                                    if (var15_15 == var38_34) break block45;
                                                    var38_34 = 9;
                                                    if (var15_15 == var38_34 || var15_15 == (var38_34 = 13)) break block46;
                                                    var18_18 = -1;
                                                    break block36;
                                                }
                                                var38_34 = var1_1.readInt();
lbl168:
                                                // 3 sources

                                                while (true) {
                                                    var18_18 = var38_34;
                                                    break block36;
                                                    break;
                                                }
                                            }
                                            var38_34 = var1_1.readShort();
                                            ** GOTO lbl168
                                        }
                                        var38_34 = var1_1.readInt();
                                        var18_18 = var38_34;
                                        var33_31 = 0xFFFFFFFFL;
                                        var18_18 &= var33_31;
                                        break block36;
                                    }
                                    var38_34 = var1_1.readUnsignedShort();
                                    ** continue;
                                }
                                if (var12_12) {
                                    var32_30 = var18_18;
                                    var22_20 = var22_20.b;
                                    var26_24 = 2;
                                    var23_21 /* !! */  = new Object[var26_24];
                                    var9_9 = 0;
                                    var7_7 = null;
                                    var23_21 /* !! */ [0] = var32_30;
                                    var6_6 = 1;
                                    var23_21 /* !! */ [var6_6] = var22_20;
                                    var32_30 = "Offset: %d, tagName: %s";
                                    String.format((String)var32_30, var23_21 /* !! */ );
lbl197:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var26_24 = 2;
                                ** continue;
                                var47_41 = 0L;
                                var30_28 = (int)(var18_18 == var47_41 ? 0 : (var18_18 < var47_41 ? -1 : 1));
                                if (var30_28 <= 0 || (var6_6 = var4_4.e) != (var17_17 = -1) && (var30_28 = (int)((cfr_temp_2 = var18_18 - (var47_41 = (long)var6_6)) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) >= 0) {
                                    var23_21 /* !! */  = var31_29;
                                } else {
                                    var32_30 = (int)var18_18;
                                    var23_21 /* !! */  = var31_29;
                                    var6_6 = (int)var31_29.contains(var32_30);
                                    if (var6_6 == 0) {
                                        var4_4.b(var18_18);
                                        var5_5 = var45_39.intValue();
                                        var3_3.t(var4_4, var5_5);
                                    }
                                }
                                var18_18 = var40_36;
                                var4_4.b(var40_36);
                                var5_5 = 3;
lbl216:
                                // 3 sources

                                while (true) {
                                    var38_34 = 1;
                                    break block37;
                                    break;
                                }
                            }
                            var23_21 /* !! */  = var31_29;
                            var18_18 = var40_36;
                            var26_24 = 2;
                            var5_5 = var4_4.b;
                            var9_9 = var3_3.h;
                            var35_32 = var20_19;
                            var39_35 = (int)var20_19;
                            var7_7 = new byte[var39_35];
                            var4_4.readFully((byte[])var7_7);
                            var49_42 = var5_5 += var9_9;
                            var27_25 /* !! */  = var7_7;
                            var8_8 = new uE0$c(var49_42, (byte[])var7_7, var15_15, var16_16);
                            var45_39 = var13_13[var2_2];
                            var7_7 = var22_20.b;
                            var45_39.put(var7_7, var8_8);
                            var45_39 = "DNGVersion";
                            var22_20 = var22_20.b;
                            var5_5 = (int)var45_39.equals(var22_20);
                            if (var5_5 != 0) {
                                var3_3.c = var5_5 = 3;
                            } else {
                                var5_5 = 3;
                            }
                            var7_7 = "Make";
                            var9_9 = (int)var7_7.equals(var22_20);
                            if (var9_9 == 0 && (var9_9 = (int)(var7_7 = "Model").equals(var22_20)) == 0) break block47;
                            var7_7 = var3_3.f;
                            var9_9 = (int)(var7_7 = var8_8.f((ByteOrder)var7_7)).contains((CharSequence)(var11_11 = "PENTAX"));
                            if (var9_9 != 0) break block48;
                        }
                        if ((var6_6 = (int)var32_30.equals(var22_20)) == 0 || (var6_6 = var8_8.e((ByteOrder)(var32_30 = var3_3.f))) != (var17_17 = (int)((char)-1))) break block49;
                    }
                    var3_3.c = var6_6 = 8;
                }
                if ((var9_9 = (int)((cfr_temp_3 = (var47_41 = (long)(var6_6 = var4_4.b)) - var18_18) == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1))) == 0) ** GOTO lbl216
                var4_4.b(var18_18);
                ** continue;
            }
            var10_10 = (short)(var37_33 + 1);
            var5_5 = var2_2;
            var8_8 = var23_21 /* !! */ ;
            var9_9 = var29_27;
            var6_6 = 5;
        }
        var23_21 /* !! */  = var8_8;
        var38_34 = 1;
        var5_5 = var1_1.readInt();
        if (var12_12) {
            var44_38 = var5_5;
            var46_40 = new Object[var38_34];
            var6_6 = 0;
            var32_30 = null;
            var46_40[0] = var44_38;
            var44_38 = "nextIfdOffset: %d";
            String.format((String)var44_38, (Object[])var46_40);
        }
        if ((var26_24 = (cfr_temp_4 = (var18_18 = (long)var5_5) - (var47_41 = 0L)) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1)) > 0 && (var5_5 = (int)var23_21 /* !! */ .contains(var45_39 = Integer.valueOf(var5_5))) == 0) {
            var4_4.b(var18_18);
            var5_5 = 4;
            var46_40 = var13_13[var5_5];
            var38_34 = (int)var46_40.isEmpty();
            if (var38_34 != 0) {
                var3_3.t(var4_4, var5_5);
            } else {
                var5_5 = 5;
                var46_40 = var13_13[var5_5];
                var38_34 = (int)var46_40.isEmpty();
                if (var38_34 != 0) {
                    var3_3.t(var4_4, var5_5);
                }
            }
        }
    }

    public final void u(int n3, String string2, String string3) {
        HashMap[] hashMapArray = this.d;
        HashMap hashMap = hashMapArray[n3];
        boolean bl2 = hashMap.isEmpty();
        if (!bl2 && (hashMap = hashMapArray[n3].get(string2)) != null) {
            hashMap = hashMapArray[n3];
            Object v4 = hashMap.get(string2);
            hashMap.put(string3, v4);
            HashMap hashMap2 = hashMapArray[n3];
            hashMap2.remove(string2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v(uE0$b uE0$b) {
        int n16;
        Object object5;
        Object object2;
        uE0$c uE0$c;
        int n10;
        int n4;
        ue0_0 ue0_02 = this;
        uE0$b uE0$b2 = uE0$b;
        HashMap[] hashMapArray = this.d;
        int n3 = 4;
        HashMap hashMap = hashMapArray[n3];
        Object object = (uE0$c)hashMap.get("Compression");
        if (object == null) {
            this.n(uE0$b, hashMap);
            return;
        }
        ByteOrder byteOrder = this.f;
        n3 = ((uE0$c)object).e(byteOrder);
        int n7 = 1;
        int n8 = 6;
        if (n3 != n7) {
            if (n3 == n8) {
                this.n(uE0$b, hashMap);
                return;
            }
            n4 = 7;
            if (n3 != n4) {
                return;
            }
        }
        if ((object = (uE0$c)hashMap.get("BitsPerSample")) == null) return;
        Object object3 = ue0_02.f;
        object3 = o;
        int n14 = Arrays.equals((int[])object3, (int[])(object = (Object)((int[])((uE0$c)object).g((ByteOrder)object3))));
        if (n14 == 0) {
            n14 = ue0_02.c;
            n10 = 3;
            if (n14 != n10) return;
            uE0$c = (uE0$c)hashMap.get("PhotometricInterpretation");
            if (uE0$c == null) return;
            object2 = ue0_02.f;
            n14 = uE0$c.e((ByteOrder)object2);
            if (n14 != n7 || (n10 = (int)(Arrays.equals((int[])object, (int[])(object2 = (Object)p)) ? 1 : 0)) == 0) {
                if (n14 != n8) return;
                n3 = (int)(Arrays.equals((int[])object, (int[])object3) ? 1 : 0);
                if (n3 == 0) return;
            }
        }
        object = (uE0$c)hashMap.get("StripOffsets");
        Object object4 = "StripByteCounts";
        uE0$c uE0$c2 = (uE0$c)hashMap.get(object4);
        if (object == null) return;
        if (uE0$c2 == null) return;
        object4 = ue0_02.f;
        object = xE0.a(((uE0$c)object).g((ByteOrder)object4));
        object4 = ue0_02.f;
        long[] lArray = xE0.a(uE0$c2.g((ByteOrder)object4));
        if (object == null) return;
        n8 = ((Object)object).length;
        if (n8 == 0) {
            return;
        }
        if (lArray == null) return;
        n8 = lArray.length;
        if (n8 == 0) {
            return;
        }
        n8 = ((Object)object).length;
        n4 = lArray.length;
        if (n8 != n4) {
            return;
        }
        n8 = lArray.length;
        n4 = 0;
        object3 = null;
        long l2 = 0L;
        for (n16 = 0; n16 < n8; l2 += object5, ++n16) {
            object5 = lArray[n16];
        }
        n8 = (int)l2;
        object4 = new byte[n8];
        ue0_02.g = n7;
        n14 = 0;
        uE0$c = null;
        n10 = 0;
        object2 = null;
        n16 = 0;
        while (true) {
            int n17;
            Object object6;
            long l3;
            long l4;
            int n15;
            if (n14 >= (n15 = ((Object)object).length)) {
                boolean bl2 = ue0_02.g;
                if (!bl2) return;
                Object cfr_ignored_1 = object[0];
                return;
            }
            object5 = object[n14];
            int n18 = (int)object5;
            long l7 = lArray[n14];
            n15 = (int)l7;
            int n19 = ((Object)object).length - n7;
            if (n14 < n19 && (l4 = (l3 = (l7 = (long)(n19 = n18 + n15)) - (object6 = object[n17 = n14 + 1])) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false) {
                ue0_02.g = false;
            }
            if ((n18 -= n10) < 0) {
                return;
            }
            try {
                uE0$b2.a(n18);
                n10 += n18;
            }
            catch (EOFException eOFException) {
                return;
            }
            byte[] byArray = new byte[n15];
            {
                uE0$b2.readFully(byArray);
                n10 += n15;
            }
            System.arraycopy(byArray, 0, object4, n16, n15);
            n16 += n15;
            ++n14;
        }
    }

    public final void w(int n3, int n4) {
        boolean bl2;
        HashMap[] hashMapArray = this.d;
        Object object = hashMapArray[n3];
        boolean n7 = ((HashMap)object).isEmpty();
        if (!n7 && !(bl2 = ((HashMap)(object = hashMapArray[n4])).isEmpty())) {
            object = hashMapArray[n3];
            Object object2 = "ImageLength";
            object = (uE0$c)((HashMap)object).get(object2);
            Object object3 = hashMapArray[n3];
            Object object4 = "ImageWidth";
            object3 = (uE0$c)((HashMap)object3).get(object4);
            object2 = (uE0$c)hashMapArray[n4].get(object2);
            Object object5 = hashMapArray[n4];
            object4 = (uE0$c)((HashMap)object5).get(object4);
            if (object != null && object3 != null && object2 != null && object4 != null) {
                object5 = this.f;
                int n8 = ((uE0$c)object).e((ByteOrder)object5);
                object5 = this.f;
                int n10 = ((uE0$c)object3).e((ByteOrder)object5);
                object5 = this.f;
                int n14 = ((uE0$c)object2).e((ByteOrder)object5);
                object5 = this.f;
                int n15 = ((uE0$c)object4).e((ByteOrder)object5);
                if (n8 < n14 && n10 < n15) {
                    object = hashMapArray[n3];
                    hashMapArray[n3] = object2 = hashMapArray[n4];
                    hashMapArray[n4] = object;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void x(uE0$f object, int n3) {
        String string2;
        String string3;
        uE0$c uE0$c;
        Object object2;
        uE0$c uE0$c2;
        Object object3;
        Object object4;
        Object object5;
        block10: {
            block11: {
                block9: {
                    int n4;
                    object5 = this.d;
                    object4 = (uE0$c)object5[n3].get("DefaultCropSize");
                    object3 = (uE0$c)object5[n3].get("SensorTopBorder");
                    uE0$c2 = (uE0$c)object5[n3].get("SensorLeftBorder");
                    object2 = (uE0$c)object5[n3].get("SensorBottomBorder");
                    uE0$c = (uE0$c)object5[n3].get("SensorRightBorder");
                    string3 = "ImageLength";
                    string2 = "ImageWidth";
                    if (object4 == null) break block10;
                    int n7 = ((uE0$c)object4).a;
                    int n8 = 5;
                    int n10 = 1;
                    object2 = null;
                    int n14 = 2;
                    if (n7 == n8) {
                        int n15;
                        object = this.f;
                        if ((object = (uE0$e[])((uE0$c)object4).g((ByteOrder)object)) != null && (n15 = ((uE0$e[])object).length) == n14) {
                            object4 = object[0];
                            object3 = this.f;
                            object4 = uE0$c.b((uE0$e)object4, (ByteOrder)object3);
                            object = object[n10];
                            object3 = this.f;
                            object = uE0$c.b((uE0$e)object, (ByteOrder)object3);
                            break block9;
                        } else {
                            Arrays.toString((Object[])object);
                            return;
                        }
                    }
                    object = this.f;
                    if ((object = (Object)((int[])((uE0$c)object4).g((ByteOrder)object))) == null || (n4 = ((Object[])object).length) != n14) break block11;
                    Object object6 = object[0];
                    object3 = this.f;
                    object4 = uE0$c.c((int)object6, (ByteOrder)object3);
                    Object object7 = object[n10];
                    object3 = this.f;
                    object = uE0$c.c((int)object7, (ByteOrder)object3);
                }
                object3 = object5[n3];
                ((HashMap)object3).put(string2, object4);
                Object object8 = object5[n3];
                ((HashMap)object8).put(string3, object);
                return;
            }
            Arrays.toString((int[])object);
            return;
        }
        if (object3 != null && uE0$c2 != null && object2 != null && uE0$c != null) {
            object = this.f;
            int n16 = ((uE0$c)object3).e((ByteOrder)object);
            object4 = this.f;
            int n17 = ((uE0$c)object2).e((ByteOrder)object4);
            object3 = this.f;
            int n18 = uE0$c.e((ByteOrder)object3);
            object2 = this.f;
            int n19 = uE0$c2.e((ByteOrder)object2);
            if (n17 <= n16) return;
            if (n18 <= n19) return;
            int n20 = n17 - n16;
            object = this.f;
            object = uE0$c.c(n20, (ByteOrder)object);
            object4 = this.f;
            object4 = uE0$c.c(n18 -= n19, (ByteOrder)object4);
            object3 = object5[n3];
            ((HashMap)object3).put(string3, object);
            object = object5[n3];
            ((HashMap)object).put(string2, object4);
            return;
        }
        object4 = (uE0$c)object5[n3].get(string3);
        object3 = (uE0$c)object5[n3].get(string2);
        if (object4 != null) {
            if (object3 != null) return;
        }
        object4 = (uE0$c)object5[n3].get("JPEGInterchangeFormat");
        object5 = object5[n3];
        object3 = "JPEGInterchangeFormatLength";
        object5 = (uE0$c)((HashMap)object5).get(object3);
        if (object4 == null) return;
        if (object5 == null) return;
        object5 = this.f;
        int n21 = ((uE0$c)object4).e((ByteOrder)object5);
        object3 = this.f;
        int n22 = ((uE0$c)object4).e((ByteOrder)object3);
        long l2 = n21;
        ((uE0$f)object).b(l2);
        object4 = new byte[n22];
        ((uE0$b)object).readFully((byte[])object4);
        object = new uE0$b((byte[])object4);
        this.f((uE0$b)object, n21, n3);
    }

    public final void y() {
        Object object;
        int n3 = 5;
        this.w(0, n3);
        int n4 = 4;
        this.w(0, n4);
        this.w(n3, n4);
        Object object2 = this.d;
        int n7 = 1;
        Object object3 = (uE0$c)object2[n7].get("PixelXDimension");
        HashMap hashMap = (uE0$c)object2[n7].get("PixelYDimension");
        String string2 = "ImageLength";
        String string3 = "ImageWidth";
        if (object3 != null && hashMap != null) {
            object = object2[0];
            ((HashMap)object).put(string3, object3);
            object3 = object2[0];
            ((HashMap)object3).put(string2, hashMap);
        }
        if ((n7 = (int)((hashMap = object2[n4]).isEmpty() ? 1 : 0)) != 0 && (n7 = (int)(this.o(hashMap = object2[n3]) ? 1 : 0)) != 0) {
            hashMap = object2[n3];
            object2[n4] = hashMap;
            object2[n3] = hashMap = new HashMap();
        }
        object2 = object2[n4];
        this.o((HashMap)object2);
        object2 = "ThumbnailOrientation";
        hashMap = "Orientation";
        this.u(0, (String)object2, (String)((Object)hashMap));
        object3 = "ThumbnailImageLength";
        this.u(0, (String)object3, string2);
        object = "ThumbnailImageWidth";
        this.u(0, (String)object, string3);
        this.u(n3, (String)object2, (String)((Object)hashMap));
        this.u(n3, (String)object3, string2);
        this.u(n3, (String)object, string3);
        this.u(n4, (String)((Object)hashMap), (String)object2);
        this.u(n4, string2, (String)object3);
        this.u(n4, string3, (String)object);
    }
}

