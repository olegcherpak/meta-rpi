DESCRIPTION = "Motor driver service" 
SECTION = "examples" 
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
PR = "landkreuzer"

DEPENDS = "boost"
DEPENDS += " pi-blaster"

SRC_URI = "git://github.com/olegcherpak/motor-driver.git;protocol=https;tag=master"

S = "${WORKDIR}/git"
TARGET_CC_ARCH += "-pthread"

inherit pkgconfig cmake

do_install() {
    install -d ${D}${bindir}
    install -m 0755 motor-driver ${D}${bindir}
}