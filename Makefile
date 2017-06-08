CXX=g++
CXXFLAGS=`llvm-config --cxxflags --ldflags --libs` -g -arch x86_64

all: emit

emit: emit.cpp

clean:
	rm -rf emit emit.dSYM





