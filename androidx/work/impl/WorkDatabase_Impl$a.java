/*
 * Decompiled with CFR 0.152.
 */
package androidx.work.impl;

import androidx.work.impl.WorkDatabase_Impl;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class WorkDatabase_Impl$a
extends GP2$a {
    public final /* synthetic */ WorkDatabase_Impl a;

    public WorkDatabase_Impl$a(WorkDatabase_Impl workDatabase_Impl) {
        this.a = workDatabase_Impl;
        super(23);
    }

    public final void createAllTables(xg3_1 xg3_12) {
        xg3_12.o("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        xg3_12.o("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        xg3_12.o("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        xg3_12.o("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
    }

    public final void dropAllTables(xg3_1 xg3_12) {
        xg3_12.o("DROP TABLE IF EXISTS `Dependency`");
        xg3_12.o("DROP TABLE IF EXISTS `WorkSpec`");
        xg3_12.o("DROP TABLE IF EXISTS `WorkTag`");
        xg3_12.o("DROP TABLE IF EXISTS `SystemIdInfo`");
        xg3_12.o("DROP TABLE IF EXISTS `WorkName`");
        xg3_12.o("DROP TABLE IF EXISTS `WorkProgress`");
        xg3_12.o("DROP TABLE IF EXISTS `Preference`");
        Object object = WorkDatabase_Impl.h(this.a);
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                FP2$b fP2$b = (FP2$b)object.next();
                fP2$b.onDestructiveMigration(xg3_12);
            }
        }
    }

    public final void onCreate(xg3_1 xg3_12) {
        Object object = WorkDatabase_Impl.i(this.a);
        if (object != null) {
            boolean bl2;
            object = object.iterator();
            while (bl2 = object.hasNext()) {
                FP2$b fP2$b = (FP2$b)object.next();
                fP2$b.onCreate(xg3_12);
            }
        }
    }

    public final void onOpen(xg3_1 xg3_12) {
        Iterator iterator = this.a;
        WorkDatabase_Impl.j((WorkDatabase_Impl)((Object)iterator), xg3_12);
        Object object = "PRAGMA foreign_keys = ON";
        xg3_12.o((String)object);
        ((FP2)((Object)iterator)).internalInitInvalidationTracker(xg3_12);
        iterator = WorkDatabase_Impl.k((WorkDatabase_Impl)((Object)iterator));
        if (iterator != null) {
            boolean bl2;
            iterator = iterator.iterator();
            while (bl2 = iterator.hasNext()) {
                object = (FP2$b)iterator.next();
                ((FP2$b)object).onOpen(xg3_12);
            }
        }
    }

    public final void onPostMigrate(xg3_1 xg3_12) {
    }

    public final void onPreMigrate(xg3_1 xg3_12) {
        Oh0.a(xg3_12);
    }

    public final GP2$b onValidateSchema(xg3_1 xg3_12) {
        Serializable serializable;
        ki3$b ki3$b;
        Object object;
        List<String> list;
        Object object2 = xg3_12;
        int n3 = 2;
        Object object3 = new HashMap(n3);
        boolean bl2 = true;
        int n4 = 1;
        HashSet hashSet = list;
        list = new List<String>(1, "work_spec_id", "TEXT", null, bl2, n4);
        hashSet = "work_spec_id";
        ((HashMap)object3).put(hashSet, list);
        boolean bl3 = true;
        int n7 = 0;
        int n8 = 1;
        Object object4 = object;
        object = new ki3$a(2, "prerequisite_id", "TEXT", null, bl3, n8);
        Object object5 = "prerequisite_id";
        ((HashMap)object3).put(object5, object);
        object = new HashSet(n3);
        list = Arrays.asList(hashSet);
        Object object6 = "id";
        object4 = Arrays.asList(object6);
        Object object7 = ki3$b;
        ki3$b = new ki3$b("WorkSpec", "CASCADE", "CASCADE", list, (List)object4);
        ((HashSet)object).add(ki3$b);
        List<String> list2 = Arrays.asList(object5);
        List<String> list3 = Arrays.asList(object6);
        String string2 = "CASCADE";
        String string3 = "CASCADE";
        String string4 = "WorkSpec";
        Object object8 = object7;
        object7 = new ki3$b(string4, string2, string3, list2, list3);
        ((HashSet)object).add(object7);
        object7 = new HashSet(n3);
        Object object9 = Arrays.asList(hashSet);
        Object object10 = "ASC";
        list = Arrays.asList(object10);
        object4 = "index_Dependency_work_spec_id";
        ki3$b = null;
        Object object11 = new ki3$d((String)object4, false, (List)object9, list);
        ((HashSet)object7).add(object11);
        object5 = Arrays.asList(object5);
        object9 = Arrays.asList(object10);
        list = "index_Dependency_prerequisite_id";
        object11 = new ki3$d((String)((Object)list), false, (List)object5, (List)object9);
        ((HashSet)object7).add(object11);
        object11 = "Dependency";
        object5 = new ki3_0((String)object11, (Map)object3, (AbstractSet)object, (AbstractSet)object7);
        object3 = ki3_0.a(xg3_12, (String)object11);
        boolean bl4 = ((ki3_0)object5).equals(object3);
        object7 = "\n Found:\n";
        if (!bl4) {
            StringBuilder stringBuilder = new StringBuilder("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
            stringBuilder.append(object5);
            stringBuilder.append((String)object7);
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = new GP2$b(false, (String)object3);
            return object2;
        }
        object3 = new HashMap(32);
        int n10 = 1;
        int n14 = 1;
        object8 = object;
        object = new ki3$a(1, "id", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put(object6, object);
        String string5 = "state";
        String string6 = "INTEGER";
        String string7 = null;
        int n15 = 1;
        boolean bl5 = true;
        int n16 = 0;
        object = new ki3$a(0, string5, string6, null, bl5, n15);
        ((HashMap)object3).put("state", object);
        n7 = 0;
        object8 = object;
        object = new ki3$a(0, "worker_class_name", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put("worker_class_name", object);
        object8 = object;
        object = new ki3$a(0, "input_merger_class_name", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put("input_merger_class_name", object);
        object8 = object;
        object = new ki3$a(0, "input", "BLOB", null, n14 != 0, n10);
        ((HashMap)object3).put("input", object);
        object8 = object;
        object = new ki3$a(0, "output", "BLOB", null, n14 != 0, n10);
        ((HashMap)object3).put("output", object);
        object8 = object;
        object = new ki3$a(0, "initial_delay", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("initial_delay", object);
        object8 = object;
        object = new ki3$a(0, "interval_duration", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("interval_duration", object);
        object8 = object;
        object = new ki3$a(0, "flex_duration", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("flex_duration", object);
        object8 = object;
        object = new ki3$a(0, "run_attempt_count", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("run_attempt_count", object);
        object8 = object;
        object = new ki3$a(0, "backoff_policy", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("backoff_policy", object);
        object8 = object;
        object = new ki3$a(0, "backoff_delay_duration", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("backoff_delay_duration", object);
        object8 = object;
        object = new ki3$a(0, "last_enqueue_time", "INTEGER", "-1", n14 != 0, n10);
        object5 = "last_enqueue_time";
        ((HashMap)object3).put(object5, object);
        object8 = object;
        object = new ki3$a(0, "minimum_retention_duration", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("minimum_retention_duration", object);
        object8 = object;
        object = new ki3$a(0, "schedule_requested_at", "INTEGER", null, n14 != 0, n10);
        object11 = "schedule_requested_at";
        ((HashMap)object3).put(object11, object);
        object8 = object;
        object = new ki3$a(0, "run_in_foreground", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("run_in_foreground", object);
        object8 = object;
        object = new ki3$a(0, "out_of_quota_policy", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("out_of_quota_policy", object);
        object8 = object;
        object = new ki3$a(0, "period_count", "INTEGER", "0", n14 != 0, n10);
        ((HashMap)object3).put("period_count", object);
        object8 = object;
        object = new ki3$a(0, "generation", "INTEGER", "0", n14 != 0, n10);
        object9 = "generation";
        ((HashMap)object3).put(object9, object);
        object8 = object;
        object = new ki3$a(0, "next_schedule_time_override", "INTEGER", "9223372036854775807", n14 != 0, n10);
        ((HashMap)object3).put("next_schedule_time_override", object);
        object8 = object;
        object = new ki3$a(0, "next_schedule_time_override_generation", "INTEGER", "0", n14 != 0, n10);
        ((HashMap)object3).put("next_schedule_time_override_generation", object);
        object8 = object;
        object = new ki3$a(0, "stop_reason", "INTEGER", "-256", n14 != 0, n10);
        ((HashMap)object3).put("stop_reason", object);
        list3 = null;
        object8 = object;
        object = new ki3$a(0, "trace_tag", "TEXT", null, false, n10);
        ((HashMap)object3).put("trace_tag", object);
        n14 = 1;
        object8 = object;
        object = new ki3$a(0, "required_network_type", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("required_network_type", object);
        object8 = object;
        object = new ki3$a(0, "required_network_request", "BLOB", "x''", n14 != 0, n10);
        ((HashMap)object3).put("required_network_request", object);
        list2 = null;
        object8 = object;
        object = new ki3$a(0, "requires_charging", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("requires_charging", object);
        object8 = object;
        object = new ki3$a(0, "requires_device_idle", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("requires_device_idle", object);
        object8 = object;
        object = new ki3$a(0, "requires_battery_not_low", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("requires_battery_not_low", object);
        object8 = object;
        object = new ki3$a(0, "requires_storage_not_low", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("requires_storage_not_low", object);
        object8 = object;
        object = new ki3$a(0, "trigger_content_update_delay", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("trigger_content_update_delay", object);
        object8 = object;
        object = new ki3$a(0, "trigger_max_content_delay", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("trigger_max_content_delay", object);
        string2 = "content_uri_triggers";
        string3 = "BLOB";
        object8 = object;
        object = new ki3$a(0, string2, string3, null, n14 != 0, n10);
        ((HashMap)object3).put("content_uri_triggers", object);
        object = new HashSet(0);
        list = new List<String>(n3);
        object11 = Arrays.asList(object11);
        object8 = Arrays.asList(object10);
        string4 = "index_WorkSpec_schedule_requested_at";
        object4 = new ki3$d(string4, false, (List)object11, (List)object8);
        ((HashSet)((Object)list)).add((String)object4);
        object5 = Arrays.asList(object5);
        object4 = Arrays.asList(object10);
        object8 = "index_WorkSpec_last_enqueue_time";
        object11 = new ki3$d((String)object8, false, (List)object5, (List)object4);
        ((HashSet)((Object)list)).add((String)object11);
        object11 = "WorkSpec";
        object5 = new ki3_0((String)object11, (Map)object3, (AbstractSet)object, (AbstractSet)((Object)list));
        object3 = ki3_0.a(xg3_12, (String)object11);
        bl4 = ((ki3_0)object5).equals(object3);
        if (!bl4) {
            StringBuilder stringBuilder = new StringBuilder("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
            stringBuilder.append(object5);
            stringBuilder.append((String)object7);
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = new GP2$b(false, (String)object3);
            return object2;
        }
        object3 = new HashMap(n3);
        n14 = 1;
        n10 = 1;
        object8 = object;
        object = new ki3$a(1, "tag", "TEXT", null, n14 != 0, n10);
        object5 = "tag";
        ((HashMap)object3).put(object5, object);
        n7 = 2;
        object8 = object;
        object = new ki3$a(n7, "work_spec_id", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put(hashSet, object);
        boolean bl6 = true;
        object = new HashSet((int)(bl6 ? 1 : 0));
        list2 = Arrays.asList(hashSet);
        list3 = Arrays.asList(object6);
        string2 = "CASCADE";
        string3 = "CASCADE";
        object8 = object11;
        object11 = new ki3$b("WorkSpec", string2, string3, list2, list3);
        ((HashSet)object).add(object11);
        object11 = new HashSet((int)(bl6 ? 1 : 0));
        object4 = Arrays.asList(hashSet);
        object8 = Arrays.asList(object10);
        string4 = "index_WorkTag_work_spec_id";
        list = new List<String>(string4, false, object4, object8);
        ((HashSet)object11).add(list);
        object4 = "WorkTag";
        list = new List<String>((String)object4, (Map)object3, object, object11);
        object3 = ki3_0.a(xg3_12, (String)object4);
        bl4 = ((ki3_0)((Object)list)).equals(object3);
        if (!bl4) {
            StringBuilder stringBuilder = new StringBuilder("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
            stringBuilder.append(list);
            stringBuilder.append((String)object7);
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = new GP2$b(false, (String)object3);
            return object2;
        }
        object3 = new HashMap(3);
        n14 = 1;
        n10 = 1;
        object8 = object;
        object = new ki3$a(1, "work_spec_id", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put(hashSet, object);
        bl5 = true;
        n16 = 2;
        string5 = "generation";
        string6 = "INTEGER";
        string7 = "0";
        n15 = 1;
        object = new ki3$a(n16, string5, string6, string7, bl5, n15);
        ((HashMap)object3).put(object9, object);
        n7 = 0;
        object8 = object;
        object = new ki3$a(0, "system_id", "INTEGER", null, n14 != 0, n10);
        ((HashMap)object3).put("system_id", object);
        object = new HashSet((int)(bl6 ? 1 : 0));
        list2 = Arrays.asList(hashSet);
        list3 = Arrays.asList(object6);
        string2 = "CASCADE";
        string3 = "CASCADE";
        string4 = "WorkSpec";
        object8 = object11;
        object11 = new ki3$b(string4, string2, string3, list2, list3);
        ((HashSet)object).add(object11);
        object11 = new HashSet(0);
        list = "SystemIdInfo";
        object9 = new ki3_0((String)((Object)list), (Map)object3, (AbstractSet)object, (AbstractSet)object11);
        object3 = ki3_0.a(xg3_12, (String)((Object)list));
        bl4 = ((ki3_0)object9).equals(object3);
        if (!bl4) {
            StringBuilder stringBuilder = new StringBuilder("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
            stringBuilder.append(object9);
            stringBuilder.append((String)object7);
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = new GP2$b(false, (String)object3);
            return object2;
        }
        object3 = new HashMap(n3);
        n14 = 1;
        n10 = 1;
        object8 = object;
        object = new ki3$a(1, "name", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put("name", object);
        n7 = 2;
        object8 = object;
        object = new ki3$a(n7, "work_spec_id", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put(hashSet, object);
        object = new HashSet((int)(bl6 ? 1 : 0));
        list2 = Arrays.asList(hashSet);
        list3 = Arrays.asList(object6);
        string2 = "CASCADE";
        string3 = "CASCADE";
        string4 = "WorkSpec";
        object8 = object11;
        object11 = new ki3$b(string4, string2, string3, list2, list3);
        ((HashSet)object).add(object11);
        object11 = new HashSet((int)(bl6 ? 1 : 0));
        list = Arrays.asList(hashSet);
        object10 = Arrays.asList(object10);
        object4 = "index_WorkName_work_spec_id";
        object9 = new ki3$d((String)object4, false, list, (List)object10);
        ((HashSet)object11).add(object9);
        object10 = "WorkName";
        object9 = new ki3_0((String)object10, (Map)object3, (AbstractSet)object, (AbstractSet)object11);
        object3 = ki3_0.a(xg3_12, (String)object10);
        bl4 = ((ki3_0)object9).equals(object3);
        if (!bl4) {
            StringBuilder stringBuilder = new StringBuilder("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
            stringBuilder.append(object9);
            stringBuilder.append((String)object7);
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = new GP2$b(false, (String)object3);
            return object2;
        }
        object3 = new HashMap(n3);
        n14 = 1;
        n7 = 1;
        n10 = 1;
        object8 = object;
        object = new ki3$a(n7, "work_spec_id", "TEXT", null, n14 != 0, n10);
        ((HashMap)object3).put(hashSet, object);
        bl5 = true;
        n16 = 0;
        string5 = "progress";
        string6 = "BLOB";
        string7 = null;
        n15 = 1;
        object = new ki3$a(0, string5, string6, null, bl5, n15);
        ((HashMap)object3).put("progress", object);
        object = new HashSet((int)(bl6 ? 1 : 0));
        list2 = Arrays.asList(hashSet);
        list3 = Arrays.asList(object6);
        string2 = "CASCADE";
        string3 = "CASCADE";
        string4 = "WorkSpec";
        object8 = object11;
        object11 = new ki3$b(string4, string2, string3, list2, list3);
        ((HashSet)object).add(object11);
        hashSet = new HashSet(0);
        object9 = "WorkProgress";
        object11 = new ki3_0((String)object9, (Map)object3, (AbstractSet)object, hashSet);
        object3 = ki3_0.a(xg3_12, (String)object9);
        boolean bl7 = ((ki3_0)object11).equals(object3);
        if (!bl7) {
            StringBuilder stringBuilder = new StringBuilder("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n");
            stringBuilder.append(object11);
            stringBuilder.append((String)object7);
            stringBuilder.append(object3);
            object3 = stringBuilder.toString();
            object2 = new GP2$b(false, (String)object3);
            return object2;
        }
        object3 = new HashMap(n3);
        n8 = 0;
        string3 = null;
        n14 = 1;
        object6 = serializable;
        serializable = new ki3$a(1, "key", "TEXT", null, true, n14);
        ((HashMap)object3).put("key", serializable);
        list2 = null;
        object8 = null;
        string4 = "long_value";
        string2 = "INTEGER";
        object6 = serializable;
        serializable = new ki3$a(0, string4, string2, null, false, n14);
        ((HashMap)object3).put("long_value", serializable);
        serializable = new HashSet(0);
        hashSet = new HashSet(0);
        object11 = "Preference";
        object = new ki3_0((String)object11, (Map)object3, (AbstractSet)((Object)serializable), hashSet);
        object2 = ki3_0.a(xg3_12, (String)object11);
        boolean bl8 = ((ki3_0)object).equals(object2);
        if (!bl8) {
            serializable = new StringBuilder("Preference(androidx.work.impl.model.Preference).\n Expected:\n");
            ((StringBuilder)serializable).append(object);
            ((StringBuilder)serializable).append((String)object7);
            ((StringBuilder)serializable).append(object2);
            object2 = ((StringBuilder)serializable).toString();
            object3 = new GP2$b(false, (String)object2);
            return object3;
        }
        object2 = new GP2$b(bl6, null);
        return object2;
    }
}

