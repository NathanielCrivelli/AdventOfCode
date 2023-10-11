package Day3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Part2 {
    private static String test = "vJrwpWtwJgWrhcsFMMfFFhFp\n" + //
            "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" + //
            "PmmdzqPrVvPwwTWBwg\n" + //
            "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" + //
            "ttgJtRGJQctTZtZT\n" + //
            "CrZsJsPPZsGzwwsLwLmpwMDw";
    private static String rucksacks = "PcPlnShmrLmBnmcwBhrmcmbHNGFGpwdFFwGNjNbGqNHH\n" + //
            "tzQfRJfWZZztWzVtCTfRzFZjpFjNZjGLHbdHLDdjpb\n" + //
            "CCQTzRLzvQVVfRzJfMPsnBlglgPmBgPmvSrl\n" + //
            "RMfvbbszHTsssFPzDQPggpQJPQ\n" + //
            "NSNcqVtLVGgDlpQBClVB\n" + //
            "hmStGNNLhjNrpWLGSjWrZssbZTMMvTfMnThbRRTs\n" + //
            "fTrTPGTbfftWBBmLjrJL\n" + //
            "DqHwVMqVplDslmlZmpHVwNnShWZFdBBdjWBtWtdtWJSSLS\n" + //
            "MNslpDvVHlwsmpQRgQgCfTTcvcRQ\n" + //
            "pBBhRgDsMsswprBhvgRglZtFGFFRqZtZmRtNqtZPPN\n" + //
            "TdmmzzmdZdqdGFtF\n" + //
            "nmSccCVmSCpDCswMwl\n" + //
            "NptqDsQtDTQzCvlzCpRlRp\n" + //
            "jmZcndmjbZcjrmDvFMFFlwCvzFnF\n" + //
            "jjgLVLrGcdDBNhWQTgHg\n" + //
            "mLVhhfSMSTmMwClHGdpjDHjGdV\n" + //
            "zPrZgJCgbsnrPtZzsCsbpRDjBRHnjGDRldRHppcG\n" + //
            "JJrbsFrZqrgWbbqbrgWzJPNTwhTNCmmvfWCShhhmwwfm\n" + //
            "ftgfljvgfgBTNvtggFDDGLGRDnMDzcQzncGt\n" + //
            "VdbpbVdZwdwrsVVLRrMrDLDBGnBGcM\n" + //
            "wmpWwWsHWBCCCPPvjvmSqlfTTmSNgN\n" + //
            "jSqmzmmSSDRjLMLDwqjNcMMLTTflffWCCsRsTHnHVrfHWTsr\n" + //
            "tdbgZpgBPdgGZGGFTHVpCsCVfVsJpnWl\n" + //
            "FnPQFvbvhFFFbvBwScjhzcqSLLSzSN\n" + //
            "bWdgrWwwFWbgzFWzrmNbdPqttChMSRnmqSPSnqtMRM\n" + //
            "lcPJLDDPPfpMBCRJBtQtMh\n" + //
            "lGDGjTGLLDHPPGjlPTsswsbHNFsNrFNFsrzr\n" + //
            "VmtHfVhBLHVtlhphjZMdnQQZZqZmQDdzQQ\n" + //
            "CPFwPWrvWgrfNgFPCMqZzMDDbznFTqqzDQ\n" + //
            "NNPsfffPCsBLjpVltV\n" + //
            "ssdBBJqJhlTJLsjTJqFFmnmmnnrcmpprmmmPcRlf\n" + //
            "gqtqzSgWQWqmnRPPcNmmQM\n" + //
            "GqbSVtGzvgvgWbZjjBhTdhBsTZBJBZ\n" + //
            "jhNBsPDzLjsVhLSNzgvcvbcwbBWFcgtWCc\n" + //
            "ZQQTTHHnGpMtnpdHpQJfMgrvWWFqbcWWGgrgwCCwwF\n" + //
            "nHpmMnQQMmHpRnHRmMJnnTShPzljzjSNmSDhLsNSPtSh\n" + //
            "GdqnBGFdlqzFnwdSCQZjZLLDZjZRvZLDVvgQ\n" + //
            "PsptsTcftMfcTfhTghVDvvjnRNjVZnvV\n" + //
            "WtPfJTfftJcMTrMnpccFwlCSCGFGCbCwJSbqBl\n" + //
            "GjFLGhjRwFjNSjSdJCBBdQJddbBc\n" + //
            "MVvMMHRzVtHlvlcQBQJHqdpQqCBC\n" + //
            "vDgVztvvmrgrVRrMmsrsmZzZnWhGnNhGWTLfnLwTLhLTjngL\n" + //
            "VljjQJSsrjjrCglsCjsgjVVfDLdZGMdvvGdQMzmvzcDQMc\n" + //
            "HqPBtcpRWwtHbbFwBHZfmfpDfvffDfMfmGvM\n" + //
            "PwHNbcwtqFqnwtNNqPNPPWBTThjhhVTCSJTThssVnSlJJV\n" + //
            "GCccNCrrnCrpnzrnCDPcDDrvHHTBqTPhswqhPTBTTwBhTj\n" + //
            "VfNmRtZgWWHdBdswdjZv\n" + //
            "SmtQfgNmVFgVLVLVmrnMpcDLGCGLGDMpCp\n" + //
            "CrdZdZmPPjrQdRPRDqDLBqBLBSWgWgLDzF\n" + //
            "sQhTNphsVbhhhMJfhNVGqltVSzSllBzStlzFFFWB\n" + //
            "hsMpwQhNMZmPmrwHRj\n" + //
            "cNVpSVRpLHRLsVWWfnfsCshW\n" + //
            "jvqjTgqZPlJZmbPPfbpswsPb\n" + //
            "vlqdTZdtJvqdZjgqZrtRpQFtLFRQczHGzt\n" + //
            "JJQndVQnQgTfNvGf\n" + //
            "ljpbWbmNbDlGTvggGvZf\n" + //
            "mpmRbMmmNDFDmScpzCsdzrnJrsCzrrnM\n" + //
            "tNFtNFFzzjjzjBtVNZVbjZGlpSvTllpWwvnBlWGGBGCC\n" + //
            "fPdcrrgPHrHMMMWlppGJSPwGSnGv\n" + //
            "fmrqrhhfhdRddHrhQqQrfnLZjLtNttZjjRtzjFtRNj\n" + //
            "sphRcpQRhfmnmfpptg\n" + //
            "WVPlGLlSjCjSlGSHJJWZdmbmfvPmmnftbbgDdt\n" + //
            "LJjjqVNjlnCTRcRhhsNcFF\n" + //
            "vwwqttFjwgClRNCCvGNmZZMmJsPJjJpTdMpsZd\n" + //
            "fBLVHHHrFnhHhnrVSTmfdPdPccTTPsMfsJ\n" + //
            "QzVWzznzFbWNGNlt\n" + //
            "vjMddVVmnWpdMndjvhhWfNLpfBsfLLZLBBSqqTZq\n" + //
            "RFlrzQJPSRGzzzzgBZNsgBZTBflfgf\n" + //
            "cQFDRHFDDGCJShCnvwVnnhCn\n" + //
            "hgjlpRRLlPJJhTLJMDnwBndSPBNvMqnN\n" + //
            "FGWVfZsmCbmVzrvtwCSMtMdnDMCw\n" + //
            "VsVmVZfVQDmVFrrmzmGrHHTJgJjhHJcllglLQJRL\n" + //
            "rrTVcTBgsjTffmfWHZTv\n" + //
            "JLdnDlpGlGSLlpwJpHZfFvRZnWzWrHWqFH\n" + //
            "wQDpDrdSlSCblCdwdSLlwQGBthPMsghNsVNVtCNNhNPjhs\n" + //
            "CtCMvNhDMHfDDdffqtDtCflpJlBpvmWWJWwlpwFFvjwB\n" + //
            "rGSbVGZrSsFJjlmBFZWp\n" + //
            "rbbQgzVGrFVSPPGqfhftfqztNtqHtt\n" + //
            "lMGZCGphllZDNshNNmHHND\n" + //
            "PLwjVwJVsHmRrZZw\n" + //
            "ffSdzjfZSjtjSjLtLLFFFGqFzznCpCnCBblQ\n" + //
            "CqRnlzHCRWTlHPTZVQrcQtFsQFTcrQ\n" + //
            "DfJcdBDBcftQjsrsBtjZ\n" + //
            "JDfdGhSvNGhNfffGSfRznPvcRWcqCqmlvlcn\n" + //
            "JPhBBBQCnCJCMhnhMZRrRZgbDgrWrNbglDgR\n" + //
            "jLtSTwtsShwRNpRWrh\n" + //
            "FLLSHsjGLGczvfPfJdfhddnHPC\n" + //
            "BjHBNrWmTjFgJngbJhWd\n" + //
            "vsGttMDtwCMQCJnqqqFJsggqdg\n" + //
            "GFtDSwwMpTrzSSfcfm\n" + //
            "rnWDQvpwWpDDcPjFPPHZjVDZ\n" + //
            "CTJCRmCJcZZZHCCQ\n" + //
            "LdlmdQJNpnLWbrfL\n" + //
            "VdTdcVTZwCRGVGGMVmttlF\n" + //
            "gnrsbngfgQSpBfpMBBBpSgMNNJbmGmlqGDqDNlFFJlGNFz\n" + //
            "gprgQhgpMMMPsrRTCdPZwCwZZCRH\n" + //
            "cHlCVGbbWHWqRNThhcNcmh\n" + //
            "MwQDzpwdJwpBpPDQvrhShfLTTRLfLdjfNRqS\n" + //
            "JwMBBrPsPDwQMDPPBPQJwMrvWHFbHHlgbsGnnWHnFnRGlblF\n" + //
            "PQPjPDjRRQSFLSlgSmLlfh\n" + //
            "zpLdBddbNCdqGbWJGWpJWWlsFsmmFpwfflFgfHwFhgmh\n" + //
            "nJLdLVnzqqbjRctcPDQVTP\n" + //
            "JdztScztPdSWLJLtgMbCjhvlbPRbjbMvCh\n" + //
            "VZrqfQcFQwGVVFqfrTFTNqhljRHDMvMMGhRDRRHGbDhG\n" + //
            "NZQNVQQpQmrZFQQFwQQVVZgBszJJgznstnmtcztdBSgs\n" + //
            "nFHLNJzFbLJGGLMlTTRZbZRhWRTr\n" + //
            "wVmgBBmtmwlqlWTwTM\n" + //
            "sdvmgcPsCPPQQSMz\n" + //
            "SccCqmQmgBmppLQmpSMjjlJzzsNPMDRbPNPlJM\n" + //
            "VHZvwtZwhZHtdTwrVbNsljlRDlJPDhzsbN\n" + //
            "dZwftVRftmcgpBCmBf\n" + //
            "NTTlVlgNSflqbphFFhNbFp\n" + //
            "wmmLmjwzwbWGLjRmtZZdhZLFtQQLQBFh\n" + //
            "RvjbMjjvMzMWbDWwvzPjvmWSfVfsTlVVPVgTgPfVsnnnsJ\n" + //
            "BsBsZHZNdWwsNdrzgCrMMqsjzzMC\n" + //
            "flfhVWFmLrhQzCCh\n" + //
            "fVbmFSpnSSmtnPZvdWbwvdvdHZ\n" + //
            "NsZWWWWLsBZPhfsLmPhcFCCHCMMrqfqcvHMfHH\n" + //
            "nThSllnplGlMpvFRcCqrrr\n" + //
            "DnTwSztgzlDnVGTwztmdZhmLdJdNDshBdsWs\n" + //
            "RBBGTFZGglMHvrtcgSdnNgjg\n" + //
            "DmVcbmbJmwJDJzVVwzJfmfstnztvjnNjvNSpdptvzCnpjj\n" + //
            "DsLcfLmbhVQssQJQscWRPBZZMMRLHFHZBGMG\n" + //
            "FVvhVnhFnFhmvFhVcMBHLgcPClrqqrtqCppldrRRTppldg\n" + //
            "QLWfDNwsQLtlrrCtDdpq\n" + //
            "sJwZwLsGJWGGwzzWZNbWNLjQHSVhvHSnhcMFcbVmnvcchSBS\n" + //
            "jTMNMrHBJWWDffRqfDBqfD\n" + //
            "QmSFphtQqQmVmqVnPnPlpwgfnRnDPl\n" + //
            "VqFmLFbLhmZhGFGmCmGtZLtJWzWHcJrNrHMccjMscMHzMZ\n" + //
            "hGPGmbfPzbPfgdMdWGqBGQcqpp\n" + //
            "nvFTvDrTdNZZlrjnMHHHpBBcppqq\n" + //
            "rNlZZNLvRdRCRFFwZwhgbmSJPSmPfhfwhS\n" + //
            "vjdbFWTtFRRvtvZZvdWJWbGjLhCcnrrrNqLNCPqchShNqc\n" + //
            "QHQVlDsMfmmDMHDBdLdCSLnhNLNNfqCd\n" + //
            "VQHsMDpHlzMBBwlsmMzmmlVwptvTWdvJdbvJtRTWgGFJJGtR\n" + //
            "nSScBcnbbFSQVdBFBtWpwtvtPbTZthtTvT\n" + //
            "pRzHpGjCDGzHGCGsThqqwZwPhCtvhTqZ\n" + //
            "NzlzjDDpNldBFrlfFQ\n" + //
            "qJlDlPPWppgppqPlplpfdvgnbMfGbdgCghMdCM\n" + //
            "QWTWZcSsWbvVvTnhfC\n" + //
            "tRFLwZrcrWzzlJmtBqlm\n" + //
            "HMNMvvzzNcmfNmfbhs\n" + //
            "qVcwCgjCLtWRSLsTPbmPfmTh\n" + //
            "RtWCJgddWRtCJdWWgdBjwWWwpzMFpHGprcBGFFnGHQZHQGpF\n" + //
            "gZgBDgDVGDGjmDZRtgjvVvtQdnLrcRcrdfdfCcnlscsJsn\n" + //
            "WTqzqHqNzpHpwzNhMHNwWPbQCQcCLsnCrLLfcrffNflcNn\n" + //
            "zHTwwpTPzTTwlFTFzwqzPbwZGgGZZBtmGGvGmBGZVFStFZ\n" + //
            "znlSSzfzTcmmfcCt\n" + //
            "PHWWGpqgPShPMwGwqJFTVtwtCVTCmTJcFc\n" + //
            "qHqqSggLrRLBbvDDdndzRQ\n" + //
            "WBddBQWZWWQqqQFMWfmrWsJnmVJJNDDVJGsLmHmLDN\n" + //
            "PTgCjvCCPPPzSZGJVLsVZCHHnH\n" + //
            "pzwtPTvzTjRTPtwSjPSzRgBbWMBfMwwZfbWrMrZFqFFM\n" + //
            "BqDwVqdqlDlblQMf\n" + //
            "ZcCWWcWzvJZjcPjZZZfTHfQJQHThqpMbQQJf\n" + //
            "LPCcZcczZLgCjvPWgvstjsjmRRBdmGrdGdmSFGnFrtGmqr\n" + //
            "CBvgQssVzfCBQSgvvvfmrlGrCtMGwthJlJtbrh\n" + //
            "TpLqLRFpqdRpRTfNPtRmrMMtMlMMmlMJlt\n" + //
            "PZTjqFFTHZZNZpqcVWzVvgzcWnSWfBDD\n" + //
            "SVSTpgpVpdNbpcVdfjcNfbcJnqsltcJPvRJqRwQqlQsJls\n" + //
            "zhWzDLmFHhmrWZmmzHJJQlnswqsvttrstQqs\n" + //
            "zGtZFGGCmZmGGFhLBWBGGFdgVjgppMTSTgMfCNfVVSdj\n" + //
            "CzjNJGcnzQJltPHttcPHTP\n" + //
            "bLVsqLbLmSSVrqmdhVSmsVFFprfrFWrwTTWWWZpFPtlP\n" + //
            "ssDsMqLqhvmvhdmdvzRCnQgRzzBjgnlNCM\n" + //
            "TzTLzzSGRlRSjWzlWRzHGTpNhPhJPmdnNPPbhlbPbdhfPh\n" + //
            "mBCDBVrCqVQvQMBcVcqBrBDsbtJfnZNbJndNNhthZNJfPZPs\n" + //
            "wMCrqVvBzmzHTGLw\n" + //
            "NbfwfZPPdVNPdBdQBcmQzrQz\n" + //
            "nnWqHLWGFMDFDLDjsqnHLsrQGzmJczmQrgJmJGZmQrgJ\n" + //
            "FFWRsHMHCZCWFwRwphpvlfTTpp\n" + //
            "PclPlVZvLDNvVZSLSMvvDttmtfzFtzHqtqtzzccCFc\n" + //
            "jrggQGhjQsTDbrbJjJQqzzCsdtzzFCdHqmBBHz\n" + //
            "WGDgngwrQggZMNvMWPMRRV\n" + //
            "wNgpMdMMcdSscccNcLLTbtQJtQJQltJwFtlBlzBt\n" + //
            "HHGhrLrCvHWHCPhrWDtnBllnQbfQftGnfnBF\n" + //
            "HvLjWCLHPZvHHHZjjrqVTTZVcppMgNNNNSpS\n" + //
            "QQrwQmvWQjgTfvBjfffrSDcrqSqDDVLctqqcVd\n" + //
            "GnHFnGhGplGMlHMNhzBzlLPLVcVNCPDqVNdcqLdqtV\n" + //
            "GnMGpslMhGsRzzHzGsZFZQJTTmWfBbvfgfgJRfbwbW\n" + //
            "MRCtSwMhvjCGtvMZDVWpVZJlVccNDlpb\n" + //
            "gdLQFFwwLfHJWnQlcJJbWc\n" + //
            "rdqdmqHLTLmsswsFHLFtMPRMCSSRtSjTPMPSCR\n" + //
            "jmCCnLCLZjZjRjQTLZQhGPGhhzHhDRGRDzwzwh\n" + //
            "stlJlrlJJcSSfSMMzPfhhGhzpwhpNwhD\n" + //
            "rbrbBcSlWmdZWjDnTm\n" + //
            "PNBRNnnqQRNfVfRtVVzgFLLttpSwgzzzmFFF\n" + //
            "fcWlcbvvCFzLbwLw\n" + //
            "rlrMrhTJhDcTTfhRNqHRQPQRQNQB\n" + //
            "TrprpprRVVfpRpVqTVpzDdvmvbbCchhcttqcthSMdd\n" + //
            "JlnZnFlsMBZnJHlsLsCLbSNtbNhdbbShCScm\n" + //
            "FlZjjsHHsnQFQwTDzMRRpGRR\n" + //
            "wHWzwCTTqJhzzvJhWHWhqJWrFsFQrrrFCfFfgjjgjprfsp\n" + //
            "DBRmZRtZLbnRBGSBmtGSLpjBrrsfrgsTQVrVrrPrgr\n" + //
            "DLnbcbtLtmNNmbRcGbcGmHzlThNNhqJTHdvqvWlHJh\n" + //
            "GSNqjRcqflNLnCTTWrWn\n" + //
            "BmwQtmtJwPwmzMwQtHtVssvrnpWTTnsTTgpVCLCs\n" + //
            "DBBQHJJrzhzQDDfSljRfhccfcdZf\n" + //
            "wtgtChCwzqgLzjggqtHtjFHHFcnPfdRDfZZVcPfVZZfGnfdm\n" + //
            "vBTrRTTWGGmcTDVD\n" + //
            "SJMbbpWslJblSSNzNsztRChzqRCj\n" + //
            "gBHHCtVCSHMQlfFTQqCfmq\n" + //
            "WrpdwjbwbwQGlPqSqblP\n" + //
            "wWDncWrDDNdWNRjScScjpzvHZtBMZtJsvLVgvzssBsvs\n" + //
            "VppWpVfmZPBlnmrGBzhttMzMpctLLcChSh\n" + //
            "FwgLJvRdHcwMzSzjzc\n" + //
            "QvbgdQLQgDvsqvqRHRDdDQDBWmBGBflnVbZmZmmnBBWrmW\n" + //
            "SqShwLFCQGpDHCtZCWpW\n" + //
            "bdHPHjTbJdsMnPHPbdjgtnBlVlBnVgtZpDBpWV\n" + //
            "bdmPcjbjMNMvvHbTcQRNfRwRwLffwwqwNF\n" + //
            "zdRHTpQTQHQnpnnQRHTsNNlJSJWmzJmJllNmSG\n" + //
            "FBbRvLbFRwLqbbVgBVqqLFqJtJNcltsSGmgmGtNtgWmstm\n" + //
            "FLhhfvvVwvjqfLRBqLVqbwqZQrTTpHMHjdrpnnDPDQCdCrpC\n" + //
            "JgjzvbJCWgbjgGbJWjRhgNPGHHBMtqBStZZsHMSsBqtD\n" + //
            "cfQdwQFdQQppnVVnlFLLBsBZMhqPlPMMqBSHDtHM\n" + //
            "wnQhcnVddmdWgjvjmvRjjJ\n" + //
            "QpcRtndvsLcVJtRSzWSlWjzSbjjWBv\n" + //
            "qGZPqCTmGPqgGTCqHgCqZCPFWbbBNBMNBbdBMlWWrbjlMbFl\n" + //
            "qhHDGhCmPhZHgDmDVQthttRchLwLdwcc\n" + //
            "srpPMwlMmsrGFGswvDRhRWRDJJJchJ\n" + //
            "fSgBbCBNnBTTgCNLTCRJhRJVWhTcVVVFFJdR\n" + //
            "SbBnnLNZCLFQCZjnCnZFjPrzqmlMmmsrpzrlsmtt\n" + //
            "BBsfDfsBDSWRwlLqmWCpWcllrl\n" + //
            "nQMgMnnnhdntgMBrCdpNNLNlNqLqLl\n" + //
            "FnQFHzPQJjJGRBGvfR\n" + //
            "lRnVRFFlgMCRVwLgFZRnZQHWdcftHdmcJHmmMdzzfz\n" + //
            "DGBqGQbhhBDbSBpGDBzqdNHJdtmcWdqdmtcm\n" + //
            "bjbsBvjhSlVsPRgLQl\n" + //
            "dDLbRdTMRJMbFRzZBfzNSjtNBzBD\n" + //
            "PmgspqqVrppTVrvrsPhhfQwZBwNjNtNffzqqfwwN\n" + //
            "mCcmsngrPvpVTssCVsvsPLRRJllGFlnRGbMJMWWlJJ\n" + //
            "fGlGZHRRbwgPbZRRNCdcSWpncnQtQWlWcWpW\n" + //
            "JrTLJgVvVLQQvtSvQncQ\n" + //
            "JrrrmMTBVTmjBMrVjrshmJzgCfzRPCRZPGHfbwNPzbZHNH\n" + //
            "qqqlDDZzVVnNqHDDFFFNlQpzjrTvsvzTbgJQQggjJp\n" + //
            "cWPWcCmMfCMWdtPMhMbQQQjGGjpdvjTbjgjr\n" + //
            "WtMSBCtCwchChMfBWtcPnNVNqZZLDRNqTRnnlwHn\n" + //
            "mvQQnhBvhmvBmncmZBclTZTQccRFNFFdqFFgVqSRrgFrppNR\n" + //
            "MjzJPzGPfffMCjVVjfPHLCFRNFStqrdRSdqdNGRqNptq\n" + //
            "HDJHPjDJLfjbzfwPjCzCWWTwlmQhBnsWBvVsvBvZ\n" + //
            "RVjcshhscQhrVjhvzjVfDNnzGtftmDHFttFGGf\n" + //
            "qLcBCCMBJJbTdBDnNtdfnmDG\n" + //
            "WpZgLLclTclRwgjgsrwsvj\n" + //
            "shhhltNPcDtlNcNMcsctNtppLZvWWFLTFFZpTZDQgFLT\n" + //
            "dRgJVzRHbqnLpTWQvLLJfp\n" + //
            "mCVCdzqHndbqHCrVqRrmbwtNBsmPwNmScPgtPhBclw\n" + //
            "bDDZMDrFPsrsMcsrbJZJdMMGpSzpSbwRSSRGpCHCGzlhCC\n" + //
            "BWWNQjBLQVHhlGpSCmwj\n" + //
            "ffwnNwfgtnNgVVwfNWBWnFsMJTJTcPFJcTFDsrJstJ\n" + //
            "vQbQLQBpBvbvpHplHNTHWGZDngntZCQGgZhGhtjG\n" + //
            "rqccPPmcrffRmsmCjVgnrGChChDjgW\n" + //
            "fqRJsJMSlSzSWTbT\n" + //
            "brsjjJPJwrJJsrRRlllNQGWQpwppCtfGGtWzGGMQ\n" + //
            "ncBqqLTDnmLgVDZVnBDmdtVVtMzWWdMCQdpQWdVz\n" + //
            "hDZgTSSnTzNPNFSFPF\n" + //
            "VZVJJtWTsfTVVWsJhPWrCjzSBJlHSmjJCRlNSSlz\n" + //
            "CqMpwccgvvgLnvLbMMRRjBNHzjmGmwNHlmlN\n" + //
            "gLqqvpCDfVDrTfVW\n" + //
            "CNMDGNPPNJCGbLnTffsTLT\n" + //
            "tcBBRlrBdQrtmtWFjjbnrTjjFbjr\n" + //
            "cTQQhcmvcBRcwDMVDZZPPCJh\n" + //
            "mBCdgPLgZmLfGmfvGhtRQJWjtjQGQhtN\n" + //
            "pMwrVwbwHMsqcTWQhQWzggTTWp\n" + //
            "nnSMwrlrsmSZgvvmDd\n" + //
            "WNSzpCzNzqzNdmqrRHrrLHFrJH\n" + //
            "MtPfvnGMPnMcbnRtDHTRFFDrmJRQ\n" + //
            "PcBsfPPHPGGfcSzZjNjpNZZdCs\n" + //
            "mDCZVLDhWVSDCRvGtsGgGRHl\n" + //
            "JjPwPNdcPnjPdcwNltHzzGmgGJzQJJRQ\n" + //
            "dqfjnNmwmbmWrZMbMrThhB\n" + //
            "qtBpNZFpBGFNfZNPmZPmQmHrmPPPTz\n" + //
            "LLwJLvDvlWWLHdwDrVcCRcDVzzVVcV\n" + //
            "sMMwvgjnMvjvnlsvNFBqfGHFqHGjtSpS\n" + //
            "MmZZsFgwJTdTMdgmZdZRgFhDHhPQPPnRPhCrHhnnrPDD\n" + //
            "fBcLlNNpQCDLDJJC\n" + //
            "jSbWWlWpBpclWlWpNWlVBbWVdgwswFJmFJsGtdMggZFGbZwd\n" + //
            "CMVQVMLLMFGRCMWQttnqqwQwhqsm\n" + //
            "pJzlczSpPpPgmsqNhmPGDstq\n" + //
            "gZgTccZGGpzdpjclGRVMVRFRMFvHRLRdLf\n" + //
            "FMWMSBtStZqZWQtFtScWWSZmHPVJJVHwwlTgmgbzQwbwTJ\n" + //
            "jhGLhdjNjsLvLsshzHJPVdVmmbzHzdHJ\n" + //
            "jvDRNjnDNGRCzjLzZZpqnrFBSccWrMcB\n" + //
            "zggmthDDghHvtrdgrVWfSBRwTHLWHwsBWw\n" + //
            "PGGjpCjQnJQGJcJnnQpjFWVSsZWVLRZLBcsWSZBRWS\n" + //
            "FGQlpnJCbqqGGRCjjnlCqGMtdNmmmvdNmmmzvhbrmgMz\n" + //
            "TstvBTdgBhqTsdTcPlfCSrNMrNnrCNNSNNgp\n" + //
            "HwLQwQDZzDjnDbmMhNSnmm\n" + //
            "FZLVzLLQHRRzwWHjdPlJctlJtlsllhRs\n" + //
            "fBtPsMDDswHvBmmVdBlSBRcGGnhVhg\n" + //
            "LWJbrpFqpTLTTjqqNWlhnRGGSnhrcSdlRlsh\n" + //
            "JWNbbpjJzTbNNNJNJMvmvfZHvzDsHDCsZw\n" + //
            "LPGnPNLtwGhFFnJPfsqpVVszzpsP\n" + //
            "TcWdvlrcWddggrDBDDdDMmWzRJqfVQZqmsfZsRQzZfZzQJ\n" + //
            "TldWrMrDdlDCDdMTcwSLVCSShLNSwHjhGF\n" + //
            "JGsWWWQsJmPwQWbBPmccbcbqFfMMpFDVCDFVFVCDqqfFwD\n" + //
            "ZtLnlvLnNtvLndnCmfMVSmVCClfpVp\n" + //
            "zTzZtjnZNLNmZvdtznntHHZJbBRGBRQWcJGbGsbsJRPQWT\n" + //
            "MLmlMTPtQtMNlhbqbbqhflBB\n" + //
            "rcrvjpSvScbRbBvbDBPG\n" + //
            "ZZJzSHpzPrJzHFmMVMFmHCLNtV";

    private static String[] leaderboard = {"","",""};
    private static String current = "";
    private static int ans = 0;
    private static int newLineCounter = 0;

    public static void main(String args[]) {
        for (int i = 0; i < rucksacks.length(); i++) {
            if (rucksacks.charAt(i) != '\n') {
                current += rucksacks.charAt(i);
            } else {
                addToArray(current, leaderboard);
                current = "";
                newLineCounter += 1;
            }
            if (newLineCounter == 3) {
                ans += priorityAdd(leaderboard);
                for (int j = 0; j < leaderboard.length; j++){
                    leaderboard[j] = "";
                }
                newLineCounter = 0;
            }
        }
        
        addToArray(current, leaderboard);
        ans += priorityAdd(leaderboard);

        System.out.println(ans);
    }

    public static void addToArray(String str, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("")) {
                arr[i] = str;
                break;
            }
        }
    }

    public static int priorityAdd(String[] ruck) {
        String one = ruck[0];
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        int total = 0;

        for (int i = 0; i < ruck[1].length(); i++) {
            set1.add(ruck[1].charAt(i));
        }
        for (int i = 0; i < ruck[2].length(); i++) {
            set2.add(ruck[2].charAt(i));
        }

        for (int i = 0; i < one.length(); i++) {
            if (set1.contains(one.charAt(i)) && set2.contains(one.charAt(i))) {
                total += priorityCheck(one.charAt(i));
                break;
            }
        }
        System.out.println(total);
        return total;
    }

    public static int priorityCheck(char letter) {
        int value = (int) letter;
        if (value > 90) {
            value -= 96;
        } else {
            value -= 38;
        }
        return value;
    }
}
