FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=212;endline=239;md5=a012868ef5f83b9f257af253d7cb07a3"

SRCREV = "9f45eb23a8a3b2d1c08d08a6d68f206fe91ecf4c"
SRC_URI = "git://github.com/sarfata/pi-blaster \
           file://remove-initscript-lsb-dependency.patch \
           file://0001-Change-period-of-PWM.patch \
"

PR = "landkreuzer"
