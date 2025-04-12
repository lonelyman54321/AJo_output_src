/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from mY0
 */
public final class my0_1 {
    public static final my0$a_0 Companion;
    public final wy0_1 a;
    public boolean b;
    public String c;

    static {
        my0$a_0 my0$a_0;
        Companion = my0$a_0 = new Object();
    }

    public my0_1(wy0_1 wy0_12) {
        this.a = wy0_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void gameState(String string2) {
        Exception exception2;
        Object object;
        block3: {
            boolean bl2;
            String string3;
            int n3;
            String string4;
            block2: {
                object = "state>>>>>>>";
                CharSequence charSequence = "sessionId>>>>>>>";
                CharSequence charSequence2 = "score>>>>>>>";
                CharSequence charSequence3 = "gameCode>>>>>>>";
                Object object2 = yn3_0.a;
                string4 = kp1_0.c("gameState>11>>>>>>", string2);
                Object object3 = new Object[]{};
                ((yn3$a)object2).a(string4, object3);
                if (string2 == null) return;
                try {
                    string4 = new JSONObject(string2);
                    string2 = "gameCode";
                    string2 = string4.getString(string2);
                    object3 = "score";
                    n3 = string4.getInt((String)object3);
                    string3 = "state";
                    string3 = string4.getString(string3);
                    CharSequence charSequence4 = "sessionId";
                    string4 = string4.getString((String)charSequence4);
                    charSequence4 = new StringBuilder((String)charSequence3);
                    ((StringBuilder)charSequence4).append(string2);
                    charSequence3 = ((StringBuilder)charSequence4).toString();
                    charSequence4 = new Object[]{};
                    ((yn3$a)object2).a((String)charSequence3, (Object[])charSequence4);
                    charSequence3 = new StringBuilder((String)charSequence2);
                    ((StringBuilder)charSequence3).append(n3);
                    charSequence2 = ((StringBuilder)charSequence3).toString();
                    charSequence3 = new Object[]{};
                    ((yn3$a)object2).a((String)charSequence2, (Object[])charSequence3);
                    charSequence2 = new StringBuilder((String)charSequence);
                    ((StringBuilder)charSequence2).append(string4);
                    charSequence = ((StringBuilder)charSequence2).toString();
                    charSequence2 = new Object[]{};
                    ((yn3$a)object2).a((String)charSequence, (Object[])charSequence2);
                    charSequence = new StringBuilder((String)object);
                    ((StringBuilder)charSequence).append(string3);
                    object = ((StringBuilder)charSequence).toString();
                    charSequence = new Object[]{};
                    ((yn3$a)object2).a((String)object, (Object[])charSequence);
                    bl2 = this.b;
                    if (bl2 || !(bl2 = ((String)(object = "playing")).equalsIgnoreCase(string3))) break block2;
                    this.b = bl2 = true;
                    object = AnalyticsManager.Companion;
                    object = ((AnalyticsManager$Companion)object).getInstance();
                    object = ((AnalyticsManager)object).getGtmEvents();
                    charSequence = "gamezone";
                    charSequence2 = "game started";
                    charSequence3 = this.c;
                    object2 = "game screen";
                    ((GTMEvents)object).pushEvent((String)charSequence, (String)charSequence2, charSequence3, (String)object2);
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            if (!(bl2 = ((String)(object = "over")).equalsIgnoreCase(string3))) return;
            this.b = false;
            object = this.a;
            if (object == null) return;
            Intrinsics.checkNotNull(string2);
            Intrinsics.checkNotNull(string4);
            object.g1(n3, string2, string4);
            return;
        }
        object = yn3_0.a;
        ((yn3$a)object).e(exception2);
    }
}

