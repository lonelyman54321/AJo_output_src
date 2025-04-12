/*
 * Decompiled with CFR 0.152.
 */
import java.lang.constant.Constable;
import java.lang.reflect.Constructor;

/*
 * Renamed from Jl0
 */
public final class jl0_0
implements Ll0$a$a {
    public static String b(StringBuilder stringBuilder, long l2, String string2) {
        stringBuilder.append(l2);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public Constructor a() {
        Constable constable = Boolean.TRUE;
        Class[] classArray = Class.forName("androidx.media3.decoder.flac.FlacLibrary");
        Object object = "isAvailable";
        Constructor constructor = null;
        boolean bl2 = ((Boolean)constable).equals(classArray = classArray.getMethod((String)object, null).invoke(null, null));
        if (bl2) {
            constable = Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(eI0.class);
            int n3 = 1;
            classArray = new Class[n3];
            classArray[0] = object = Integer.TYPE;
            constructor = ((Class)constable).getConstructor(classArray);
        }
        return constructor;
    }
}

