PR = "landkreuzer"

SYSTEMD_AUTO_ENABLE_${PN} = "enable"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://hostapd.conf \
    file://init \
    "
do_install_append() {
	install -d ${D}${sysconfdir}/init.d/
    install -m 0644 ${WORKDIR}/hostapd.conf ${D}${sysconfdir}/hostapd.conf
    install -m 0755 ${WORKDIR}/init ${D}${sysconfdir}/init.d/hostapd
}
