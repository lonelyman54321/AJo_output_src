/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserFactory
 */
import androidx.media3.common.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.io.Reader;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/*
 * Renamed from uJ3
 */
public final class uj3_0 {
    public static final String[] a = new String[]{"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = new String[]{"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = new String[]{"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static qQ1 a(String string2) {
        Object object = XmlPullParserFactory.newInstance().newPullParser();
        Object object2 = string2;
        Object object3 = new StringReader(string2);
        object.setInput((Reader)object3);
        object.next();
        object3 = "x:xmpmeta";
        int n3 = nk_0.d(object, (String)object3);
        if (n3 != 0) {
            int n4;
            long l2;
            object2 = ImmutableList.of();
            long l3 = l2 = -9223372036854775807L;
            block0: do {
                object.next();
                String string3 = "rdf:Description";
                n4 = nk_0.d(object, string3);
                if (n4 != 0) {
                    object2 = a;
                    int n7 = 0;
                    qQ1$a qQ1$a = null;
                    for (int i3 = 0; i3 < (n4 = 4); ++i3) {
                        long l4;
                        block11: {
                            int n8;
                            String string4;
                            block10: {
                                string4 = object2[i3];
                                if ((string4 = nk_0.b(object, string4)) == null) continue;
                                n3 = Integer.parseInt(string4);
                                if (n3 != (i3 = 1)) break;
                                object2 = b;
                                for (i3 = 0; i3 < n4; ++i3) {
                                    long l7;
                                    string4 = object2[i3];
                                    if ((string4 = nk_0.b(object, string4)) == null) continue;
                                    l4 = Long.parseLong(string4);
                                    long l8 = l4 - (l7 = (long)-1);
                                    n3 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                                    if (n3 == 0) {
                                        break;
                                    }
                                    break block10;
                                }
                                l4 = l2;
                            }
                            object2 = c;
                            while (n7 < (n8 = 2)) {
                                string4 = object2[n7];
                                if ((string4 = nk_0.b(object, string4)) != null) {
                                    long l12 = Long.parseLong(string4);
                                    long l14 = 0L;
                                    long l15 = 0L;
                                    String string5 = "image/jpeg";
                                    object2 = new qQ1$a(string5, l14, l15);
                                    long l16 = 0L;
                                    String string6 = "video/mp4";
                                    qQ1$a = new qQ1$a(string6, l12, l16);
                                    object2 = ImmutableList.of(object2, qQ1$a);
                                    break block11;
                                }
                                ++n7;
                            }
                            object2 = ImmutableList.of();
                        }
                        l3 = l4;
                        continue block0;
                    }
                    return null;
                }
                string3 = "Container:Directory";
                n4 = nk_0.d(object, string3);
                if (n4 != 0) {
                    string3 = "Item";
                    object2 = uj3_0.b(object, "Container", string3);
                    continue;
                }
                string3 = "GContainer:Directory";
                n4 = (int)(nk_0.d(object, string3) ? 1 : 0);
                if (n4 == 0) continue;
                string3 = "GContainerItem";
                object2 = uj3_0.b(object, "GContainer", string3);
            } while ((n4 = (int)(nk_0.c(object, (String)object3) ? 1 : 0)) == 0);
            boolean bl2 = object2.isEmpty();
            if (bl2) {
                return null;
            }
            object = new qQ1(l3, (ImmutableList)object2);
            return object;
        }
        throw ParserException.a("Couldn't find xmp metadata", null);
    }

    public static ImmutableList b(XmlPullParser xmlPullParser, String string2, String string3) {
        boolean bl2;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        String string4 = string2.concat(":Item");
        Object object = ":Directory";
        string2 = string2.concat((String)object);
        do {
            xmlPullParser.next();
            bl2 = nk_0.d(xmlPullParser, string4);
            if (!bl2) continue;
            object = string3.concat(":Mime");
            String string5 = string3.concat(":Semantic");
            String string6 = string3.concat(":Length");
            String string7 = string3.concat(":Padding");
            String string8 = nk_0.b(xmlPullParser, (String)object);
            object = nk_0.b(xmlPullParser, string5);
            string5 = nk_0.b(xmlPullParser, string6);
            string6 = nk_0.b(xmlPullParser, string7);
            if (string8 != null && object != null) {
                long l2;
                long l3 = 0L;
                long l4 = string5 != null ? Long.parseLong(string5) : l3;
                long l7 = string6 != null ? (l2 = Long.parseLong(string6)) : l3;
                object = new qQ1$a(string8, l4, l7);
                immutableList$Builder.add(object);
                continue;
            }
            return ImmutableList.of();
        } while (!(bl2 = nk_0.c(xmlPullParser, string2)));
        return immutableList$Builder.build();
    }
}

