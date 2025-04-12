/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.b;
import androidx.work.b$b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class HI3$j
extends AA0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void bind(bg3_0 object, Object object2) {
        byte[] byArray;
        void var13_19;
        object2 = (EI3)object2;
        String string2 = ((EI3)object2).a;
        int n3 = 1;
        object.c0(n3, string2);
        hI3$b hI3$b = ((EI3)object2).b;
        long l2 = NI3.i(hI3$b);
        int n4 = 2;
        object.m0(n4, l2);
        Object object3 = ((EI3)object2).c;
        object.c0(3, (String)object3);
        object3 = ((EI3)object2).d;
        object.c0(4, (String)object3);
        Object object4 = ((EI3)object2).e;
        object3 = b.b;
        object4 = b$b.b((b)object4);
        object.q0(5, (byte[])object4);
        object4 = b$b.b(((EI3)object2).f);
        object.q0(6, (byte[])object4);
        long l3 = ((EI3)object2).g;
        object.m0(7, l3);
        l3 = ((EI3)object2).h;
        object.m0(8, l3);
        l3 = ((EI3)object2).i;
        object.m0(9, l3);
        l2 = ((EI3)object2).k;
        int n7 = 10;
        object.m0(n7, l2);
        object4 = ((EI3)object2).l;
        Intrinsics.checkNotNullParameter(object4, "backoffPolicy");
        object3 = NI3$a.$EnumSwitchMapping$1;
        int n8 = ((Enum)object4).ordinal();
        Object object5 = object3[n8];
        object3 = null;
        if (object5 != n3) {
            if (object5 != n4) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            boolean bl2 = true;
        } else {
            boolean bl3 = false;
            object4 = null;
        }
        long l4 = (long)var13_19;
        object.m0(11, l4);
        long l7 = ((EI3)object2).m;
        object.m0(12, l7);
        l7 = ((EI3)object2).n;
        object.m0(13, l7);
        l7 = ((EI3)object2).o;
        object.m0(14, l7);
        l7 = ((EI3)object2).p;
        object.m0(15, l7);
        int n10 = ((EI3)object2).q;
        n7 = 16;
        l4 = n10;
        object.m0(n7, l4);
        object4 = ((EI3)object2).r;
        Intrinsics.checkNotNullParameter(object4, "policy");
        int[] nArray = NI3$a.$EnumSwitchMapping$3;
        int n15 = ((Enum)object4).ordinal();
        n15 = nArray[n15];
        if (n15 != n3) {
            if (n15 != n4) {
                object = new NoWhenBranchMatchedException();
                throw object;
            }
        } else {
            n3 = 0;
            byArray = null;
        }
        long l8 = n3;
        object.m0(17, l8);
        long l12 = ((EI3)object2).s;
        object.m0(18, l12);
        l12 = ((EI3)object2).t;
        object.m0(19, l12);
        l12 = ((EI3)object2).u;
        object.m0(20, l12);
        l12 = ((EI3)object2).v;
        object.m0(21, l12);
        n4 = ((EI3)object2).w;
        l12 = n4;
        int n16 = 22;
        object.m0(n16, l12);
        String string3 = ((EI3)object2).x;
        n3 = 23;
        if (string3 == null) {
            object.w0(n3);
        } else {
            object.c0(n3, string3);
        }
        b60 b602 = ((EI3)object2).j;
        l3 = NI3.g(b602.a);
        object.m0(24, l3);
        byArray = NI3.b(b602.b);
        object.q0(25, byArray);
        l8 = (long)b602.c;
        object.m0(26, l8);
        l8 = (long)b602.d;
        object.m0(27, l8);
        l8 = (long)b602.e;
        object.m0(28, l8);
        l8 = (long)b602.f;
        object.m0(29, l8);
        l2 = b602.g;
        object.m0(30, l2);
        l2 = b602.h;
        object.m0(31, l2);
        byte[] byArray2 = NI3.h(b602.i);
        object.q0(32, byArray2);
        object2 = ((EI3)object2).a;
        object.c0(33, (String)object2);
    }

    public final String createQuery() {
        return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
    }
}

