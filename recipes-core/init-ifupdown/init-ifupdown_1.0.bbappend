#SYSTEMD_AUTO_ENABLE_${PN} = "enable"

FILESEXTRAPATHS_prepend := "${THISDIR}/init-ifupdown-1.0:"

do_install_append() {
	install -d ${D}${sysconfdir}/rc6.d
    install -d ${D}${sysconfdir}/rc0.d
    install -d ${D}${sysconfdir}/rc2.d
    install -d ${D}${sysconfdir}/rc4.d
    install -d ${D}${sysconfdir}/rc1.d
    install -d ${D}${sysconfdir}/rc5.d
    install -d ${D}${sysconfdir}/rc3.d
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc6.d/K20networking
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc0.d/K20networking
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc2.d/S20networking
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc4.d/S20networking
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc1.d/K20networking
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc5.d/S20networking
	ln -sf ../init.d/networking ${D}${sysconfdir}/rc3.d/S20networking
}