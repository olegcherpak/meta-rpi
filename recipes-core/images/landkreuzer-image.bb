# Base this image on core-image-minimal
include recipes-core/images/rpi-basic-image.bb

IMAGE_INSTALL += " \
	v4l-utils \
	nano \
	mpeg2dec \
	vlc \
	video-streamer \
	"

IMAGE_INSTALL_append = " \
	crda \
	iw \
	init-ifupdown \
	hostapd \
	libnl \
	dnsmasq \
	linux-firmware-bcm43430 \
	i2c-tools \
	python-smbus \
	iptables \
	"
IMAGE_INSTALL_append = " \
	pi-blaster \
	boost \
	motor-driver \
	"
