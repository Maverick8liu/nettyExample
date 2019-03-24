package com.example.cn.netty;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class MyByteDecoder extends ByteToMessageDecoder {

	@Override
	protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
		// TODO Auto-generated method stub
		/* if (in.readableBytes() < 4) {
	            return; // (3)  
	        }

		System.out.println();*/
		out.add(in.readBytes(in.readableBytes())); // (4)

		for(Object o:out){
			System.out.println("decode :"+o);
		}
	}

}
