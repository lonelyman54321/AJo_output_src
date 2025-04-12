/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  org.json.JSONObject
 */
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.c;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/*
 * Renamed from z01
 */
public final class z01_0 {
    public static final z01_0 a;
    public static boolean b;
    public static a01_0 c;
    public static String d;

    static {
        z01_0 z01_02;
        a = z01_02 = new z01_0();
        Intrinsics.checkNotNullExpressionValue(z01_0.class.toString(), "GpsAraTriggersManager::class.java.toString()");
    }

    public final String a(c object) {
        Throwable throwable2;
        block11: {
            block10: {
                int n3 = td0.b(this);
                if (n3 != 0) {
                    return null;
                }
                try {
                    object = ((c)object).a;
                    if (object == null) break block10;
                }
                catch (Throwable throwable2) {}
                n3 = object.length();
                if (n3 == 0) break block10;
                Object object2 = object.keys();
                Object object3 = "params.keys()";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
                object2 = ez2_1.b((Iterator)object2);
                object3 = new z01$a_0((JSONObject)object);
                object = kz2_1.j((Sequence)object2, (Function1)object3);
                object2 = "&";
                return kz2_1.h((Sequence)object, (String)object2);
                break block11;
            }
            return "";
        }
        td0.a(this, throwable2);
        return null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String object, c object2) {
        Throwable throwable222222;
        block27: {
            Exception exception222;
            Object object3;
            String string2;
            String string3;
            String string4;
            block26: {
                NoClassDefFoundError noClassDefFoundError222;
                block25: {
                    NoSuchMethodError noSuchMethodError222;
                    block24: {
                        Object object4;
                        CharSequence charSequence;
                        String string5;
                        block23: {
                            boolean bl2;
                            block22: {
                                boolean bl3;
                                block21: {
                                    string4 = "gps_ara_failed_reason";
                                    string3 = "gps_ara_failed";
                                    string2 = "gpsDebugLogger";
                                    string5 = "?app_id=";
                                    bl3 = td0.b(this);
                                    if (bl3) {
                                        return;
                                    }
                                    charSequence = "applicationId";
                                    Intrinsics.checkNotNullParameter(object, (String)charSequence);
                                    charSequence = "event";
                                    Intrinsics.checkNotNullParameter(object2, (String)charSequence);
                                    bl3 = td0.b(this);
                                    if (!bl3) break block21;
                                    return;
                                    {
                                        catch (Throwable throwable222222) {}
                                    }
                                }
                                charSequence = ((c)object2).a;
                                object3 = "_eventName";
                                charSequence = charSequence.getString((String)object3);
                                object3 = "_removed_";
                                bl2 = Intrinsics.areEqual(charSequence, object3);
                                if (bl2) return;
                                object3 = "eventName";
                                Intrinsics.checkNotNullExpressionValue(charSequence, (String)object3);
                                object3 = "gps";
                                object4 = null;
                                bl3 = StringsKt.F(charSequence, (CharSequence)object3, false);
                                if (bl3) return;
                                bl3 = td0.b(this);
                                if (bl3) {
                                    return;
                                }
                                bl3 = b;
                                if (bl3) break block22;
                                return;
                            }
                            charSequence = FacebookSdk.a();
                            bl2 = false;
                            object3 = null;
                            object4 = gl1_1.a((Context)charSequence);
                            object4 = (ll1_0)object4;
                            if (object4 == null) {
                                charSequence.getApplicationContext();
                                ll1_0.a();
                                throw null;
                            }
                            object2 = this.a((c)object2);
                            charSequence = new StringBuilder();
                            object4 = d;
                            if (object4 != null) break block23;
                            object4 = "serverUri";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                            object4 = null;
                            break block23;
                            break block27;
                            catch (NoSuchMethodError noSuchMethodError222) {
                                break block24;
                            }
                            catch (NoClassDefFoundError noClassDefFoundError222) {
                                break block25;
                            }
                            catch (Exception exception222) {
                                break block26;
                            }
                        }
                        ((StringBuilder)charSequence).append((String)object4);
                        ((StringBuilder)charSequence).append(string5);
                        ((StringBuilder)charSequence).append((String)object);
                        int n3 = 38;
                        ((StringBuilder)charSequence).append((char)n3);
                        ((StringBuilder)charSequence).append((String)object2);
                        object = ((StringBuilder)charSequence).toString();
                        object = Uri.parse((String)object);
                        object2 = "parse(\"$serverUri?$appId\u2026=$applicationId&$params\")";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        n3 = Build.VERSION.SDK_INT;
                        int n4 = 31;
                        string5 = "Stub!";
                        if (n3 >= n4) {
                            FacebookSdk.d();
                            object = new RuntimeException(string5);
                            throw object;
                        }
                        FacebookSdk.d();
                        object = new RuntimeException(string5);
                        throw object;
                    }
                    object2 = c;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object3 = object2;
                    }
                    object2 = new Bundle();
                    Object object5 = ((Object)noSuchMethodError222).toString();
                    object2.putString(string4, (String)object5);
                    object5 = Unit.a;
                    ((a01_0)object3).a((Bundle)object2, string3);
                    return;
                }
                object2 = c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object3 = object2;
                }
                object2 = new Bundle();
                Object object6 = ((Object)noClassDefFoundError222).toString();
                object2.putString(string4, (String)object6);
                object6 = Unit.a;
                ((a01_0)object3).a((Bundle)object2, string3);
                return;
            }
            object2 = c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                object3 = object2;
            }
            object2 = new Bundle();
            Object object7 = ((Object)exception222).toString();
            object2.putString(string4, (String)object7);
            object7 = Unit.a;
            ((a01_0)object3).a((Bundle)object2, string3);
            return;
            catch (Throwable throwable3) {
                td0.a(this, throwable3);
            }
            return;
            catch (Throwable throwable4) {
                td0.a(this, throwable4);
            }
            return;
        }
        td0.a(this, throwable222222);
    }
}

