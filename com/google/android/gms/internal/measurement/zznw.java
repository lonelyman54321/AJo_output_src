/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhu;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.android.gms.internal.measurement.zzif;
import com.google.android.gms.internal.measurement.zznt;

public final class zznw
implements zznt {
    private static final zzhx zza;
    private static final zzhx zzaa;
    private static final zzhx zzab;
    private static final zzhx zzac;
    private static final zzhx zzad;
    private static final zzhx zzae;
    private static final zzhx zzaf;
    private static final zzhx zzag;
    private static final zzhx zzah;
    private static final zzhx zzai;
    private static final zzhx zzaj;
    private static final zzhx zzak;
    private static final zzhx zzal;
    private static final zzhx zzam;
    private static final zzhx zzan;
    private static final zzhx zzao;
    private static final zzhx zzap;
    private static final zzhx zzaq;
    private static final zzhx zzar;
    private static final zzhx zzas;
    private static final zzhx zzat;
    private static final zzhx zzau;
    private static final zzhx zzav;
    private static final zzhx zzaw;
    private static final zzhx zzax;
    private static final zzhx zzay;
    private static final zzhx zzaz;
    private static final zzhx zzb;
    private static final zzhx zzba;
    private static final zzhx zzbb;
    private static final zzhx zzbc;
    private static final zzhx zzbd;
    private static final zzhx zzbe;
    private static final zzhx zzbf;
    private static final zzhx zzbg;
    private static final zzhx zzbh;
    private static final zzhx zzbi;
    private static final zzhx zzbj;
    private static final zzhx zzbk;
    private static final zzhx zzbl;
    private static final zzhx zzbm;
    private static final zzhx zzbn;
    private static final zzhx zzbo;
    private static final zzhx zzc;
    private static final zzhx zzd;
    private static final zzhx zze;
    private static final zzhx zzf;
    private static final zzhx zzg;
    private static final zzhx zzh;
    private static final zzhx zzi;
    private static final zzhx zzj;
    private static final zzhx zzk;
    private static final zzhx zzl;
    private static final zzhx zzm;
    private static final zzhx zzn;
    private static final zzhx zzo;
    private static final zzhx zzp;
    private static final zzhx zzq;
    private static final zzhx zzr;
    private static final zzhx zzs;
    private static final zzhx zzt;
    private static final zzhx zzu;
    private static final zzhx zzv;
    private static final zzhx zzw;
    private static final zzhx zzx;
    private static final zzhx zzy;
    private static final zzhx zzz;

    static {
        Uri uri = zzhu.zza("com.google.android.gms.measurement");
        zzif zzif2 = new zzif(uri);
        zzif2 = zzif2.zzb().zza();
        long l2 = 10000L;
        zza = zzif2.zza("measurement.ad_id_cache_time", l2);
        long l3 = 3600000L;
        zzb = zzif2.zza("measurement.app_uninstalled_additional_ad_id_cache_time", l3);
        boolean bl2 = true;
        zzc = zzif2.zza("measurement.config.bundle_for_all_apps_on_backgrounded", bl2);
        zzd = zzif2.zza("measurement.max_bundles_per_iteration", 100);
        long l4 = 86400000L;
        zze = zzif2.zza("measurement.config.cache_time", l4);
        zzif2.zza("measurement.log_tag", "FA");
        zzf = zzif2.zza("measurement.config.url_authority", "app-measurement.com");
        String string2 = "https";
        zzg = zzif2.zza("measurement.config.url_scheme", string2);
        long l7 = 1000L;
        zzh = zzif2.zza("measurement.upload.debug_upload_interval", l7);
        zzi = zzif2.zza("measurement.session.engagement_interval", l3);
        zzj = zzif2.zza("measurement.rb.attribution.event_params", "value|currency");
        long l8 = 0L;
        zzif2.zza("measurement.id.rb.attribution.app_allowlist", l8);
        zzif2.zza("measurement.id.rb.attribution.notify_app_delay_millis", l8);
        zzif2.zza("measurement.id.rb.attribution.client.min_time_after_boot_seconds", l8);
        zzk = zzif2.zza("measurement.upload.google_signal_max_queue_time", 605000L);
        zzl = zzif2.zza("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        zzm = zzif2.zza("measurement.lifetimevalue.max_currency_tracked", 4);
        zzn = zzif2.zza("measurement.dma_consent.max_daily_dcu_realtime_events", 1L);
        long l12 = 500L;
        zzo = zzif2.zza("measurement.upload.max_event_parameter_value_length", l12);
        zzp = zzif2.zza("measurement.store.max_stored_events_per_app", 100000L);
        zzq = zzif2.zza("measurement.experiment.max_ids", 50);
        zzr = zzif2.zza("measurement.audience.filter_result_max_count", 200L);
        zzs = zzif2.zza("measurement.upload.max_item_scoped_custom_parameters", 27);
        zzt = zzif2.zza("measurement.rb.max_trigger_registrations_per_day", l7);
        zzu = zzif2.zza("measurement.rb.attribution.max_trigger_uris_queried_at_once", l8);
        zzv = zzif2.zza("measurement.rb.attribution.client.min_ad_services_version", 7);
        zzw = zzif2.zza("measurement.alarm_manager.minimum_interval", 60000L);
        zzx = zzif2.zza("measurement.upload.minimum_delay", l12);
        zzy = zzif2.zza("measurement.monitoring.sample_period_millis", l4);
        zzz = zzif2.zza("measurement.rb.attribution.notify_app_delay_millis", l8);
        zzaa = zzif2.zza("measurement.config.notify_trigger_uris_on_backgrounded", bl2);
        zzab = zzif2.zza("measurement.rb.attribution.app_allowlist", "com.labpixies.flood,com.sofascore.results,games.spearmint.triplecrush,com.block.juggle,io.supercent.linkedcubic,com.cdtg.gunsound,com.corestudios.storemanagementidle,com.cdgames.fidget3d,io.supercent.burgeridle,io.supercent.pizzaidle,jp.ne.ibis.ibispaintx.app,com.dencreak.dlcalculator,com.ebay.kleinanzeigen,de.wetteronline.wetterapp,com.game.shape.shift,com.champion.cubes,bubbleshooter.orig,com.wolt.android,com.master.hotelmaster,com.games.bus.arrival,com.playstrom.dop2,com.huuuge.casino.slots,com.ig.spider.fighting,com.jura.coloring.page,com.rikkogame.ragdoll2,com.ludo.king,com.sigma.prank.sound.haircut,com.crazy.block.robo.monster.cliffs.craft,com.fugo.wow,com.maps.locator.gps.gpstracker.phone,com.gamovation.tileclub,com.pronetis.ironball2,com.meesho.supply,pdf.pdfreader.viewer.editor.free,com.dino.race.master,com.ig.moto.racing,ai.photo.enhancer.photoclear,com.duolingo,com.candle.magic_piano,com.free.vpn.super.hotspot.open,sg.bigo.live,com.cdg.tictactoe,com.zhiliaoapp.musically.go,com.wildspike.wormszone,com.mast.status.video.edit,com.vyroai.photoeditorone,com.pujiagames.deeeersimulator,com.superbinogo.jungleboyadventure,com.trustedapp.pdfreaderpdfviewer,com.artimind.aiart.artgenerator.artavatar,de.cellular.ottohybrid,com.zeptolab.cats.google,in.crossy.daily_crossword");
        zzac = zzif2.zza("measurement.upload.realtime_upload_interval", l2);
        l2 = 604800000L;
        zzad = zzif2.zza("measurement.upload.refresh_blacklisted_config_interval", l2);
        zzif2.zza("measurement.config.cache_time.service", 3600000L);
        l3 = 5000L;
        zzae = zzif2.zza("measurement.service_client.idle_disconnect_millis", l3);
        zzif2.zza("measurement.log_tag.service", "FA-SVC");
        zzif2.zza("measurement.sgtm.app_allowlist", "*");
        zzaf = zzif2.zza("measurement.sgtm.service_upload_apps_list", "de.zalando.mobile");
        zzag = zzif2.zza("measurement.sgtm.upload.batches_retrieval_limit", 10);
        zzah = zzif2.zza("measurement.sgtm.upload.max_queued_batches", l3);
        zzai = zzif2.zza("measurement.sgtm.upload.min_delay_after_background", 600000L);
        zzaj = zzif2.zza("measurement.sgtm.upload.min_delay_after_broadcast", l7);
        zzak = zzif2.zza("measurement.sgtm.upload.min_delay_after_startup", l3);
        l3 = 1800000L;
        zzal = zzif2.zza("measurement.sgtm.upload.retry_interval", l3);
        zzam = zzif2.zza("measurement.sgtm.upload.retry_max_wait", 21600000L);
        zzan = zzif2.zza("measurement.upload.stale_data_deletion_interval", l4);
        zzao = zzif2.zza("measurement.rb.attribution.max_retry_delay_seconds", 16);
        zzap = zzif2.zza("measurement.rb.attribution.client.min_time_after_boot_seconds", l8);
        zzaq = zzif2.zza("measurement.rb.attribution.uri_authority", "google-analytics.com");
        zzar = zzif2.zza("measurement.rb.attribution.max_queue_time", 864000000L);
        zzas = zzif2.zza("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        zzat = zzif2.zza("measurement.rb.attribution.query_parameters_to_remove", "");
        zzau = zzif2.zza("measurement.rb.attribution.uri_scheme", string2);
        zzav = zzif2.zza("measurement.sdk.attribution.cache.ttl", l2);
        zzaw = zzif2.zza("measurement.redaction.app_instance_id.ttl", 0x6DDD00L);
        zzax = zzif2.zza("measurement.upload.backoff_period", 43200000L);
        zzay = zzif2.zza("measurement.upload.initial_upload_delay_time", 15000L);
        zzaz = zzif2.zza("measurement.upload.interval", 3600000L);
        l2 = 65536L;
        zzba = zzif2.zza("measurement.upload.max_bundle_size", l2);
        zzbb = zzif2.zza("measurement.upload.max_bundles", 100);
        zzbc = zzif2.zza("measurement.upload.max_conversions_per_day", 500L);
        zzbd = zzif2.zza("measurement.upload.max_error_events_per_day", l7);
        zzbe = zzif2.zza("measurement.upload.max_events_per_bundle", l7);
        zzbf = zzif2.zza("measurement.upload.max_events_per_day", 100000L);
        zzbg = zzif2.zza("measurement.upload.max_public_events_per_day", 50000L);
        zzbh = zzif2.zza("measurement.upload.max_queue_time", 518400000L);
        zzbi = zzif2.zza("measurement.upload.max_realtime_events_per_day", 10);
        zzbj = zzif2.zza("measurement.upload.max_batch_size", l2);
        zzbk = zzif2.zza("measurement.upload.retry_count", 6);
        zzbl = zzif2.zza("measurement.upload.retry_time", l3);
        zzbm = zzif2.zza("measurement.upload.url", "https://app-measurement.com/a");
        zzbn = zzif2.zza("measurement.upload.window_interval", 3600000L);
        zzbo = zzif2.zza("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }

    public final long zza() {
        return (Long)zza.zza();
    }

    public final long zzaa() {
        return (Long)zzai.zza();
    }

    public final long zzab() {
        return (Long)zzaj.zza();
    }

    public final long zzac() {
        return (Long)zzak.zza();
    }

    public final long zzad() {
        return (Long)zzal.zza();
    }

    public final long zzae() {
        return (Long)zzam.zza();
    }

    public final long zzaf() {
        return (Long)zzan.zza();
    }

    public final long zzag() {
        return (Long)zzao.zza();
    }

    public final long zzah() {
        return (Long)zzap.zza();
    }

    public final long zzai() {
        return (Long)zzar.zza();
    }

    public final long zzaj() {
        return (Long)zzav.zza();
    }

    public final long zzak() {
        return (Long)zzaw.zza();
    }

    public final long zzal() {
        return (Long)zzax.zza();
    }

    public final long zzam() {
        return (Long)zzay.zza();
    }

    public final long zzan() {
        return (Long)zzaz.zza();
    }

    public final long zzao() {
        return (Long)zzba.zza();
    }

    public final long zzap() {
        return (Long)zzbb.zza();
    }

    public final long zzaq() {
        return (Long)zzbc.zza();
    }

    public final long zzar() {
        return (Long)zzbd.zza();
    }

    public final long zzas() {
        return (Long)zzbe.zza();
    }

    public final long zzat() {
        return (Long)zzbf.zza();
    }

    public final long zzau() {
        return (Long)zzbg.zza();
    }

    public final long zzav() {
        return (Long)zzbh.zza();
    }

    public final long zzaw() {
        return (Long)zzbi.zza();
    }

    public final long zzax() {
        return (Long)zzbj.zza();
    }

    public final long zzay() {
        return (Long)zzbk.zza();
    }

    public final long zzaz() {
        return (Long)zzbl.zza();
    }

    public final long zzb() {
        return (Long)zzb.zza();
    }

    public final long zzba() {
        return (Long)zzbn.zza();
    }

    public final String zzbb() {
        return (String)zzf.zza();
    }

    public final String zzbc() {
        return (String)zzg.zza();
    }

    public final String zzbd() {
        return (String)zzj.zza();
    }

    public final String zzbe() {
        return (String)zzl.zza();
    }

    public final String zzbf() {
        return (String)zzab.zza();
    }

    public final String zzbg() {
        return (String)zzaf.zza();
    }

    public final String zzbh() {
        return (String)zzaq.zza();
    }

    public final String zzbi() {
        return (String)zzas.zza();
    }

    public final String zzbj() {
        return (String)zzat.zza();
    }

    public final String zzbk() {
        return (String)zzau.zza();
    }

    public final String zzbl() {
        return (String)zzbm.zza();
    }

    public final String zzbm() {
        return (String)zzbo.zza();
    }

    public final boolean zzbn() {
        return (Boolean)zzc.zza();
    }

    public final boolean zzbo() {
        return (Boolean)zzaa.zza();
    }

    public final long zzc() {
        return (Long)zzd.zza();
    }

    public final long zzd() {
        return (Long)zze.zza();
    }

    public final long zze() {
        return (Long)zzh.zza();
    }

    public final long zzf() {
        return (Long)zzi.zza();
    }

    public final long zzg() {
        return (Long)zzk.zza();
    }

    public final long zzh() {
        return (Long)zzm.zza();
    }

    public final long zzi() {
        return (Long)zzn.zza();
    }

    public final long zzj() {
        return (Long)zzo.zza();
    }

    public final long zzk() {
        return (Long)zzp.zza();
    }

    public final long zzl() {
        return (Long)zzq.zza();
    }

    public final long zzm() {
        return (Long)zzr.zza();
    }

    public final long zzn() {
        return (Long)zzs.zza();
    }

    public final long zzo() {
        return (Long)zzt.zza();
    }

    public final long zzp() {
        return (Long)zzu.zza();
    }

    public final long zzq() {
        return (Long)zzv.zza();
    }

    public final long zzr() {
        return (Long)zzw.zza();
    }

    public final long zzs() {
        return (Long)zzx.zza();
    }

    public final long zzt() {
        return (Long)zzy.zza();
    }

    public final long zzu() {
        return (Long)zzz.zza();
    }

    public final long zzv() {
        return (Long)zzac.zza();
    }

    public final long zzw() {
        return (Long)zzad.zza();
    }

    public final long zzx() {
        return (Long)zzae.zza();
    }

    public final long zzy() {
        return (Long)zzag.zza();
    }

    public final long zzz() {
        return (Long)zzah.zza();
    }
}

