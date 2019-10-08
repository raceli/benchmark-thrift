#!/bin/bash
if [[ -f /etc/profile ]]; then
    . /etc/profile
fi

if [[ -f ~/.bash_profile ]]; then
    . ~/.bash_profile
fi

if [[ $3 == "" || $3 != *.jar ]]; then
    echo "输入正确的jar路径，确保以.jar结尾"
    exit 1
fi

function gen_classpath(){
    for element in `ls ../lib/thrift/$1`
    do
        jarfile=../lib/thrift/$1/$element:$jarfile
    done
    jarfile=${jarfile%:*}
}

if [[ -d classdir ]]; then
    rm -rf classdir
fi

mkdir classdir
gen_classpath $1

echo "version -> $1"
echo "java path -> $2"
echo "jar path -> $3"
echo "classpath -> $jarfile"

javac -classpath $jarfile -d classdir $2/*.java > /dev/null

jar -cvf $3 classdir/* > /dev/null
rm -rf classdir



