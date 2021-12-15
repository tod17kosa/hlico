#!/usr/bin/env bash

BASEDIR=$(dirname "$0")
. $BASEDIR/env.sh

USERNAME=$1
PASSWD=$2

keytool -genseckey -keystore /hli_app/sw/was/jws/tomcat/conf/vault/vault.keystore -alias hlico_vault -storetype pkcs12 -keyalg AES -keysize 256 -storepass Hlico123# -keypass Hlico123#

if [ e$USERNAME == "e" ];

then
        echo " input DB USER NAME ....."
        echo " ex ) ./enc_db.sh \"DB USER NAME\" \"DB Password\""
        exit 1
elif [ e$PASSWD == "e" ];
then
        echo " input DB Password ....."
        echo " ex ) ./enc_db.sh \"DB USER NAME\" \"DB Password\""
        exit 1
else
        echo " \"DB USER NAME=$USERNAME\" \"DB Password=$PASSWD\""
fi
$CATALINA_HOME/bin/tomcat-vault.sh --keystore /hli_app/sw/was/jws/tomcat/conf/vault/vault.keystore --keystore-password Hlico123# --alias hlico_vault --enc-dir /hli_app/sw/was/jws/tomcat/conf/vault --iteration 120 --salt hlico123 --vault-block SMPDS_block --attribute mariadb_password --sec-attr "$PASSWD" |  grep "KEYSTORE_URL" -A 5 > /hli_app/sw/was/jws/tomcat/conf/vault.properties

