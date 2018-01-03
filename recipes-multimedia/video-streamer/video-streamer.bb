SUMMARY = "Video stream interface"
DESCRIPTION = "Used to start vlc stream with systemd when driver is loaded"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
DEPENDS = "vlc"
SRC_URI += "\
		file://COPYING \
        file://init.sh \
        file://video-streamer.service \
"

PR = "landkreuzer"

S = "${WORKDIR}"

inherit systemd

SYSTEMD_PACKAGES = "${PN}"

SYSTEMD_SERVICE_${PN} = " video-streamer.service"

SYSTEMD_AUTO_ENABLE_${PN} = "enable"

FILES_${PN} += " video-streamer.service \
                 /opt/video-streamer/init.sh \
"

KERNEL_MODULE_AUTOLOAD += "bcm2835-v4l2"


do_install () {
    install -d ${D}${systemd_system_unitdir}
    install -d ${D}/opt/video-streamer
    install -m 0755 ${WORKDIR}/video-streamer.service ${D}${systemd_system_unitdir}
    install -m 0755 ${WORKDIR}/init.sh ${D}/opt/video-streamer
}
